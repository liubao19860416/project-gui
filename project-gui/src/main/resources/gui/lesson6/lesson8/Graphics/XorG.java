import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class XorG extends JFrame{
    public XorG(){
         XorPanel jp=new XorPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new XorG();
     }
}
class XorPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d=(Graphics2D)g;
     Ellipse2D ellipse=new Ellipse2D.Double(40,80,60,60);
     Rectangle2D rect=new Rectangle2D.Double(50,50,80,50.897);
     setBackground(Color.yellow);
     g2d.setXORMode(Color.red);
     g2d.setColor(Color.green);
     g2d.fill(ellipse);
     g2d.setColor(Color.yellow);
     g2d.fill(rect);
   }
} 