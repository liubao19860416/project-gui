import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Line2DG extends JFrame{
    public Line2DG(){
         LinePanel jp=new LinePanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new Line2DG();
     }
}
class LinePanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d=(Graphics2D)g;
     BasicStroke bs1=new BasicStroke(5f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
     BasicStroke bs2=new BasicStroke(10f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER);
     Line2D line1=new Line2D.Double(20,20,20,100);
     Line2D line2=new Line2D.Double(20,20,100,20);
     Line2D line3=new Line2D.Double(20,100,100,100);
     Line2D line4=new Line2D.Double(100,20,100,100);
     g2d.setStroke(bs2);
     g2d.draw(line1);
     g2d.draw(line3);
     g2d.draw(line2);
     g2d.draw(line4);
     g2d.setStroke(bs1);
     Line2D line5=new Line2D.Double(40,40,80,40);
     Line2D line6=new Line2D.Double(40,60,80,60);
     Line2D line7=new Line2D.Double(40,80,80,80);
     Line2D line8=new Line2D.Double(60,40,60,80);
     Line2D line9=new Line2D.Double(70,70,75,75);
     g2d.draw(line5); 
     g2d.draw(line6);
     g2d.draw(line7);
     g2d.draw(line8);
     g2d.draw(line9);
   }
} 
