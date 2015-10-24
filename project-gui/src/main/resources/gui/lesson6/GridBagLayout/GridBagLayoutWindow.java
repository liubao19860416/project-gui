//【例6-6】  GridBagLayout布局管理器应用示例。
//程序清单6-6:  GridBagLayoutWindow.java
import java.awt.*;

public class GridBagLayoutWindow extends Frame {
	public static void main(String args[]) {
		GridBagLayoutWindow window = new GridBagLayoutWindow("GridBagLayout");
		window.setLayout(new GridBagLayout());
                  //GridBagConstraints 类指定使用 GridBagLayout 类布置的组件的约束。 
		GridBagConstraints c = new GridBagConstraints(); 
		c.fill = GridBagConstraints.BOTH; // 组件充满显示区域。
		c.weightx = 1.0;
		window.addButton("Button1", c);
		window.addButton("Button2", c);
		window.addButton("Button3", c);
		c.gridwidth = GridBagConstraints.REMAINDER; // 到行结束。
		window.addButton("Button4", c);
		c.weightx = 0.0; // 恢复为缺省值。
		window.addButton("Button5", c);
		c.gridwidth = GridBagConstraints.RELATIVE; // 所在行的倒数第二个组件。
		window.addButton("Button6", c);
		c.gridwidth = GridBagConstraints.REMAINDER; // 到行结束。
		window.addButton("Button7", c);
		c.gridwidth = 1; // 恢复为缺省值。
		c.gridheight = 2;
		c.weighty = 1.0;
		window.addButton("Button8", c);
		c.weighty = 0.0; // 恢复为缺省值。
		c.gridwidth = GridBagConstraints.REMAINDER; // 到行结束。
		c.gridheight = 1; // 恢复为缺省值。
		window.addButton("Button9", c);
		window.addButton("Button10", c);
		window.pack();// 窗口的大小设置为适合组件最佳尺寸与布局所需的空间。
		window.setVisible(true);
	}

	public GridBagLayoutWindow(String str) {
		super(str);
	}

	private void addButton(String name, GridBagConstraints gbc) {
		Button button = new Button(name);
		add(button, gbc); // 按指定约束加入部件。
	}
}
