//【例6-24】  JComboBox使用示例。
//程序清单6-24:  JComboDemo.java
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
		jc.addItem("中国");
		jc.addItem("俄罗斯");
		jc.addItem("韩国");
		jc.addItem("美国");
		jc.addItem("联合国");
		jc.addItemListener(this);
		contentPane.add(jc);
		jlb = new JLabel(new ImageIcon("中国.jpg"));
		contentPane.add(jlb);
		validate();
		addWindowListener(new WindowAdapter() {  //关闭窗口
		public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void itemStateChanged(ItemEvent ie) {   //重写的系统方法
		String s = (String) ie.getItem().toString();
		jlb.setIcon(new ImageIcon(s + ".jpg"));
	}

	public static void main(String args[]) {
		new JComboDemo();
	}
}
