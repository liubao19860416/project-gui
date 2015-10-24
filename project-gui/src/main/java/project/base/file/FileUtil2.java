package project.base.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileUtil2 {

    private static String DEFAULT_BLANKCHAR1=" ";
    private static String DEFAULT_BLANKCHAR2="|";
    private static String DEFAULT_SUFFIX=".java";

    public static void main(String[] args) {
        File dir = new File("d:\\temp\\");
        List<String> list=new ArrayList<String>();
        
        //listDirFiles(dir, list, DEFAULT_SUFFIX);
        
        listDirFiles(dir, list, null);
        //输出
        //list.remove(0);
        for (String str : list) {
            System.out.println(str);
        }
        
        File destFile=new File("d:\\temp\\fileList.txt");
        writeListToFile(destFile, list);
    }
    
    // 私有构造方法，防止类的实例化，因为工具类不需要实例化。 　
    private FileUtil2() {
    }

    /**
     * 读取文件内容，返回一个字符串
     */
    public static String readFileToString(InputStream inputStream)
            throws UnsupportedEncodingException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(inputStream, "utf-8"));
        StringBuffer fileString = new StringBuffer();
        try {
            String readLine = null;
            while ((readLine = bufferedReader.readLine()) != null) {
                fileString.append(readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileString.toString();
    }

    /**
     * 判断指定的文件是否存在。 要判断的文件的文件名
     */
    public static boolean isFileExist(String fileName) {
        // return new File(fileName).isFile();
        return new File(fileName).exists();
    }

    /**
     * 删除文件夹及其下面的子文件夹
     */
    public static void deleteDir(File dir) throws IOException {
        if (dir.isFile())
            throw new IOException(
                    "IOException -> BadInputException: not a directory.");
        File[] files = dir.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                if (file.isFile()) {
                    // System.out.println("清理文件=="+file.toString());
                    file.delete();
                } else {
                    deleteDir(file);
                }
            }
        }
        // TODO
        if (dir.length() == 0) {
            dir.delete();
        }
    }

    /**
     * @函数介绍：复制文件，支持把源文件内容追加到目标文件末尾
     * @参数：src 源文件；dst 目标文件,append true:追加到末尾；false清空目标文件
     */
    public static void copy(File src, File dst, boolean append)
            throws Exception {
        int BUFFER_SIZE = 4096;
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(src), BUFFER_SIZE);
            out = new BufferedOutputStream(new FileOutputStream(dst, append),
                    BUFFER_SIZE);
            byte[] buffer = new byte[BUFFER_SIZE];
            int len = 0;
            while ((len = in.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                in = null;
            }
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                out = null;
            }
        }
    }

    /**
     * 显示当前文件夹下面的文件列表
     */
    public static void listDirFiles(File dir, List<String> list,final String suffix) {
        list.add(dir.getAbsolutePath());
        File[] files = null;
        if (dir.isDirectory()) {
            files = dir.listFiles();
        }

        // 添加文件名称过滤器
        files = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                if(suffix!=null){
                    return name.endsWith(suffix);
                }
                return true;
            }
        });

        int count = 0;
        String fileName = null;
        for (File file : files) {
            fileName = "";
            if (!file.isDirectory()) {
                fileName += addBlankChar(count + 2, null, null);
                fileName += file.getAbsolutePath();
            } else {
                fileName += addBlankChar(count, null, null);
                fileName += file.getAbsolutePath();
                listDirFiles(file, list,suffix);
            }
            if(file.isDirectory()){
                continue;
            }
            list.add(fileName);
        }
    }
    
    /**
     * 将list数据写入到文件中去
     */
    public static void writeListToFile(File destFile, List<String> list) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destFile)));
            for (Iterator<String> it = list.iterator(); it.hasNext();) {
                try {
                    bufferedWriter.write(it.next());
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                } catch (IOException e) {
                    throw new RuntimeException(" ");
                }
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }finally{
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                bufferedWriter = null;
            }
        }

    }
    
    /**
     * 添加指定规则的指定符号
     */
    private static String addBlankChar(int blankNum,String blankChar1,String blankChar2) {
       
        if(blankChar1==null){
            blankChar1=DEFAULT_BLANKCHAR1;
        }else{
            blankChar1=blankChar1.charAt(0)+"";
        }
        if(blankChar2==null){
            blankChar2=DEFAULT_BLANKCHAR2;
        }else{
            blankChar2=blankChar2.charAt(0)+"";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(blankChar1);
        for (int i = 0; i < blankNum; i++) {
            sb.append(blankChar2);
        }
        return sb.toString();
    }
    
    
}
