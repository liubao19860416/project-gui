//����6-17��  JFrameʹ��ʾ����
//�����嵥6-17:  JFrameDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JFrameDemo {
	public static void main(String args[]) {
		JFrame frame = new JFrame("JFrameDemo");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ַ����������ڹر�frame.
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		JLabel label = new JLabel("Creating and Showing JFrame");
		frame.getContentPane().add(label);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}
}
