import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonclassDemo {
	
	
	private static JPanel createMainPanel()
	{
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPanel=frame.getContentPane();
		JPanel panel=new JPanel();
		contentPanel.add(panel);
		frame.setSize(400,400);
		
		JPanel part1=new JPanel();
		part1.add(new JLabel("����"));
		JTextField text=new JTextField();
		text.setColumns(10);
		part1.add(text);
		part1.setVisible(true);
		panel.add(part1);
		JPanel part2=new JPanel();
		part2.add(new JLabel("�Ա�:"));
		ButtonGroup group=new ButtonGroup();
		JRadioButton radioButton1=new JRadioButton("��");
		radioButton1.setSelected(true);
		JRadioButton radioButton2=new JRadioButton("Ů");
		group.add(radioButton1);
		group.add(radioButton2);
		part2.add(radioButton1);
		part2.add(radioButton2);
		part2.setVisible(true);
		panel.add(part2);
		JPanel part3=new JPanel();
		part3.setLayout(new GridLayout(2,3));
		JCheckBox musicBox=new JCheckBox("����");
		musicBox.setSelected(true);
		part3.add(musicBox);
		part3.add(new JCheckBox("����"));
		part3.add(new JCheckBox("����"));
		part3.add(new JCheckBox("����"));
		part3.add(new JCheckBox("����"));
		part3.setVisible(true);
		panel.add(part3);
		JPanel part4=new JPanel();
		part4.add(new JButton("����"));
		part4.add(new JButton("ȷ��"));
		part4.setVisible(true);
		panel.add(part4);
		panel.setVisible(true);
		frame.pack();
		frame.setVisible(true);
		return panel;
		
	}
	public static void main(String args[]) {
		ButtonclassDemo buttonclass=new ButtonclassDemo();
		buttonclass.createMainPanel();
	}
}