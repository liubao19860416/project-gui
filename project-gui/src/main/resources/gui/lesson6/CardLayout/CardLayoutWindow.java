//����6-5��  CardLayout���ֹ�����Ӧ��ʾ����
//�����嵥6-5:  CardLayoutWindow.java
import java.awt.*;
import java.awt.event.*;

public class CardLayoutWindow extends Frame implements ActionListener {
	Panel cards;

	CardLayout CLayout = new CardLayout();

	public CardLayoutWindow() {
		setLayout(new BorderLayout()); // ����FrameΪBorderLayout��
		// �����ڷ�"��Ƭ�л�"��ť��panel,����ӵ�Frame�С�
		Panel cp = new Panel();
		Button bt = new Button("��Ƭ�л�");
		bt.addActionListener(this);
		cp.add(bt);
		//add("North", cp); �÷����еĲ�����һ����λ�á�
                add(cp, "North");
		cards = new Panel();// �����зŶ����Ƭ��Panel��
		cards.setLayout(CLayout); // ����ΪCardLayout��
		// ����cards�еĵ�һ��panel���������
		Panel p1 = new Panel();
		p1.add(new Button("Button 1"));
		p1.add(new Button("Button 2"));
		p1.add(new Button("Button 3"));
		// ����cards�е���һ��panel���������
		Panel p2 = new Panel();
		p2.add(new TextField("TextField", 20));
		cards.add("Panel with Buttons", p1); // ����������panel�ӵ�cards�С�
		cards.add("Panel with TextField", p2);
		add("Center", cards); // ��cards����Frame�С�
	}

	public void actionPerformed(ActionEvent e) {
		CLayout.next(cards); // ��Ӧ����л���Ƭ��ť���¼�����ʾ��һ�ſ�Ƭ��
	}

	public static void main(String args[]) {
		CardLayoutWindow window = new CardLayoutWindow();
		window.setTitle("CardLayout");
		window.pack();
		window.setVisible(true);
	}
}
