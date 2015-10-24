package project.base.others.class_vote_demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 获取数据
 *
 */
public class get_Data {

    private BufferedReader buf = null;

    public get_Data() {
        this.buf = new BufferedReader(new InputStreamReader(System.in));

    }

    public int get_Tickets(String info, String err) {
        int temp = 0;
        boolean flag = true;
        while (flag) {
            String str = null;
            System.out.println(info);
            try {
                str = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (str.matches("\\d+")) {
                temp = Integer.parseInt(str);
                flag = false;
            } else {
                System.out.print(err);
            }
        }
        return temp;
    }
}
