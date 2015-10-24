//����6-27��  ����ʽ�˵�����ʾ����
//�����嵥6-27:  JPopupMenuDemo.java
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
		fileMenu = new JMenu("�ļ�");
		openFile = new JMenuItem("��");
		closeFile = new JMenuItem("�ر�");
		fileMenu.add(openFile);
		fileMenu.add(closeFile);
		jPopupMenuOne.add(fileMenu);// ��fileMenu�˵���ӵ�����ʽ�˵���
		jPopupMenuOne.addSeparator();// ��ӷָ��
		copyFile = new JRadioButtonMenuItem("����");
		pasteFile = new JRadioButtonMenuItem("ճ��");
		buttonGroupOne.add(copyFile);
		buttonGroupOne.add(pasteFile);
		jPopupMenuOne.add(copyFile);// ��copyFile��ӵ�jPopupMenuOne��
		jPopupMenuOne.add(pasteFile);// ��pasteFile��ӵ�jPopupMenuOne��
		jPopupMenuOne.addSeparator();
		exit = new JMenuItem("�˳�");
		jPopupMenuOne.add(exit);// ��exit��ӵ�jPopupMenuOne��
		MouseListener popupListener = new PopupListener(jPopupMenuOne);
		this.addMouseListener(popupListener);// ��������ע�������
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
