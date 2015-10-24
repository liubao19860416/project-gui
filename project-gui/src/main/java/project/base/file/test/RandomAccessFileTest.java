package project.base.file.test;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;

import project.base.entiy.Employee;
/**
 * RandomAccessFile测试类，支持断点续传类似的功能
 * @author Liubao
 * @2014年12月4日
 *
 */
public class RandomAccessFileTest {
    public static void main(String[] args) throws Exception {
        String filepath = "D:\\temp\\001.java";
        String outFile = "D:\\temp\\001_copy.txt";
        
        //第一次读取位置
        long pos = firstRead(filepath, outFile);
        //第二次继续读取
        continueRead(filepath, outFile, pos);

        //================第二部分===========================
        
        //测试基本属性信息-写操作
        Employee e1 = new Employee("zhangsan", 23);
        Employee e2 = new Employee("Lisi", 24);
        Employee e3 = new Employee("Wangwu", 25);
        RandomAccessFile ra = new RandomAccessFile("d:\\temp\\1.txt", "rw");
        ra.write(e1.getName().getBytes());
        ra.writeInt(e1.getAge());
        ra.write(e2.getName().getBytes());
        ra.writeInt(e2.getAge());
        ra.write(e3.getName().getBytes());
        ra.writeInt(e3.getAge());
        ra.close();
        
        //读操作
        RandomAccessFile raf = new RandomAccessFile("d:\\temp\\1.txt", "r");
        int len = 8;
        raf.skipBytes(12);
        String str = "";
        for (int i = 0; i < len; i++){
            str = str + (char) raf.readByte();
        }
        System.out.println("name:" + str);
        System.out.println("age:" + raf.readInt());

        raf.seek(0);
        str = "";
        for (int i = 0; i < len; i++){
            str = str + (char) raf.readByte();
        }
        System.out.println("name:" + str);
        System.out.println("age:" + raf.readInt());

        raf.skipBytes(12);
        str = "";
        for (int i = 0; i < len; i++){
            str = str + (char) raf.readByte();
        }
        System.out.println("name:" + str.trim());
        System.out.println("age:" + raf.readInt());
        
        //关闭
        raf.close();
    }

    private static long firstRead(String filepath, String out) throws Exception {
        RandomAccessFile file = new RandomAccessFile(filepath, "r");
        long fileLen = file.length();
        FileOutputStream outStream = new FileOutputStream(out);
        int sum = 0;
        byte[] cache = new byte[1024];
        int len = -1;
        while ((len = file.read(cache)) != -1 && sum < fileLen / 2) {
            outStream.write(cache, 0, len);
            sum += len;
        }
        outStream.close();
        file.close();

        return sum;
    }

    public static void continueRead(String filepath, String out, long pos)throws Exception {
        RandomAccessFile file = new RandomAccessFile(filepath, "r");
        file.seek(pos);
        FileOutputStream outStream = new FileOutputStream(out, true);
        byte[] cache = new byte[1024];
        int len = -1;
        while ((len = file.read(cache)) != -1) {
            outStream.write(cache, 0, len);
        }
        outStream.close();
        file.close();
    }
}