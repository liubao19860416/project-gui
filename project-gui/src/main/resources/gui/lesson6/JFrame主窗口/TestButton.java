//【例6-7】  委托方式事件处理机制示例。
//程序清单6-7:  TestButton.java
import java.awt.*;
import java.awt.event.*;

public class TestButton {
	public static void main(String args[]) {
		Frame f = new Frame("Test");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200, 150);
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		Button b = new Button("Press Me!");
		b.addActionListener(new ButtonHandler()); // 注册点击鼠标事件监听器。
		f.add(b);
		f.pack();
		f.setVisible(true);
	}
}

class ButtonHandler implements ActionListener {// 定义ActionEvent监听器类。
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action occurred");
		System.out.println("Button's label is:" + e.getActionCommand());
	}
}
