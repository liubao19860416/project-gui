//【例6-22】  JRadioButton与JCheckBox使用示例。
//程序清单6-22:  BRDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BRDemo extends JFrame implements ItemListener, ActionListener {
	JTextField jtf;

	BRDemo() {
		super("BRDemo");
		setSize(200, 200);
		setVisible(true);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JCheckBox cb1 = new JCheckBox("C");
		cb1.addItemListener(this);
		contentPane.add(cb1);
		JCheckBox cb2 = new JCheckBox("C++");
		cb2.addItemListener(this);
		contentPane.add(cb2);
		JCheckBox cb3 = new JCheckBox("Java");
		cb3.addItemListener(this);
		contentPane.add(cb3);
		JRadioButton b1 = new JRadioButton("C");
		b1.addActionListener(this);
		contentPane.add(b1);
		JRadioButton b2 = new JRadioButton("C++");
		b2.addActionListener(this);
		contentPane.add(b2);
		JRadioButton b3 = new JRadioButton("Java");
		b3.addActionListener(this);
		contentPane.add(b3);
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		jtf = new JTextField(10);
		contentPane.add(jtf);
		validate();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void itemStateChanged(ItemEvent ie) {
		JCheckBox cb = (JCheckBox) ie.getItem();
		jtf.setText(cb.getText());
	}

	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}

	public static void main(String[] args) {
		new BRDemo();
	}
}
