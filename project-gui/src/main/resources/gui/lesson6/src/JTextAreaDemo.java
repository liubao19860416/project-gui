//����6-21��  JTextAreaʹ��ʾ����
//�����嵥6-21:  JTextAreaDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextAreaDemo extends JFrame {
	private JTextArea tArea1, tArea2, tArea3;

	public JTextAreaDemo() {
		super("JTextAreaDemo");
		Container c = getContentPane();
		JPanel panel = new JPanel();
		tArea1 = new JTextArea(3, 20); // ����3��20�в����Զ����е��ı���
		tArea2 = new JTextArea(3, 20);
		tArea2.setLineWrap(true); // �����Զ�����
		tArea3 = new JTextArea(5, 20);
		JScrollPane scrollPane = new JScrollPane(tArea3); // ������������
		panel.add(tArea1); // �������ı�����ӵ������
		panel.add(tArea2);
		panel.add(scrollPane);
		c.add(panel);
	}

	public static void main(String args[]) {
		JFrame frame = new JTextAreaDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 250);
		frame.setVisible(true);
	}
}
