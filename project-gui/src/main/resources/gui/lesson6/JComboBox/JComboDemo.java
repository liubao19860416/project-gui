//����6-24��  JComboBoxʹ��ʾ����
//�����嵥6-24:  JComboDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboDemo extends JFrame implements ItemListener {
	JLabel jlb;

	ImageIcon france, germany, italy, japan;

	JComboDemo() {
		super("JComboDemo");
		setSize(300, 200);
		setVisible(true);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JComboBox jc = new JComboBox();
		jc.addItem("�й�");
		jc.addItem("����˹");
		jc.addItem("����");
		jc.addItem("����");
		jc.addItem("���Ϲ�");
		jc.addItemListener(this);
		contentPane.add(jc);
		jlb = new JLabel(new ImageIcon("�й�.jpg"));
		contentPane.add(jlb);
		validate();
		addWindowListener(new WindowAdapter() {  //�رմ���
		public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void itemStateChanged(ItemEvent ie) {   //��д��ϵͳ����
		String s = (String) ie.getItem().toString();
		jlb.setIcon(new ImageIcon(s + ".jpg"));
	}

	public static void main(String args[]) {
		new JComboDemo();
	}
}
