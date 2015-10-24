//����6-18��  JOptionPaneʹ��ʾ����
//�����嵥6-18:  DemoInputDialog.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoInputDialog extends JFrame {
	JLabel jLabelMessage;

	public DemoInputDialog() {
		jLabelMessage = new JLabel();
		jLabelMessage.setHorizontalAlignment(SwingConstants.CENTER);
		jLabelMessage.setFont(new Font("����", Font.PLAIN, 28));
		this.add(jLabelMessage);
		this.setBounds(150, 150, 400, 200);
		this.setTitle("����Ի���Ӧ��ʾ��");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		String title = new String("����Ի���");
		String message = new String("����������������");
		int messageType = JOptionPane.INFORMATION_MESSAGE;
		String inputMessage = (String) JOptionPane.showInputDialog(this,
				message, title, messageType); //this��ʾ�Ի���ĸ���
		if (inputMessage != null && !inputMessage.equals(""))
			this.jLabelMessage.setText("�������ˣ�" + inputMessage);
		else
			this.jLabelMessage.setText("��û�������κ����ݣ�");
	}

	public static void main(String args[]) {
		new DemoInputDialog();
	}
}
