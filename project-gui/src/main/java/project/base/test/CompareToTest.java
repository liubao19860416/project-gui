package project.base.test;

/**
 * CompareTo方法测试两个字符串创比较的返回值是否为两个字符的对应的首歌不同字母的ascii码值之差
 * 
 * @author Liubao
 * @2014年12月2日
 * 
 */
public class CompareToTest {

    public static void main(String[] args) {
        String str1 = "fbd";
        String str2 = "1bd";
        char a = 'f';
        char b = '1';

        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(((int) a - (int) b));
        System.out.println(str1.compareTo(str2));
    }

}
