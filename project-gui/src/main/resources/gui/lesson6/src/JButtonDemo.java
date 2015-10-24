//����6-19��  JLabel��JButtonʹ��ʾ����
//�����嵥6-19:  JButtonDemo.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JButtonDemo extends JFrame implements ActionListener {
	JButton button1, button2, button3;

	JLabel label;

	JButtonDemo() {
		super("JButtonDemo");
		label = new JLabel("��ʾ��ǰ������ʱ��", JLabel.CENTER);
		button1 = new JButton("����[d]");
		button1.setMnemonic('d'); // ���ÿ�ݼ�Ϊd
		button1.setActionCommand("date"); // ���ö�������Ϊdate
		button1.addActionListener(this); // ע���¼�������
		button2 = new JButton("ʱ��[t]");
		button2.setMnemonic('t'); // ���ÿ�ݼ�Ϊt
		button2.setActionCommand("time"); // ���ö�������Ϊtime
		button2.addActionListener(this); // ע���¼�������
		button3 = new JButton("�˳�[q]");
		button3.setMnemonic('q'); // ���ÿ�ݼ�Ϊq
		button3.setActionCommand("quit"); // ���ö�������Ϊquit
		button3.addActionListener(this); // ע���¼�������
		getContentPane().add(label, BorderLayout.NORTH);
		getContentPane().add(button1, BorderLayout.WEST);
		getContentPane().add(button2, BorderLayout.CENTER);
		getContentPane().add(button3, BorderLayout.EAST);
	}

	public void actionPerformed(ActionEvent e) {
		Calendar c = Calendar.getInstance(); // �õ�ϵͳ������Ķ���
		if (e.getActionCommand().equals("date")) {
			System.out.println(e.getActionCommand());
			label.setText("������" + c.get(Calendar.YEAR) + "��"
					+ c.get(Calendar.MONTH) + "��" + c.get(Calendar.DATE) + "��");
			label.setHorizontalAlignment(JLabel.LEFT);// ���ñ�ǩ���ı������
		} else if (e.getActionCommand().equals("time")) {
			System.out.println(e.getActionCommand());
			label.setText("������" + c.get(Calendar.HOUR) + "ʱ"
					+ c.get(Calendar.MINUTE) + "��" + c.get(Calendar.SECOND)
					+ "��");
			label.setHorizontalAlignment(JLabel.RIGHT);// ���ñ�ǩ���ı��Ҷ���
		} else
			System.exit(0);
	}

	public static void main(String args[]) {
		JFrame frame = new JButtonDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
