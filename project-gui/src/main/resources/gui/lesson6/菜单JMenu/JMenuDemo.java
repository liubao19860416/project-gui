//【例6-26】  下拉式菜单创建示例。
//程序清单6-26:  JMenuDemo.java
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
		menuBar = new JMenuBar(); // 生成菜单条
		setJMenuBar(menuBar);
		menu = new JMenu("有菜单项菜单"); // 创建第一个菜单
		menu.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menu);
		menuItem = new JMenuItem("文本菜单项"); // 创建菜单项
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.ALT_MASK));
		menu.add(menuItem);
		menuItem = new JMenuItem("图形菜单项", new ImageIcon("images/img.gif"));
		menuItem.setMnemonic(KeyEvent.VK_B);
		menu.add(menuItem);
		menuItem = new JMenuItem(new ImageIcon("images/img.gif"));
		menuItem.setMnemonic(KeyEvent.VK_D);
		menu.add(menuItem);
		menu.addSeparator(); // 创建单选菜单项
		ButtonGroup group = new ButtonGroup();
		rbMenuItem = new JRadioButtonMenuItem("单选菜单项一");
		rbMenuItem.setSelected(true);
		rbMenuItem.setMnemonic(KeyEvent.VK_R);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		rbMenuItem = new JRadioButtonMenuItem("单选菜单项二");
		rbMenuItem.setMnemonic(KeyEvent.VK_O);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		menu.addSeparator(); // 创建复选菜单项
		cbMenuItem = new JCheckBoxMenuItem("多选菜单项一");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbMenuItem);
		cbMenuItem = new JCheckBoxMenuItem("多选菜单项二");
		cbMenuItem.setMnemonic(KeyEvent.VK_H);
		menu.add(cbMenuItem);
		menu.addSeparator(); // 创建子菜单
		submenu = new JMenu("子菜单");
		submenu.setMnemonic(KeyEvent.VK_S);
		menuItem = new JMenuItem("子菜单菜单项一");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.ALT_MASK));
		submenu.add(menuItem);
		menuItem = new JMenuItem("子菜单菜单项二");
		submenu.add(menuItem);
		//menuBar.add(submenu);
		menu.add(submenu);
		menu = new JMenu("无菜单项菜单"); // 创建菜单
		menu.setMnemonic(KeyEvent.VK_N);
		menuBar.add(menu);
	}
	public static void main(String[] args) {
		JMenuDemo mainFrame = new JMenuDemo();
		mainFrame.setSize(450, 260);
		mainFrame.setVisible(true);
	}
}
