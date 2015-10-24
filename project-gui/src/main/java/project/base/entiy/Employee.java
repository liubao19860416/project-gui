package project.base.entiy;

/**
 * 测试实体bean
 * 
 * @author Liubao
 * @2014年12月4日
 * 
 */
public class Employee {

    // 将名字的长度固定为10位
    public static final int NAME_LENGTH = 10;

    private String name;
    private int age;

    public Employee(String name, int age) {
        super();
        if (name.length() >= NAME_LENGTH) {
            this.name = name.substring(0, NAME_LENGTH);
        } else {
            while (name.length() < NAME_LENGTH)
                name = name + "\u0000";
            this.name = name;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
