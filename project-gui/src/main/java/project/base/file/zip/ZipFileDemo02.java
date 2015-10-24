package project.base.file.zip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFileDemo02 {
    public static void main(String args[]) throws Exception {
        File file = new File("d:" + File.separator + "mldn.zip");
        File outputFile = new File("d:" + File.separator + "mldn_unzip.txt");
        ZipFile zipFile = new ZipFile(file);
        System.out.println(" " + zipFile.getName());
        ZipEntry entry = zipFile.getEntry("mldn.txt");
        OutputStream out = new FileOutputStream(outputFile);
        InputStream input = zipFile.getInputStream(entry);
        int temp = 0;
        while ((temp = input.read()) != -1) {
            out.write(temp);
        }
        input.close();
        out.close();
        zipFile.close();
    }
};