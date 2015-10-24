//【例6-12】  用匿名类完成例6-8程序的功能。
//程序清单6-12:  AnnoymousCounter.java
import java.awt.*;
import java.awt.event.*;

public class AnnoymousCounter extends Frame {
	private Button button = new Button("1");

	public AnnoymousCounter(String title) {
		super(title);
		button.addActionListener(new ActionListener() {// 定义匿名类。
					public void actionPerformed(ActionEvent event) {
						int count = Integer.parseInt(button.getLabel());
						button.setLabel(new Integer(++count).toString());
					}
				});// 注册监听器，实现ActionListener的actionPerformed( )方法。
		add(button);
		setSize(200, 100);
		setVisible(true);
	}

	public static void main(String args[]) {
		new FrameCounter("Counter");
	}
}
