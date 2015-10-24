import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JDialogDemo2
{
	public static void main(String[] args)
	{
		JDialogDemo2 jDialogDemo2=new JDialogDemo2();
	}
	private JFrame frame;
	private JTextField text;
	public JDialogDemo2()
	{
		JFrame frame=new JFrame("JFrame程序");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=frame.getContentPane();
		JButton button=new JButton("显示数据");
		button.addActionListener(new ActionListenerImp());
		contentPane.add(button,BorderLayout.WEST);
		text=new JTextField("填写数据处");
		contentPane.add(text,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
	private class ActionListenerImp implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JDialog dialog = new JDialog();
			 dialog.setSize(200,200);
   	        Container contentPane=dialog.getContentPane();
         JLabel label=new JLabel(text.getText(),JLabel.CENTER);
         contentPane.add(label);
         dialog.pack();
         dialog.setVisible(true);
       	}
	}
}