import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class AreaG extends JFrame{
    public AreaG(){
         AreaPanel jp=new AreaPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new AreaG();
     }
}
class AreaPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d=(Graphics2D)g;
     Ellipse2D ellipse1=new Ellipse2D.Double(20,80,60,60);
Ellipse2D ellipse2=new Ellipse2D.Double(40,80,80,80);
Area a1=new Area(ellipse1);
Area a2=new Area(ellipse2);
a1.subtract(a2);
g2d.fill(a1);

   }
} 