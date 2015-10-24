import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class JTabbedPaneDemo
{
	public JTabbedPane JTabbed()
	{
		JTabbedPane tabbedPane=new JTabbedPane();
		ImageIcon icon=new ImageIcon("temp.gif");
		JPanel panel1= new JPanel();
		panel1.add(new JButton("a"));
		JPanel panel2= new JPanel();
		panel2.add(new JTextField("abcd"));
		JPanel panel3= new JPanel();
		panel3.add(new JLabel("1234"));
		tabbedPane.addTab("Tab 1",icon,panel1,"Does nothing1");
		tabbedPane.addTab("Tab 2",icon,panel2,"Does nothing2");
		tabbedPane.addTab("Tab 3",icon,panel3,"Does nothing3");
		//tabbedPane.setMnemonicAt(0,KeyEvent.VK_1);
		return tabbedPane;
	}
	public static void main(String[] args)
	{
		 JFrame frame=new JFrame("FileSplitDemo");
	    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setContentPane(new JTabbedPaneDemo().JTabbed());
	    frame.setSize(400,400);
		frame.pack();
		frame.setVisible(true);
	}
}