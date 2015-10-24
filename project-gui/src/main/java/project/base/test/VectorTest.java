package project.base.test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import project.base.entiy.Person;

/**
 * Vector测试类
 * 
 * @author Liubao
 * @2014年12月2日
 * 
 */
public class VectorTest {

    public static void main(String[] args) {

        List<Object> ar = new ArrayList<>();
        ar.add(3);
        ar.add(new Person(23, "zhangsan"));
        ar.add(new Person(23, "zhangsan"));
        ar.add(new Person(23, "zhangsan"));
        ar.add("zhangsan");
        System.out.println(ar);
        for (Object object : ar) {
            System.out.println(object);

        }

        Vector<String> vc = new Vector<>();
        vc.add("hafsdjk");
        vc.add("hafsdjk");
        vc.add("hafsdjk");
        System.out.println(vc);
        //输出方式
        Enumeration<String> en = vc.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

    }

}
