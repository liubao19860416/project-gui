import java.awt.Container;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class JFrameDemo1
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("JFrame³ÌÐò");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=frame.getContentPane();
		JButton button=new JButton("°´Å¥west");
		JTextField text=new JTextField("center");
		contentPane.add(button,BorderLayout.WEST);
		contentPane.add(text,BorderLayout.CENTER);
		contentPane.add(new JLabel("north",JLabel.LEFT),BorderLayout.NORTH);
		contentPane.add(new JLabel("south",JLabel.CENTER),BorderLayout.SOUTH);
		contentPane.add(new JLabel("east"),BorderLayout.EAST);

	    frame.setVisible(true);
	 }
}