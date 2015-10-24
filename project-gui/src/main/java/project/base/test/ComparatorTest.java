package project.base.test;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import project.base.entiy.Person;
public class ComparatorTest {

    public static void main(String[] args) {
        
        TreeMap<Person, String> map1 = new TreeMap<Person, String>(new myCompare());
        map1.put(new Person(21, "lisi8"), "002");
        map1.put(new Person(25, "lisi2"), "003");
        map1.put(new Person(24, "lisi3"), "005");
        map1.put(new Person(29, "lisi4"), "005");
        map1.put(new Person(21, "lisi5"), "005");

        Set<Map.Entry<Person, String>> entrySet1 = map1.entrySet();
        for (Iterator<Entry<Person, String>> it = entrySet1.iterator(); it
                .hasNext();) {
            Entry<Person, String> per = it.next();
            System.out.println(per.getKey() + "---->>" + per.getValue());
        }

        Collection<String> values1 = map1.values();
        for (Iterator<String> it = values1.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}

/**
 * 自定义比较器
 */
class myCompare implements Comparator<Person> {
    @Override
    public int compare(Person per1, Person per2) {
        int num = per1.getName().compareTo(per2.getName());
        if (num == 0)
            return new Integer(per1.getAge()).compareTo(new Integer(per2
                    .getAge()));
        return num;
    }
}