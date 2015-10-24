package project.base.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import project.base.file.filter.MyFileFilter;

/**
 * 文件操作相关工具类
 * 
 * @author Liubao
 * @2014年12月3日
 * 
 */
public class FileUtil {
    
    public static final String[] PREXS = { ".txt", ".doc", ".java", ".info",".class" }; 
    public static final String DEFAULT_BLANKSTR = "--";
    public static final String DEFAULT_DELETEDFILENAME = "d:\\temp\\deletedFileNames.txt";
    private static int totalFileCount=0;
    private static int totalForderCount=0;
    
    public static void main(String[] args) {
        String fileDir="d:\\temp";
        //显示文件列表
        listFileByFileDir1(fileDir);
        System.out.println("\n文件总数量为："+totalFileCount);
        System.out.println("\n文件夹总数量为："+totalForderCount);
        
        String suffix=".class";
        fileDir="C:\\Users\\admin\\Desktop\\JavaCode\\JavaSE";
        //删除指定后缀的文件
        deleteFileBySuffix(fileDir, suffix,DEFAULT_DELETEDFILENAME);
        
        File file=new File(fileDir);
        String[] prexs = { ".jpg" }; 
        List<File> list=new ArrayList<File>();
        listFileByFile(file, list,prexs);
        printList(list);
        
        list=new ArrayList<File>();
        FileFilter fileFilter=new MyFileFilter(PREXS);
        listFilesByFileFilter(file, list, fileFilter);
        printList(list);
        
        String blankStr = "--";
        int count=5;
        String addBlank = addBlank(count,blankStr);
        System.out.println(addBlank);
        
    }
    
    /**
     * 添加了自定义的文件过滤器
     */
    public static void listFilesByFileFilter(File file, List<File> list,FileFilter fileFilter ) {
        list.add(file);
        File[] childrens = file.listFiles(fileFilter); 
        for (int i = 0; i < childrens.length; i++) {
            if (childrens[i].isDirectory()) {
                listFilesByFileFilter(childrens[i], list,fileFilter);
            } else {
                list.add(childrens[i]);
            }
        }
    }
    
    /**
     * 没有添加文件过滤器,是通过PREXS获取符合其规则的文件列表
     */
    public static void listFileByFile(File file, List<File> list,String[] prexs) {
        if(prexs==null){
            prexs=PREXS;
        }
        //添加根目录文件名
        list.add(file);
        File[] childrens = file.listFiles(); 
        if(childrens.length>0){
            for (int i = 0; i < childrens.length; i++) {
                if (childrens[i].isDirectory()) {
                    listFileByFile(childrens[i], list,prexs);
                    continue;
                } else {
                    for (int index = 0; index < prexs.length; index++) {
                        if (childrens[i].getName().endsWith((prexs[index]))) {
                            list.add(childrens[i]);
                            break;
                        }
                    }
                }
            }
        }
    }
   
    /**
     * 显示当前目录下的所有文件名信息
     * 一个字节等于8位二进制数，在UTF-8编码中，一个英文字符等于一个字节，一个中文（含繁体）等于三个字节
     * @param filePath
     */
    public static void listFileByFileDir1(String fileDir) {
        File root = new File(fileDir);
        File children[] = root.listFiles();
        int folderCount = 0;
        for (File file : children) {
            if (!file.isDirectory()) {
                totalFileCount++;
                System.out.println(file.getName() + "\t,字节（Byte）大小为： " + file.length()+"");
            }else{
                totalForderCount++;
                folderCount = (file.list() == null) ? 0 : file.list().length;
                System.out.println("\n"+file.getName() + "\t" + folderCount+"\n");
                listFileByFileDir1(file.getPath());
                continue;
            }
        }
    }
    /**
     * 根据文件名后缀，删除指定的文件
     */
    public static void deleteFileBySuffix(String fileDir,String suffix,String deletedFileName) {
        List<String> list=new ArrayList<String>();
        
        //获取需要删除的文件的列表
        getFilePathListBySuffix(new File(fileDir).listFiles(),suffix,list);
        
        //将需要删除的文件名称写到一个文件中
        BufferedOutputStream buf=null;
        if(deletedFileName==null){
            deletedFileName=DEFAULT_DELETEDFILENAME;
        }
        try {
            File file = new File(deletedFileName);
            if(!file.exists()){
                file.createNewFile();
            }
            OutputStream out=new FileOutputStream(file,true);
            buf=new BufferedOutputStream(out);
            
            for ( String filePath : list) {
                buf.write(filePath.getBytes());
                
                //添加换行
                buf.write(System.getProperties().getProperty("file.separator").getBytes());
                buf.write("\r\n".getBytes());
                
                new File(filePath).delete();
                System.out.println("该次操作删除文件为："+filePath);
            }
        } catch ( IOException e) {
            e.printStackTrace();
        }finally{
            if(buf!=null){
                try {
                    buf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally{
                    buf=null;
                }
            }
        }
        
        System.out.println("该次操作共删除文件数目为："+list.size());
    }

    /**
     * 获取符合指定后缀类型的文件全路径名称列表
     */
    private static List<String> getFilePathListBySuffix(File[] fileList,String suffix, List<String> list) {
        for (File file : fileList) {
            if (file.isDirectory()) {
                list=getFilePathListBySuffix(file.listFiles(),suffix,list);
                //listFileByFileDir1(file.getPath());
                continue;
            }else{
                if(file.getName().endsWith(suffix)){
                    list.add(file.getAbsolutePath());
                }
            }
        }
        return list;
    }
    
    /**
     * 添加制定数量的空格
     */
    private static String addBlank(int count, String blankStr) {
        if (blankStr == null || blankStr == "") {
            blankStr = DEFAULT_BLANKSTR;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(blankStr);
        }
        return sb.toString();
    }
    
    /**
     * 打印List集合
     */
    private static <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }
    
    
    
}