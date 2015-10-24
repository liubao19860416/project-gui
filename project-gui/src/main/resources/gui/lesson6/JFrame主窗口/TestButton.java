//����6-7��  ί�з�ʽ�¼��������ʾ����
//�����嵥6-7:  TestButton.java
import java.awt.*;
import java.awt.event.*;

public class TestButton {
	public static void main(String args[]) {
		Frame f = new Frame("Test");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200, 150);
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		Button b = new Button("Press Me!");
		b.addActionListener(new ButtonHandler()); // ע��������¼���������
		f.add(b);
		f.pack();
		f.setVisible(true);
	}
}

class ButtonHandler implements ActionListener {// ����ActionEvent�������ࡣ
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action occurred");
		System.out.println("Button's label is:" + e.getActionCommand());
	}
}
