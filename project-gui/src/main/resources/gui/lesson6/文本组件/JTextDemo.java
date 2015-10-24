//����6-20��  JTextField��JPasswordFieldʹ��ʾ����
//�����嵥6-20:  JTextDemo.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTextDemo extends JFrame implements ActionListener {
	public static final String NAME = "user"; // �趨�û���Ϊ"user"

	public static final String PASSWORD = "password";// �趨����Ϊ"password"

	private JTextField textName;

	private JPasswordField textPassword;

	private JTextField textCheck;

	private JButton ok;

	private JButton cancel;

	public JTextDemo() {
		super("��¼");
		Container c =this.getContentPane();  //����ʡȥthis
		JPanel panel = new JPanel();
		JLabel labelName = new JLabel("�û�����");
		textName = new JTextField(15);
		textName.addActionListener(this);
		panel.add(labelName);
		panel.add(textName);
		JLabel labelPassword = new JLabel("��   �룺");
		textPassword = new JPasswordField(15);
		textPassword.setEchoChar('#'); // ���û����ַ�
		textPassword.addActionListener(this);
		panel.add(labelPassword);
		panel.add(textPassword);
		ok = new JButton("ȷ��");
		ok.addActionListener(this);
		panel.add(ok);
		cancel = new JButton("�˳�");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			System.exit(1);
			}
		});
		panel.add(cancel);
		textCheck = new JTextField(20);
		textCheck.setEditable(false); // ������֤�ı��򲻿ɱ༭
		panel.add(textCheck);
		c.add(panel);
	}

	public void actionPerformed(ActionEvent e) {
		String n = textName.getText();
		char[] s = textPassword.getPassword();
		String p = new String(s);
		
		if (e.getSource() == textName)
		 {
			textCheck.setText("�û���Ϊ" + textName.getText());
			textPassword.grabFocus();// ������ý���
		} else {
			if (n.equals(NAME) && p.equals(PASSWORD)) {
				textCheck.setText("��¼�ɹ���");
				ok.grabFocus();
			} else {
				textCheck.setText("�û��������벻��ȷ��");
				textName.setText("");// �ı������
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
