//【例6-10】  采用事件适配器，完成例6-8程序的功能。
//程序清单6-10:  AdapterCounter.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AdapterCounter extends JFrame {
	private Button button = new Button("1");

	public AdapterCounter(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addMouseListener(new MyMouseListener(1)); // 注册监听器。
		add(button);
		setSize(200, 100);
		setVisible(true);
	}

	public static void main(String args[]) {
		new AdapterCounter("Counter");
	}
}

class MyMouseListener extends MouseAdapter {
	private int step;

	public MyMouseListener(int step) {
		this.step = step;
	}

	public void mousePressed(MouseEvent event) {
		Button button = (Button) event.getSource(); // 获得事件源。
		int count = Integer.parseInt(button.getLabel());
		button.setLabel(new Integer(step + count).toString());
		//System.out.println("789");
	}
}
