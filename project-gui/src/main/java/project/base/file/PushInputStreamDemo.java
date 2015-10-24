package project.base.file;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * 回退流测试
 * 
 * @author Liubao
 * @2015年3月23日
 * 
 */
public class PushInputStreamDemo {
    public static void main(String args[]) throws Exception {
        String str = "www.mldnjava.cn";
        PushbackInputStream push = null;
        ByteArrayInputStream bai = null;
        bai = new ByteArrayInputStream(str.getBytes());
        push = new PushbackInputStream(bai);
        int temp = 0;
        while ((temp = push.read()) != -1) {
            if (temp == '.') {
                push.unread(temp);
                temp = push.read();
                System.out.print("���˻�" + (char) temp + "��");
            } else {
                System.out.print((char) temp);
            }
        }
    }
};