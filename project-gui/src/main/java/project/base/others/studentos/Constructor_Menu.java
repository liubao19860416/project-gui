package project.base.others.studentos;

public class Constructor_Menu {

    public Constructor_Menu() {
        while (true) {
            // static
            {
                System.out.println("===========XXX ϵͳ�˵�============");
                System.out.println("    [1��]�������");
                System.out.println("    [2��]��ѯ���");
                System.out.println("    [3��]�޸����");
                System.out.println("    [4��]ɾ�����");
                System.out.println("    [0��]�˳�ϵͳ");
            }
            show();
        }
    }

    public void show() {
        InputDate indate = new InputDate();
        int choose = indate.getInt("\n", "����������������룡");

        switch (choose) {
        case 1: {
            Stu_Operate.add();
            break;
        }
        case 2: {
            Stu_Operate.find();
            break;
        }
        case 3: {
            Stu_Operate.update();
            break;
        }
        case 4: {
            Stu_Operate.delete();
            break;
        }
        case 0: {
            Stu_Operate.exit();
        }
        default: {
            System.out.println("��Ч��ѡ�");
        }
        }
    }

}
