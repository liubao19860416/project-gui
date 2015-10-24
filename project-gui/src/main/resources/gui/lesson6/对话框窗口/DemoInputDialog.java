//【例6-18】  JOptionPane使用示例。
//程序清单6-18:  DemoInputDialog.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoInputDialog extends JFrame {
	JLabel jLabelMessage;

	public DemoInputDialog() {
		jLabelMessage = new JLabel();
		jLabelMessage.setHorizontalAlignment(SwingConstants.CENTER);
		jLabelMessage.setFont(new Font("宋体", Font.PLAIN, 28));
		this.add(jLabelMessage);
		this.setBounds(150, 150, 400, 200);
		this.setTitle("输入对话框应用示例");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		String title = new String("输入对话框");
		String message = new String("请在下面输入内容");
		int messageType = JOptionPane.INFORMATION_MESSAGE;
		String inputMessage = (String) JOptionPane.showInputDialog(this,
				message, title, messageType); //this表示对话框的父级
		if (inputMessage != null && !inputMessage.equals(""))
			this.jLabelMessage.setText("你输入了：" + inputMessage);
		else
			this.jLabelMessage.setText("你没有输入任何内容！");
	}

	public static void main(String args[]) {
		new DemoInputDialog();
	}
}
