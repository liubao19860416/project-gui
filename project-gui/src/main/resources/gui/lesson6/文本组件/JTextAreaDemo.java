//【例6-21】  JTextArea使用示例。
//程序清单6-21:  JTextAreaDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextAreaDemo extends JFrame {
	private JTextArea tArea1, tArea2, tArea3;

	public JTextAreaDemo() {
		super("JTextAreaDemo");
		Container c = getContentPane();
		JPanel panel = new JPanel();
		tArea1 = new JTextArea(3, 20); // 创建3行20列不能自动换行的文本域
		tArea2 = new JTextArea(3, 20);
		tArea2.setLineWrap(true); // 设置自动换行
		tArea3 = new JTextArea(5, 20);
		JScrollPane scrollPane = new JScrollPane(tArea3); // 创建滚动窗格
		panel.add(tArea1); // 将三种文本域添加到框架中
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
