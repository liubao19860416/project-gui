package project.base.file.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * 解压缩包含文件夹列表的zip文件
 * 
 * @author Liubao
 * @2015年3月23日
 * 
 */
public class ZipInputStreamDemo02 {
    public static void main(String args[]) throws Exception {
        File file = new File("d:" + File.separator + "mldndir.zip");
        File outFile = null;
        ZipFile zipFile = new ZipFile(file);
        ZipInputStream zipInput = null;
        OutputStream out = null;
        InputStream input = null;
        ZipEntry entry = null;
        zipInput = new ZipInputStream(new FileInputStream(file));
        while ((entry = zipInput.getNextEntry()) != null) {
            System.out.println("��ѹ��" + entry.getName() + "�ļ���");
            outFile = new File("d:" + File.separator + entry.getName());
            if (!outFile.getParentFile().exists()) {
                outFile.getParentFile().mkdir();
            }
            if (!outFile.exists()) {
                outFile.createNewFile();
            }
            input = zipFile.getInputStream(entry);
            out = new FileOutputStream(outFile);
            int temp = 0;
            while ((temp = input.read()) != -1) {
                out.write(temp);
            }
            input.close();
            out.close();
        }
        input.close();
    }
};