import java.awt.Container;
import java.awt.*;
import javax.swing.*;
public class JPanelDemo1 extends JPanel
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("................");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setVisible(true);
		Container contentPanel=frame.getContentPane();
		JPanelDemo1 paneldemo1=new JPanelDemo1();
		contentPanel.add(paneldemo1.createComponent());
	    frame.setVisible(true);
	}
	private JComponent createComponent()
	{
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT ,true);  //JSplitPane 用于分隔两个（只能两个）Component。
		splitPane.setTopComponent(part1());//添加到上边窗口中
		splitPane.setBottomComponent(part2());//添加到下边窗口中
		splitPane.setVisible(true);
    return splitPane;
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
   		panel.add(new JButton("退出"));
		panel.add(new JButton("重置"));
		panel.add(new JButton("确定"));
		panel.setVisible(true);
		return panel;
	}
}
