//【例6-4】  GridLayout布局管理器应用示例。
//程序清单6-4:  GridLayoutWindow.java
import java.awt.*;

public class GridLayoutWindow extends Frame {
	public static void main(String args[]) {
		GridLayoutWindow window = new GridLayoutWindow("GridLayout");
		window.setLayout(new GridLayout(2, 3));
		String spaces = "";
		for (int i = 1; i <= 6; i++) {
			window.add(new Button("按钮" + i + spaces));
			spaces += "  ";
		}
		window.pack();
		window.setVisible(true);
	}

	public GridLayoutWindow(String str) {
		super(str);
	}
}
