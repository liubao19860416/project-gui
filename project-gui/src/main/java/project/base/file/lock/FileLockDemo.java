package project.base.file.lock;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * 文件锁的使用方法
 * 
 * @author Liubao
 * @2015年4月6日
 * 
 */
public class FileLockDemo {
    
    public static void main(String args[]) throws Exception {
        File file = new File("d://temp" + File.separator + "mldn.txt");
        FileOutputStream output = null;
        output = new FileOutputStream(file, true);
        FileChannel fout = null;
        // 得到通道
        fout = output.getChannel();
        // 进行独占锁的操作
        FileLock lock = fout.tryLock(); 
        if (lock != null) {
            System.out.println(file.getName() + "文件锁定300秒");
            Thread.sleep(300000);
            // 释放
            lock.release(); 
            System.out.println(file.getName() + "文件解除锁定。");
        }
        fout.close();
        output.close();
    }

}