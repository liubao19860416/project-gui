package project.base.file.test;

import java.io.File;
import java.util.Date;

public class FileTest {
    
    public static void main(String[] args) {
        File file = new File("d:\\temp/005.jpg");
        if (file.exists())
            file.delete();
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("File name:" + file.getName());
        System.out.println("File path:" + file.getPath());
        System.out.println("Abs path:" + file.getAbsolutePath());
        System.out.println("Parent:" + file.getParent());
        System.out.println(file.exists() ? "exists" : "does not exist");
        System.out.println(file.canWrite() ? "is writeable" : "is not writeable");
        System.out.println(file.canRead() ? "is readable" : "is not readable");
        System.out.println(file.isDirectory() ? "is " : "is not" + " a directory");
        System.out.println(file.isFile() ? "is normal file" : "might be a named pipe");
        System.out.println(file.isAbsolute() ? "is absolute" : "is not absolute");
        System.out.println("File last modified:" + file.lastModified());
        System.out.println("File last modified:" + new Date(file.lastModified()));
        System.out.println("File size:" + file.length() + " Bytes");
    }
    
    
    
    
}