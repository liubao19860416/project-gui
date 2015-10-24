//【例6-13】  一个组件注册多个监听器示例。
//程序清单6-13:  TwoListener.java
import java.awt.*;
import java.awt.event.*;

public class TwoListener {
	private TextArea ta;

	public static void main(String args[]) {
		TwoListener two = new TwoListener();
		two.go();
	}

	public void go() {
		Frame f = new Frame("TwoListener");
		Button but1 = new Button("OK");
		Button but2 = new Button("Cancel");
		ta = new TextArea(6, 15);
		f.setLayout(new FlowLayout());
		f.add(but1);
		f.add(but2);
		f.add(ta);
		f.setSize(200, 150);
		ButListener1 b1 = new ButListener1();
		ButListener2 b2 = new ButListener2();
		but1.addActionListener(b1); // 注册两个事件监听器。
		but1.addActionListener(b2);
		but2.addActionListener(b1);
		but2.addActionListener(b2); // 同一事件监听器注册了两次。
		but2.addActionListener(b2);
		f.pack();
		f.setVisible(true);
	}

	class ButListener1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ta.append("First  " + event.getActionCommand() + "\n");
		}
	}
	class ButListener2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ta.append("Second  " + event.getActionCommand() + "\n");
		}
	}
}
