//【例6-8】  用容器类实现监听器接口的示例。
//程序清单6-8:  FrameCounter.java
import java.awt.*;
import java.awt.event.*;

public class FrameCounter extends Frame implements ActionListener {
	private Button button = new Button("1");

	public FrameCounter(String title) {
		super(title);
		// 把FrameCounter本身的实例注册为Button的监听器。
		button.addActionListener(this);
		add(button);
		setSize(200, 100);
		setVisible(true);
	}

	// 实现ActionListener的actionPerformed( )方法。
	public void actionPerformed(ActionEvent event) {
		int count = Integer.parseInt(button.getLabel());
		// 把button上的标号值加1。
		button.setLabel(new Integer(++count).toString());
	}

	public static void main(String args[]) {
		new FrameCounter("Counter");
	}
}
