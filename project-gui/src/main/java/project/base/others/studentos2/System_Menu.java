package project.base.others.studentos2;

public class System_Menu {
    public System_Menu() {
        while (true) {
            show();
        }
    }

    /* static */{
        System.out.println("===========XXX ϵͳ�˵�============");
        System.out.println("    [1��]�������");
        System.out.println("    [2��]�������");
        System.out.println("    [3��]�޸����");
        System.out.println("    [4��]ɾ�����");
        System.out.println("    [0��]�˳�ϵͳ");
    }

    public void show() {
        InputDate indate = new InputDate();
        int choose = indate.getInt("\n��ѡ��", "����������������룡");

        switch (choose) {
        case 1: {
            Operate.add();
            break;
        }
        case 2: {
            Operate.find();
            break;
        }
        case 3: {
            Operate.update();
            break;
        }
        case 4: {
            Operate.delete();
            break;
        }
        case 0: {
            Operate.exit();
        }
        default: {
            System.out.println("��Ч��ѡ�");
        }
        }
    }

}
