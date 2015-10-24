import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class JTabbedPaneDemo
{
	public JTabbedPaneDemo()
	{
		JTabbedPane tabbedPane=new JTabbedPane();
		imageIcon icon=new ImageIcon("temp.gif");
		JComPonent Panel1=new Panel("Panel *1");
		tabbedPane.addTab("Tab 1",icon,panel1,"Does nothing");
		tabbedPane.setMnemonicAt(0,KeyEvent.VK_1);
	}
	public static void main(String[] args)
	{
		 JFrame frame=new JFrame("FileSplitDemo");
	    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setContentPane(new JTabbedPaneDemo());
	    frame.setSize(400,400);
		frame.pack();
		frame.setVisible(true);
	}
}