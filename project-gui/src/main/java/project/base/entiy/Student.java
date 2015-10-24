package project.base.entiy;


/**
 * 实体bean
 * 
 * @author Liubao
 * @2014年12月4日
 * 
 */
public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int en, cn, ma;
    private int sum;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + sum;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        if (!(obj instanceof Student)) {
            Student other = (Student) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (sum != other.sum)
                return false;
        }
        return true;
    }


    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    
    public Student(String name, int en, int cn, int ma) {
        super();
        this.name = name;
        this.en = en;
        this.cn = cn;
        this.ma = ma;
        this.sum = en + cn + ma;
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

    @Override
    public String toString() {
        return "Student [name=" + name + ", en=" + en + ", cn=" + cn + ", ma="
                + ma + ", sum=" + sum + "]";
    }

    @Override
    public int compareTo(Student o) {
        int num = new Integer(this.sum).compareTo(new Integer(o.sum));
        // int num = new Integer(this.getSum()).compareTo(new
        // Integer(o.getSum()));
        return num == 0 ? this.name.compareTo(o.name) : num;
    }
}
