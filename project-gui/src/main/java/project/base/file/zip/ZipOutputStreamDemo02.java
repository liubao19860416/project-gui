package project.base.file.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 压缩文件夹列表
 * 
 * @author Liubao
 * @2015年3月23日
 * 
 */
public class ZipOutputStreamDemo02 {
    public static void main(String args[]) throws Exception {
        File file = new File("d:" + File.separator + "mldn");
        File zipFile = new File("d:" + File.separator + "mldndir.zip");
        InputStream input = null;
        ZipOutputStream zipOut = null;
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        zipOut.setComment("www.mldnjava.cn");
        int temp = 0;
        if (file.isDirectory()) {
            File lists[] = file.listFiles();
            for (int i = 0; i < lists.length; i++) {
                input = new FileInputStream(lists[i]);
                zipOut.putNextEntry(new ZipEntry(file.getName()
                        + File.separator + lists[i].getName()));
                while ((temp = input.read()) != -1) {
                    zipOut.write(temp);
                }
                input.close();
            }
        }
        zipOut.close();
    }
};