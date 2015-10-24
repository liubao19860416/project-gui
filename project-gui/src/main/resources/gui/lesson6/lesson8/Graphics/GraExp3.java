import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class GraExp3 extends JFrame
{
   public GraExp3()
   {
      setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      setSize(new Dimension(400,300));
      show();
   }
   public void paint(Graphics g)
   {
      Dimension d=getSize();
      int x=(int)d.getWidth();
      int y=(int)d.getHeight();
      Color color=Color.white;
      g.setColor(color);
      g.fillRect(0,0,x,y);
      g.setColor(new Color(255,0,0));
      g.drawString("红色是三原色中的首色，代表激情。",50,50);
      g.setColor(new Color(0,255,0));
      g.drawString("绿色是三原色中的次色，代表安逸。",50,80);
      g.setColor(new Color(0,0,255));
      g.drawString("蓝色是三原色中的末色，代表忧郁。",50,110);
   }
 
   public static void main(String[] args)
   {
      GraExp3 ge=new GraExp3();
   }
}
