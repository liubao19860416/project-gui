//����6-16��  BoxLayoutʾ����
//�����嵥6-16:  BoxLayoutWindow.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BoxLayoutWindow extends JFrame {
	JButton jBut1, jBut2, jBut3, jBut4, jBut5;

	public BoxLayoutWindow() {
		Container con = this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		jBut1 = new JButton("��ť1");
		jBut2 = new JButton("��ť2");
		jBut3 = new JButton("���ⰴť3");
		jBut4 = new JButton("��ť4");
		jBut5 = new JButton("����İ�ť5");
		con.add(jBut1);
		con.add(jBut2);
		con.add(jBut3);
		con.add(jBut4);
		con.add(jBut5);
		this.setTitle("BoxLayout");
		this.setBounds(100, 100, 200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		BoxLayoutWindow boxlayout = new BoxLayoutWindow();
	}
}
