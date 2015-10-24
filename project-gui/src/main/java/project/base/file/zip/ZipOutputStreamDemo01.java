package project.base.file.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;

/**
 * 生成蛋单个压缩文件
 * 
 * @author Liubao
 * @2015年3月23日
 * 
 */
public class ZipOutputStreamDemo01 {
    public static void main(String args[]) throws Exception {
        File file = new File("d:" + File.separator + "mldn.txt");
        File zipFile = new File("d:" + File.separator + "mldn.zip");
        InputStream input = new FileInputStream(file);
        ZipOutputStream zipOut = null;
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        zipOut.putNextEntry(new ZipEntry(file.getName()));
        zipOut.setComment("www.mldnjava.cn");
        int temp = 0;
        while ((temp = input.read()) != -1) {
            zipOut.write(temp);
        }
        input.close();
        zipOut.close();
    }
};