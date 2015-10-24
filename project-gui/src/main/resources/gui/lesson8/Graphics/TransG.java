import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class TransG extends JFrame{
    public TransG(){
         TransPanel jp=new TransPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new TransG();
     }
}
class TransPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d=(Graphics2D)g;
     Ellipse2D ellipse=new Ellipse2D.Double(20,50,120,50);
     g2d.setColor(Color.blue);
     AffineTransform trans=new AffineTransform();
     for(int i=1;i<=24;i++){
          trans.rotate(15.0*Math.PI/180,80,75);
          g2d.setTransform(trans);
          g2d.draw(ellipse);
      }

   }
} 
