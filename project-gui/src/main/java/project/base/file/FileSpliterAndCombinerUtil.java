package project.base.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
/**
 * 文件合并与拆分工具类
 * @author Liubao
 * @2014年12月4日
 *
 */
public class FileSpliterAndCombinerUtil {

    public static void main(String[] args) {
        String splitFileSuffix=".part";
        File sourceFile=new File("d:\\temp\\000.mp3");
        //spiltFiles(sourceFile, splitFileSuffix);

        String splitFilePath="D:\\temp\\part";
        String combinedFileName="合并文件.mp3";
        //combineFileBySuffix(splitFilePath, splitFileSuffix, combinedFileName);

        //合并文件方式2
        combinedFileName="合并文件2.mp3";
        combineFileBySequenceInputStream(splitFilePath, combinedFileName);
    }

    /**
     * 合并文件方法1：根据拆分文件的后缀名及路径进行合并文件
     * 
     * 读取文件的顺序需要进行操作吗？
     */
    public static void combineFileBySuffix(String splitFilePath,final String splitFileSuffix,String combinedFileName) {
        //这个命名为默认规则
        File combinedFilePath = new File(splitFilePath + File.separator + "combin"+ File.separator);
        File combinedFile = new File(combinedFilePath,combinedFileName);
        if(!combinedFilePath.exists()){
            combinedFilePath.mkdirs();
        }
        if(!combinedFile.exists()){
            try {
                combinedFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        //覆写的系统自带的文件名称过滤器，返回以".part"结尾的文件
        File[] fileList = new File(splitFilePath).listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(splitFileSuffix);
            }
        });
        
        FileOutputStream fos = null;
        FileInputStream fis = null;
        //指定合并后的文件
        try {
            fos = new FileOutputStream(combinedFile);
            for (File file : fileList) {
                fis = new FileInputStream(file);
                byte[] buf = new byte[1024];
                int len = -1;
                while ((len = fis.read(buf)) != -1) {
                    fos.write(buf, 0, len);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }finally{
            try {
                if(fos!=null){
                    fos.close();
                }
                if(fis!=null){
                    fis.close();
                }
            } catch (IOException e1) {
                throw new RuntimeException(" ");
            }finally{
                fos=null;
                fis=null;
            }
        }

    }

    /**
     * 合并文件方法2：根据拆分文件路径进行合并文件
     */
    public static void combineFileBySequenceInputStream(String splitFilePath,String combinedFileName) {
        //这个命名为默认规则
        File combinedFilePath = new File(splitFilePath + File.separator + "combin"+ File.separator);
        File combinedFile = new File(combinedFilePath,combinedFileName);
        
        if(!combinedFilePath.exists()){
            combinedFilePath.mkdirs();
        }
        if(!combinedFile.exists()){
            try {
                combinedFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        File[] fileList = new File(splitFilePath).listFiles();
        List<FileInputStream> list = new ArrayList<FileInputStream>();
            for (File file : fileList) {
                try {
                    if(file.isDirectory()){
                        continue;
                    }
                    list.add(new FileInputStream(file));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
            }
        }

        //枚举类
        final Iterator<FileInputStream> it = list.iterator(); 
        Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
            @Override
            public boolean hasMoreElements() {
                return it.hasNext();
            }
            @Override
            public FileInputStream nextElement() {
                return it.next();
            }
        };

        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(combinedFile);
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = sis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fos!=null){
                    fos.close();
                }
                if(sis!=null){
                    sis.close();
                }
            } catch (IOException e1) {
                throw new RuntimeException(" ");
            }finally{
                fos=null;
                sis=null;
            }
        }

    }


    /**
     * 拆分文件方法：根据拆分文件名称进行拆分
     */
    public static void spiltFiles(File sourceFile,String splitFileSuffix) {
        File destFilePath = new File(sourceFile.getParentFile(), File.separator +"part"+File.separator);
        if (!sourceFile.exists()) {
            throw new RuntimeException("您输入的文件不存在！！！"+sourceFile);
        }
        if (!destFilePath.exists()) {
            destFilePath.mkdir();
        }
        FileOutputStream fos = null;
        FileInputStream fis = null;

        //设置每个文件的默认大小
        byte[] buf = new byte[1024 * 1024];
        int len = -1;
        int count = 1;
        try {
            fis = new FileInputStream(sourceFile);
            while ((len = fis.read(buf)) != -1) {
                fos = new FileOutputStream(destFilePath.getAbsolutePath() + File.separator+ count++ + splitFileSuffix);
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(" ");
        }finally{
            try {
                if(fos!=null){
                    fos.close();
                }
                if(fis!=null){
                    fis.close();
                }
            } catch (IOException e1) {
                throw new RuntimeException(" ");
            }finally{
                fos=null;
                fis=null;
            }
        }
    }

}
