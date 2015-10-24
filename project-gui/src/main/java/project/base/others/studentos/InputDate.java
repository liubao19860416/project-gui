package project.base.others.studentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputDate {

    private BufferedReader buf = null;

    public InputDate() {
        this.buf = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getString(String info) {
        String str = null;

        boolean flag = true;

        // while (str==null||str.equals("\n")||str.equals("")) {
        while (flag) {
            try {
                System.out.println(info);
                str = this.buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // if (str.equals("")) {
            // flag= true;
            // }
            // if (str.matches("\\S{1,10}") || str.matches("\\w{1,20}")) {
            if (str.matches("\\w{1,20}")) {
                flag = false;
            } else {
                System.out
                        .println("��������ַ�λ�����20����ĸ,�����ַ���ݸ�ʽ����ȷ��");
            }
        }
        return str;
    }

    public int getInt(String info, String err) {
        int temp = 0;
        boolean flag = true;
        while (flag) {
            String str = null;
            System.out.println(info);
            try {
                str = /* this. */buf.readLine();
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

    public float getFloat(String info, String err) {
        float temp = 0.0f;
        boolean flag = true;
        while (flag) {
            String str = null;
            System.out.println(info);
            try {
                str = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (str.matches("\\d+\\.?\\d*")) {// ����"\\d+ .? \\d*"
                temp = Float.parseFloat(str);
                flag = false;
            } else {
                System.out.print(err);
            }
        }
        return temp;
    }

    public char getChar(String info, String err) {
        char temp = ' ';
        boolean flag = true;
        while (flag) {
            String str = null;
            System.out.println(info);
            try {
                str = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (str.matches("\\w")) {
                temp = str.charAt(0);
                flag = false;
            } else {
                System.out.print(err);
            }
        }
        return temp;
    }

    public Date getDate(String info, String err) {
        Date temp = null;
        boolean flag = true;
        while (flag) {
            String str = null;
            System.out.println(info);
            try {
                str = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (str.matches("\\d{4}-\\d{2}-\\d{2}")) { 
                try {
                    temp = new SimpleDateFormat("yyyy-MM-dd").parse(str);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                flag = false;
            } else {
                System.out.print(err);
            }
        }
        return temp;
    }

    public boolean getBollean(String Yes_or_No) {

        String str = Yes_or_No;
        Boolean flag = null;

        // if
        // ("y".equalsIgnoreCase(str)||"y".equalsIgnoreCase(str.charAt(0)+"")) {
        // ������switch���ʵ�֡�
        if ("y".equalsIgnoreCase(str)) {
            flag = true;
        } else if ("n".equalsIgnoreCase(str)) {
            flag = false;
        } else {
            throw new RuntimeException(
                    "�������ѡ���ʽ����ȷ��������\"X\" or \"Y\"");
        }

        return flag;
    }
}
