//【例6-19】  JLabel与JButton使用示例。
//程序清单6-19:  JButtonDemo.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JButtonDemo extends JFrame implements ActionListener {
	JButton button1, button2, button3;

	JLabel label;

	JButtonDemo() {
		super("JButtonDemo");
		label = new JLabel("显示当前日期与时间", JLabel.CENTER);
		button1 = new JButton("日期[d]");
		button1.setMnemonic('d'); // 设置快捷键为d
		button1.setActionCommand("date"); // 设置动作命令为date
		button1.addActionListener(this); // 注册事件监听器
		button2 = new JButton("时间[t]");
		button2.setMnemonic('t'); // 设置快捷键为t
		button2.setActionCommand("time"); // 设置动作命令为time
		button2.addActionListener(this); // 注册事件监听器
		button3 = new JButton("退出[q]");
		button3.setMnemonic('q'); // 设置快捷键为q
		button3.setActionCommand("quit"); // 设置动作命令为quit
		button3.addActionListener(this); // 注册事件监听器
		getContentPane().add(label, BorderLayout.NORTH);
		getContentPane().add(button1, BorderLayout.WEST);
		getContentPane().add(button2, BorderLayout.CENTER);
		getContentPane().add(button3, BorderLayout.EAST);
	}

	public void actionPerformed(ActionEvent e) {
		Calendar c = Calendar.getInstance(); // 得到系统日历类的对象
		if (e.getActionCommand().equals("date")) {
			System.out.println(e.getActionCommand());
			label.setText("今天是" + c.get(Calendar.YEAR) + "年"
					+ c.get(Calendar.MONTH) + "月" + c.get(Calendar.DATE) + "日");
			label.setHorizontalAlignment(JLabel.LEFT);// 设置标签的文本左对齐
		} else if (e.getActionCommand().equals("time")) {
			System.out.println(e.getActionCommand());
			label.setText("现在是" + c.get(Calendar.HOUR) + "时"
					+ c.get(Calendar.MINUTE) + "分" + c.get(Calendar.SECOND)
					+ "秒");
			label.setHorizontalAlignment(JLabel.RIGHT);// 设置标签的文本右对齐
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
