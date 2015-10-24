package project.base.entiy.comparator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import project.base.entiy.Student;

/**
 * Student实体对应的工具类
 * 
 * 获取一个默认的逆序比较器：Comparator<Student> cmp = Collections.reverseOrder();
 * 
 * @author Liubao
 * @2014年12月4日
 * 
 */
public class StudentTool {
    
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<Student>();
        for (int i = 0; i < 10; i++) {
            Student st = new Student("liubao" + i, 55 + i, 66 + i, 77 + i);
            students.add(st);
        }
        File destFile = new File("d:\\temp\\stu.info");
        write2file(students, destFile);
        
        //获取一个默认的逆序比较器
        Comparator<Student> comparator = Collections.reverseOrder();
        Set<Student> students2 = getStudents(comparator);
        write2file(students2, destFile);
        
    }
    
    public static Set<Student> getStudents() {
        return getStudents(null);
    }

    /**
     * 获取输入的Student对象的set集合信息
     * @param comparator
     * @return
     */
    public static Set<Student> getStudents(Comparator<Student> comparator) {
        System.out.println("请输入学生信息：");
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        Set<Student> stus = null;
        if (comparator == null) {
            stus = new TreeSet<Student>();
        } else {
            //可以添加比较器
            stus = new TreeSet<Student>(comparator); 
        }
        
        String line = null;
        try {
            while ((line = bufr.readLine()) != null) {
                if ("over".equals(line)){
                    break;
                }
                String[] info = line.split(",");
                Student stu = new Student(info[0], Integer.parseInt(info[1]),
                        Integer.parseInt(info[2]), Integer.parseInt(info[3]));
                stus.add(stu);
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(bufr!=null){
                    bufr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                bufr=null;
            }
        }
        return stus;
    }

    /**
     * 将学生信息set集合，写入到文件中,这里会覆盖
     */
    public static void write2file(Set<Student> students, File destFile) {
        BufferedWriter bufw = null;
        try {
            System.setOut(new PrintStream(destFile));
            bufw = new BufferedWriter(new OutputStreamWriter(System.out,"UTF-8"));
            for (Student stu : students) {
                // 设置输出流
                bufw.write(stu.toString());
                bufw.newLine();
                bufw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufw != null) {
                    bufw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                bufw = null;
            }
        }
    }

}
