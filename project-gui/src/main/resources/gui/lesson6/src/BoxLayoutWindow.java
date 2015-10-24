//【例6-16】  BoxLayout示例。
//程序清单6-16:  BoxLayoutWindow.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BoxLayoutWindow extends JFrame {
	JButton jBut1, jBut2, jBut3, jBut4, jBut5;

	public BoxLayoutWindow() {
		Container con = this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		jBut1 = new JButton("按钮1");
		jBut2 = new JButton("按钮2");
		jBut3 = new JButton("特殊按钮3");
		jBut4 = new JButton("按钮4");
		jBut5 = new JButton("更大的按钮5");
		con.add(jBut1);
		con.add(jBut2);
		con.add(jBut3);
		con.add(jBut4);
		con.add(jBut5);
		this.setTitle("BoxLayout");
		this.setBounds(100, 100, 200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		BoxLayoutWindow boxlayout = new BoxLayoutWindow();
	}
}
