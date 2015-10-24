import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class PaodG extends JFrame{
    public PaodG(){
         PaodPanel jp=new PaodPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new PaodG();
     }
}
class PaodPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d=(Graphics2D)g;
     RoundRectangle2D rect=new RoundRectangle2D.Double(50,50,100,50,16,10);
     BasicStroke bs=new BasicStroke(20f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
     g2d.setColor(Color.gray);
     g2d.setStroke(bs);
     g2d.draw(rect);
   }
} 