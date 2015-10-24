//【例6-27】  弹出式菜单创建示例。
//程序清单6-27:  JPopupMenuDemo.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JPopupMenuDemo extends JFrame {
	JMenu fileMenu;

	JPopupMenu jPopupMenuOne;

	JMenuItem openFile, closeFile, exit;

	JRadioButtonMenuItem copyFile, pasteFile;

	ButtonGroup buttonGroupOne;

	public JPopupMenuDemo() {
		jPopupMenuOne = new JPopupMenu();
		buttonGroupOne = new ButtonGroup();
		fileMenu = new JMenu("文件");
		openFile = new JMenuItem("打开");
		closeFile = new JMenuItem("关闭");
		fileMenu.add(openFile);
		fileMenu.add(closeFile);
		jPopupMenuOne.add(fileMenu);// 将fileMenu菜单添加到弹出式菜单中
		jPopupMenuOne.addSeparator();// 添加分割符
		copyFile = new JRadioButtonMenuItem("复制");
		pasteFile = new JRadioButtonMenuItem("粘贴");
		buttonGroupOne.add(copyFile);
		buttonGroupOne.add(pasteFile);
		jPopupMenuOne.add(copyFile);// 将copyFile添加到jPopupMenuOne中
		jPopupMenuOne.add(pasteFile);// 将pasteFile添加到jPopupMenuOne中
		jPopupMenuOne.addSeparator();
		exit = new JMenuItem("退出");
		jPopupMenuOne.add(exit);// 将exit添加到jPopupMenuOne中
		MouseListener popupListener = new PopupListener(jPopupMenuOne);
		this.addMouseListener(popupListener);// 向主窗口注册监听器
		this.setTitle("JPopupMenuDemo");
		this.setBounds(100, 100, 250, 150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new JPopupMenuDemo();
	}

	class PopupListener extends MouseAdapter {
		JPopupMenu popupMenu;

		PopupListener(JPopupMenu popupMenu) {
			this.popupMenu = popupMenu;
		}

		public void mousePressed(MouseEvent e) {
			showPopupMenu(e);
		}

		public void mouseReleased(MouseEvent e) {
			showPopupMenu(e);
		}

		private void showPopupMenu(MouseEvent e) {
			if (e.isPopupTrigger())
				popupMenu.show(e.getComponent(), e.getX(), e.getY());
		}
	}
}
