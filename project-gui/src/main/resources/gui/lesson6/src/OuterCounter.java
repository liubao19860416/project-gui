//【例6-9】  通过定义专门的类实现监听器接口，完成例6-8程序的功能。
//程序清单6-9:  OuterCounter.java
import java.awt.*;
import java.awt.event.*;

public class OuterCounter extends Frame {
	private Button button = new Button("1");

	public OuterCounter(String title) {
		super(title);
		button.addActionListener(new OuterListener(1)); // 注册监听器。
		add(button);
		setSize(200, 100);
		setVisible(true);
	}

	public static void main(String args[]) {
		new OuterCounter("Counter");
	}
}

class OuterListener implements ActionListener {
	private int step;// 决定Button上的标号值每次增加的步长。

	public OuterListener(int step) {
		this.step = step;
	}

	// 实现ActionListener的actionPerformed( )方法。
	public void actionPerformed(ActionEvent event) {
		Button button = (Button) event.getSource(); // 获得事件源。
		int count = Integer.parseInt(button.getLabel());
		// 把button上的标号值加step。
		button.setLabel(new Integer(step + count).toString());
	}
}
