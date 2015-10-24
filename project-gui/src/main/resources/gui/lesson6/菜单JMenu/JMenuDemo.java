//����6-26��  ����ʽ�˵�����ʾ����
//�����嵥6-26:  JMenuDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenuDemo extends JFrame {
	JMenuBar menuBar;

	JMenu menu, submenu;

	JMenuItem menuItem;

	JCheckBoxMenuItem cbMenuItem;

	JRadioButtonMenuItem rbMenuItem;

	public JMenuDemo() {
		super("JMenuDemo");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		createMenu();
	}
	void createMenu() {
		menuBar = new JMenuBar(); // ���ɲ˵���
		setJMenuBar(menuBar);
		menu = new JMenu("�в˵���˵�"); // ������һ���˵�
		menu.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menu);
		menuItem = new JMenuItem("�ı��˵���"); // �����˵���
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.ALT_MASK));
		menu.add(menuItem);
		menuItem = new JMenuItem("ͼ�β˵���", new ImageIcon("images/img.gif"));
		menuItem.setMnemonic(KeyEvent.VK_B);
		menu.add(menuItem);
		menuItem = new JMenuItem(new ImageIcon("images/img.gif"));
		menuItem.setMnemonic(KeyEvent.VK_D);
		menu.add(menuItem);
		menu.addSeparator(); // ������ѡ�˵���
		ButtonGroup group = new ButtonGroup();
		rbMenuItem = new JRadioButtonMenuItem("��ѡ�˵���һ");
		rbMenuItem.setSelected(true);
		rbMenuItem.setMnemonic(KeyEvent.VK_R);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		rbMenuItem = new JRadioButtonMenuItem("��ѡ�˵����");
		rbMenuItem.setMnemonic(KeyEvent.VK_O);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		menu.addSeparator(); // ������ѡ�˵���
		cbMenuItem = new JCheckBoxMenuItem("��ѡ�˵���һ");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbMenuItem);
		cbMenuItem = new JCheckBoxMenuItem("��ѡ�˵����");
		cbMenuItem.setMnemonic(KeyEvent.VK_H);
		menu.add(cbMenuItem);
		menu.addSeparator(); // �����Ӳ˵�
		submenu = new JMenu("�Ӳ˵�");
		submenu.setMnemonic(KeyEvent.VK_S);
		menuItem = new JMenuItem("�Ӳ˵��˵���һ");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.ALT_MASK));
		submenu.add(menuItem);
		menuItem = new JMenuItem("�Ӳ˵��˵����");
		submenu.add(menuItem);
		//menuBar.add(submenu);
		menu.add(submenu);
		menu = new JMenu("�޲˵���˵�"); // �����˵�
		menu.setMnemonic(KeyEvent.VK_N);
		menuBar.add(menu);
	}
	public static void main(String[] args) {
		JMenuDemo mainFrame = new JMenuDemo();
		mainFrame.setSize(450, 260);
		mainFrame.setVisible(true);
	}
}
