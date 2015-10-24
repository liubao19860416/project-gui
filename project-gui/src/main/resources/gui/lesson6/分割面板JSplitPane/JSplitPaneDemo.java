import java.awt.*;
import javax.swing.*;
import javax.swing.JSplitPane;
public class JSplitPaneDemo 
{
	public JSplitPane createPane()
	{
		JSplitPane mainSplitPane= new JSplitPane();
		mainSplitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		JPanel leftPanel=new JPanel(new BorderLayout());
		JSplitPane leftSplitPane=new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		leftSplitPane.setDividerLocation(100);
		leftSplitPane.setDividerSize(30);
		leftSplitPane.setTopComponent(new JTextArea("�����Ϸ�"));
		leftSplitPane.setBottomComponent(new JTextArea("�����·�"));
		leftPanel.add(leftSplitPane);
		leftPanel.setVisible(true);
		mainSplitPane.setLeftComponent(leftPanel);
		mainSplitPane.setRightComponent(new JTextArea("���ұ�"));
		mainSplitPane.setDividerLocation(100);
		return mainSplitPane;
	}
	public static void main(String [] args)
	{
	    JFrame frame=new JFrame("FileSplitDemo");
	    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setContentPane(new JSplitPaneDemo().createPane());
	    frame.setSize(400,400);
		frame.pack();
		frame.setVisible(true);
	}
}
