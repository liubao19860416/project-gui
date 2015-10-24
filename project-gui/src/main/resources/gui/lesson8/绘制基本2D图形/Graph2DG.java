import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Graph2DG extends JFrame{
    public Graph2DG(){
         G2DPanel jp=new G2DPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new Graph2DG();
     }
}
class G2DPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d=(Graphics2D)g;
     g2d.setColor(Color.cyan);
     Rectangle2D rect=new Rectangle2D.Double(0,0,200,200);
     g2d.fill(rect);
     Arc2D arc1=new Arc2D.Double(0,0,200,200,0,180,Arc2D.CHORD),
           arc2=new Arc2D.Double(0,0,200,200,0,-180,Arc2D.CHORD);
     RoundRectangle2D round1=new RoundRectangle2D.Double(0,50,100,100,100,100);
     RoundRectangle2D round2=new RoundRectangle2D.Double(100,50,100,100,100,100);
     RoundRectangle2D round3=new RoundRectangle2D.Double(37.5,87.8,25,25,25,25);
     RoundRectangle2D round4=new RoundRectangle2D.Double(137.5,87.8,25,25,25,25);
     g2d.setColor(Color.white);
     g2d.fill(arc1);
   g2d.setColor(Color.black);
     g2d.fill(arc2);
     g2d.fill(round1);
     g2d.setColor(Color.white);
     g2d.fill(round2);
     g2d.fill(round3);
     g2d.setColor(Color.black);
     g2d.fill(round4); 
   }
} 
