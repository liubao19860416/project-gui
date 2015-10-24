//����6-14��  ��ʾ������ť�Ĵ�����
//�����嵥6-14:  SwingApplication.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingApplication {
	private static String labelPrefix = "Number of button clicks: ";

	private int numClicks = 0; // ����������¼����������

	public Component createComponents() {
		final JLabel label = new JLabel(labelPrefix + "0    ");
		JButton button = new JButton("I'm a Swing button!");
		button.setMnemonic(KeyEvent.VK_I); // ���ð�ť�ȼ���
		button.addActionListener(new ActionListener() {// ע���¼���������
					public void actionPerformed(ActionEvent e) {// �����¼���������
						numClicks++;
						label.setText(labelPrefix + numClicks); // ��ʾ������ť�Ĵ�����
					}
				});
		label.setLabelFor(button);
		JPanel pane = new JPanel();
		pane.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		pane.setLayout(new GridLayout(0, 1)); // ���ж��С�
		pane.add(button);
		pane.add(label);
		return pane;
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());// ���ô��ڷ��
		} catch (Exception e) {
		}
		// ����������������������������
		JFrame frame = new JFrame("SwingApplication");
		SwingApplication app = new SwingApplication();
		Component contents = app.createComponents();
		frame.getContentPane().add(contents, BorderLayout.CENTER);
		frame.addWindowListener(new WindowAdapter() { // ע���¼���������
					public void windowClosing(WindowEvent e) {// �����¼���������
						System.exit(0);
					}
				});
		frame.pack();
		frame.setVisible(true);
	}
}
