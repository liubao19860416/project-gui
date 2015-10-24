import java.awt.*;
import javax.swing.*;
import javax.swing.colorchooser.*;
public class FileChooserDemo extends JPanel
{
	protected JFileChooser tcc;
	public FileChooserDemo()
	{
		super(new BorderLayout());
	    tcc=new JFileChooser("c:/jad\\");
	    tcc.setBorder(BorderFactory.createTitledBorder("Choose File"));
	    add(tcc,BorderLayout.PAGE_END);
	}
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("FileChooserDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setContentPane(new FileChooserDemo());
		frame.pack();
		frame.setVisible(true);
	}
}