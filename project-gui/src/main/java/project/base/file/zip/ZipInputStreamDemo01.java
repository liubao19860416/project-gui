package project.base.file.zip;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 解压缩单个文件
 * 
 * @author Liubao
 * @2015年3月23日
 * 
 */

public class ZipInputStreamDemo01 {
    public static void main(String args[]) throws Exception {
        File zipFile = new File("d:" + File.separator + "mldn.zip");
        ZipInputStream input = null;
        input = new ZipInputStream(new FileInputStream(zipFile));
        ZipEntry entry = input.getNextEntry();
        System.out.println(" " + entry.getName());
        input.close();
    }
};