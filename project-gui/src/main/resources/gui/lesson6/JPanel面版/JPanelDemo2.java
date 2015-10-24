import java.awt.Container;
import java.awt.*;
import javax.swing.*;
public class JPanelDemo2 extends JPanel
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("................");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPanel=frame.getContentPane();
		contentPanel.add(new JPanelDemo2().part1(),BorderLayout.NORTH);
		contentPanel.add(new JPanelDemo2().part2(),BorderLayout.SOUTH);
	    frame.setVisible(true);
	}
	private JPanel part1()
	{
		JPanel panel=new JPanel();
		panel.add(new JLabel("数据"));
		panel.add(new JTextField("清输入数据。",10));
		panel.setVisible(true);
		return panel;
	}
	private JPanel part2()
	{
		JPanel panel=new JPanel();
	//	panel.setLayout(new GridLayout(1,3));
   		panel.add(new JButton("退出"));
		panel.add(new JButton("重置"));
		panel.add(new JButton("确定"));
		panel.setVisible(true);
		return panel;
	}
}