//【例6-2】  FlowLayout布局管理器应用示例。
//程序清单6-2:  FlowLayoutWindow.java
import java.awt.*;

public class FlowLayoutWindow extends Frame {
	public static void main(String args[]) {
		FlowLayoutWindow window = new FlowLayoutWindow("FlowLayout");
		window.setLayout(new FlowLayout());
		window.add(new Label("按钮:"));
		String spaces = ""; // 用来改变按钮的大小变化
		for (int i = 1; i <= 6; i++) {
			window.add(new Button("按钮" + i + spaces));
			spaces += " ";
		}
		window.pack();// 窗口的大小设置为适合组件最佳尺寸与布局所需的空间
		window.setVisible(true);
	}

	public FlowLayoutWindow(String str) {
		super(str);
	}
}
