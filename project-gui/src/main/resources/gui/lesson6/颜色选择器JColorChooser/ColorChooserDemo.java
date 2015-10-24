import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;
public class ColorChooserDemo extends JPanel
{
	protected JColorChooser tcc;
	protected JLabel banner;
	public ColorChooserDemo()
	{
		super(new BorderLayout());
		JPanel bannerPanel=new JPanel(new BorderLayout());
		bannerPanel.setBorder(BorderFactory.createTitledBorder("Chooser Text Color"));
		tcc=new JColorChooser(Color.RED);
		add(bannerPanel,BorderLayout.CENTER);
		add(tcc,BorderLayout.PAGE_END);
	}
	public static void main(String [] args){
		JFrame frame=new JFrame("ColorChooserDamo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent newContentPane=new ColorChooserDemo();
		newContentPane.setOpaque(true);  //contentpane must be operque
	    frame.setContentPane(newContentPane);
		frame.pack();
		frame.setVisible(true);
	}
}