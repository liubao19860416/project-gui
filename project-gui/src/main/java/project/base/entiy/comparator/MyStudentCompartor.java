package project.base.entiy.comparator;

import java.util.Comparator;

import project.base.entiy.Student;
/**
 * 自定义的比较器，用来定义需要比较的对象大小的规则
 * @author Liubao
 * @2014年12月4日
 *
 */
public class MyStudentCompartor implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getName().compareTo(o2.getName());
        // int num = new Integer(this.getSum()).compareTo(new
        // Integer(o.getSum()));
        return num == 0 ? new Integer(o1.getAge()).compareTo(new Integer(o2.getAge())) : num;
    }

}
