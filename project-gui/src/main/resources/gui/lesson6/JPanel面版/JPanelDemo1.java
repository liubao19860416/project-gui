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
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT ,true);  //JSplitPane ���ڷָ�������ֻ��������Component��
		splitPane.setTopComponent(part1());//��ӵ��ϱߴ�����
		splitPane.setBottomComponent(part2());//��ӵ��±ߴ�����
		splitPane.setVisible(true);
    return splitPane;
	}
	private JPanel part1()
	{
		JPanel panel=new JPanel();
		panel.add(new JLabel("����"));
		panel.add(new JTextField("���������ݡ�",10));
		panel.setVisible(true);
		return panel;
	}
	private JPanel part2()
	{
		JPanel panel=new JPanel();
   		panel.add(new JButton("�˳�"));
		panel.add(new JButton("����"));
		panel.add(new JButton("ȷ��"));
		panel.setVisible(true);
		return panel;
	}
}
