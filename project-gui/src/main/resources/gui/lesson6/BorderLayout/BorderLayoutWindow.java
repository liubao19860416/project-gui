//【例6-3】  BorderLayout布局管理器应用示例。
//程序清单6-3:  BorderLayoutWindow.java
import java.awt.*;

public class BorderLayoutWindow extends Frame {
	public static void main(String args[]) {
		BorderLayoutWindow window = new BorderLayoutWindow("BorderLayout");
		//window.setLayout(new BorderLayout());
		window.add(new Button("North"), BorderLayout.NORTH);
		window.add(new Button("South"), "South");
		window.add(new Button("East"), "East");
		window.add(new Button("West"), "West");
		window.add(new Button("Center"), "Center");
		window.pack();
		window.setVisible(true);
	}

	public BorderLayoutWindow(String str) {
		super(str);
	}
}
