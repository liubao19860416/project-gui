//【例6-20】  JTextField与JPasswordField使用示例。
//程序清单6-20:  JTextDemo.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTextDemo extends JFrame implements ActionListener {
	public static final String NAME = "user"; // 设定用户名为"user"

	public static final String PASSWORD = "password";// 设定密码为"password"

	private JTextField textName;

	private JPasswordField textPassword;

	private JTextField textCheck;

	private JButton ok;

	private JButton cancel;

	public JTextDemo() {
		super("登录");
		Container c =this.getContentPane();  //可以省去this
		JPanel panel = new JPanel();
		JLabel labelName = new JLabel("用户名：");
		textName = new JTextField(15);
		textName.addActionListener(this);
		panel.add(labelName);
		panel.add(textName);
		JLabel labelPassword = new JLabel("密   码：");
		textPassword = new JPasswordField(15);
		textPassword.setEchoChar('#'); // 设置回显字符
		textPassword.addActionListener(this);
		panel.add(labelPassword);
		panel.add(textPassword);
		ok = new JButton("确定");
		ok.addActionListener(this);
		panel.add(ok);
		cancel = new JButton("退出");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			System.exit(1);
			}
		});
		panel.add(cancel);
		textCheck = new JTextField(20);
		textCheck.setEditable(false); // 设置验证文本框不可编辑
		panel.add(textCheck);
		c.add(panel);
	}

	public void actionPerformed(ActionEvent e) {
		String n = textName.getText();
		char[] s = textPassword.getPassword();
		String p = new String(s);
		
		if (e.getSource() == textName)
		 {
			textCheck.setText("用户名为" + textName.getText());
			textPassword.grabFocus();// 密码框获得焦点
		} else {
			if (n.equals(NAME) && p.equals(PASSWORD)) {
				textCheck.setText("登录成功！");
				ok.grabFocus();
			} else {
				textCheck.setText("用户名与密码不正确！");
				textName.setText("");// 文本框清空
				textPassword.setText("");
				textName.grabFocus();
				
			}
		}
	}

	public static void main(String args[]) {
		JTextDemo frame = new JTextDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(280, 160);
		frame.setVisible(true);
	}
}
