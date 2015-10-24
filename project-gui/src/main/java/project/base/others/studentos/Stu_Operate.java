package project.base.others.studentos;

import java.io.File;

import project.base.entiy.Student;

public class Stu_Operate {

    public static void add() {
        InputDate input = new InputDate();
        FileOperator operator = new FileOperator("d:" + File.separator + "temp"
                + File.separator + "stu.info");
        Student stu = (Student) operator.load();

        boolean flag = true;

        if (stu != null) {
            String Yes_or_No = input.getString("���������ѡ��Y-or-N����");

            flag = input.getBollean(Yes_or_No);

            if (flag) {
                String name = input.getString("����������");
                int age = input.getInt("���������䣺", "������Ĳ������֣�");
                stu = new Student(name, age);
                operator.save(stu);
                flag = false;
            } else {
                System.out.println("���Ѿ�ȡ���˱��β�����");
            }
        } else {
            String name = input.getString("����������");
            int age = input.getInt("���������䣺", "������Ĳ������֣�");
            stu = new Student(name, age);
            operator.save(stu);
        }

    }

    public static void find() {
        System.out.println("��ѯ��ݲ���:");
        FileOperator operator = new FileOperator("d:" + File.separator + "temp"
                + File.separator + "stu.info");
        Student stu = (Student) operator.load();

        if (stu != null) {
            System.out.println(stu);
        } else {
            System.out.println("û���κ���ݣ�");
        }

    }

    public static void update() {
        System.out.println("�޸���ݲ���:");
        FileOperator operator = new FileOperator("d:" + File.separator + "temp"
                + File.separator + "stu.info");
        Student stu = (Student) operator.load();
        InputDate input = new InputDate();
        if (stu != null) {
            String name = input
                    .getString("����������(" + stu.getName() + ")��");
            int age = input.getInt("����������(" + stu.getAge() + ")��",
                    "������Ĳ������֣�");
            stu = new Student(name, age);
            operator.save(stu);
        } else {
            System.out.println("��ݿ�����Ϊ�գ����������ݣ�");
        }

    }

    public static void delete() {
        System.out.println("ɾ����ݲ���:");
        FileOperator operator = new FileOperator("d:" + File.separator + "temp"
                + File.separator + "stu.info");
        Student stu = (Student) operator.load();
        if (stu != null) {
            operator.save(null);
        } else {
            System.out.println("��ݿ��Ѿ�Ϊ�գ�����Ҫɾ��");
        }
    }

    public static void exit() {
        System.out.println("ϵͳ�˳���");
        System.exit(1);
    }
}
