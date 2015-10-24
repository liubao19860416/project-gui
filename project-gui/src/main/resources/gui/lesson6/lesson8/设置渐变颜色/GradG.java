import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class GradG extends JFrame{
    public GradG(){
         GradPanel jp=new GradPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new GradG();
     }
}
class GradPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d=(Graphics2D)g;
     BasicStroke bs1=new BasicStroke(20f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
     QuadCurve2D curve=new QuadCurve2D.Double(2,100,51,10,100,100);
     GradientPaint grad=new GradientPaint(2,100,Color.red,51,10,Color.green,true);
     g2d.setPaint(grad);
     g2d.setStroke(bs1);
     g2d.draw(curve);
   }
} 
