package org.lxh.useradmin.menu;

import org.lxh.useradmin.operate.UserOperate;
import org.lxh.useradmin.util.InputData;

public class Menu {
    public Menu() {
        while (true) {
            this.show();
        }
    }

    public void show() {
        System.out.println("======== MLDN��Ա����ϵͳ ========");
        System.out.println("   1�������û�");
        System.out.println("   2���޸��û�");
        System.out.println("   3��ɾ���û�");
        System.out.println("   4����ѯ�����û�");
        System.out.println("   5����ѯȫ���û�");
        System.out.println("   6���˳�ϵͳ");
        InputData input = new InputData();
        int ch = input.getInt("\n��ѡ��", "��������ȷ��ѡ�");
        switch (ch) {
        case 1: {
            UserOperate.insert();
            break;
        }
        case 2: {
            UserOperate.update();
            break;
        }
        case 3: {
            UserOperate.delete();
            break;
        }
        case 4: {
            UserOperate.findId();
            break;
        }
        case 5: {
            UserOperate.findAll();
            break;
        }
        case 6: {
            System.exit(1);
            break;
        }
        default: {
            System.out.println("��ѡ����ȷ��ѡ�");
            break;
        }
        }
    }
}
