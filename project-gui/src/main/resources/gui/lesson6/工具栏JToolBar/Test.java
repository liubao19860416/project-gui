import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class Test extends JFrame
 {
 	public Test() 
 	{
 		Container contentPane = getContentPane();
        JToolBar toolbar = new JToolBar();
        contentPane.add(toolbar);
        String[] tooltipTexts = { "new", "open", "cut", "copy","paste" };
        ImageIcon[] icons = { new ImageIcon("new.gif"),
                              new ImageIcon("open.gif"),
                              new ImageIcon("cut.gif"),
                              new ImageIcon("copy.gif"),
                              new ImageIcon("paste.gif")};

        JButton[] buttons = { new ButtonWithFixedTooltip(icons[0],tooltipTexts[0]), 
                              new ButtonWithFixedTooltip(icons[1],tooltipTexts[1]), 
                              new ButtonWithFixedTooltip(icons[2],tooltipTexts[2]), 
                              new ButtonWithFixedTooltip(icons[3],tooltipTexts[3]), 
                              new ButtonWithFixedTooltip(icons[4],tooltipTexts[4])};

    for(int i=0; i < buttons.length; ++i)
        {
        toolbar.add(buttons[i]);
        if(tooltipTexts[i].equals("copy")) toolbar.addSeparator();
        }
    contentPane.add(toolbar, BorderLayout.NORTH);
  }
	public static void main(String args[]) 
	    {
		Test test=new Test();
		test.setSize(400,400);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
    	}
}
class ButtonWithFixedTooltip extends JButton 
{
	public ButtonWithFixedTooltip(Icon icon, String tooltipText)
	{
      super(icon);
      setToolTipText(tooltipText);
    }
   public Point getToolTipLocation(MouseEvent e)
   {
   Dimension size = getSize();
   System.out.println(size);
   return new Point(0, size.height);
   }


}
