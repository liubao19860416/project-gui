package project.base.others.class_vote_demo;

public class Candidate_init {
    private static final int SIZE = 5;
    Candidate[] candidate = new Candidate[SIZE];

    public Candidate_init() {

        candidate[0] = new Candidate("1", "张三");
        candidate[1] = new Candidate("2", "李四");
        candidate[2] = new Candidate("3", "王武");
        candidate[3] = new Candidate("4", "赵六");
        candidate[4] = new Candidate("5", "孙七");
        System.out.println("0 : 开始了。。。");

        printAll(candidate);

        while (true) {
            Candi_initation();
        }

    }

    /**
     * 初始化
     */
    public void Candi_initation() {
        get_Data ticket_data = new get_Data();
        int choose = ticket_data.get_Tickets("\n��ѡ��", "����������������룡");
        switch (choose) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5: {
            candidate[choose - 1].setTicket_num(candidate[choose - 1]
                    .getTicket_num() + 1);
            break;
        }
        case 0: {
            int index = getMaxTicket(candidate);
            printAll(candidate);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (index == -1 || candidate[index].getTicket_num() == 0) {
                throw new RuntimeException(
                        "ѡ�ٲ���Ʊ��Ϊ0�����������˲�Ψһ��������ѡ�٣�");
            } else {
                System.out.println("ѡ�ٽ��:Ʊ������Ϊ"
                        + candidate[index].getTicket_num() + "Ʊ��ѡ�ٲ���İ೤�ǣ�"
                        + candidate[index].getName() + "������");
                // Collections.
            }
            System.exit(1);
        }
        default: {
            System.out.println("��Ч��ѡ�");
        }
        }
    }

    /**
     * 打印当前候选人名单
     */
    private void printAll(Candidate[] candidate) {
        for (int i = 0; i < candidate.length; i++) {
            System.out.println(candidate[i].getId() + " ："
                    + candidate[i].getName() + "："
                    + candidate[i].getTicket_num() + "；");
        }
    }

    /**
     * 获取最大投票数量的那个人的角标信息
     */
    public int getMaxTicket(Candidate[] candidate) {
        int index = 0, count = 0;
        Candidate[] temp = new Candidate[SIZE];
        for (int i = 1; i < candidate.length; i++) {
            if (candidate[index].getTicket_num() < candidate[i].getTicket_num())
                index = i;
        }
        for (int i = 0; i < candidate.length; i++) {
            if (candidate[index].getTicket_num() == candidate[i].getTicket_num())
                temp[count++] = candidate[i];
        }
        if (count == 1){
            return index;
        }
        return -1;
    }
}
