//【例6-1】  创建一个带有面板的框架。
//程序清单6-1:  FrameWithPanel.java
import java.awt.*;

public class FrameWithPanel extends Frame {
	public static void main(String args[]) {
		FrameWithPanel fr = new FrameWithPanel("Hello !");
		fr.setSize(200, 200); // 设置Frame的大小
		fr.setBackground(Color.blue); // 设置Frame的背景色为蓝色
		fr.setLayout(new GridLayout(2, 1));
		Panel pan = new Panel();
		pan.setSize(200, 100); // 设置Panel的大小
		pan.setBackground(Color.yellow);// 设置Panel的背景色为黄色
		pan.add(new Button("确定"));
		fr.add(pan);
		fr.setVisible(true); // 设置Frame可见
	}

	public FrameWithPanel(String str) {
		super(str);
	}
}
