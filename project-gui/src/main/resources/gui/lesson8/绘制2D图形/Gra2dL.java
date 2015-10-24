import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*; 

public class Gra2dL extends JFrame{
    public Gra2dL(){
         LinePanel lp=new LinePanel();
         getContentPane().add(lp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new Gra2dL();
     }
}

class LinePanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d=(Graphics2D)g;
     Line2D line=new Line2D.Double(2,2,150,150);
     Line2D line1=new Line2D.Float(2,2,2,150);
     g2d.setColor(Color.red);
     g2d.draw(line);
     g2d.draw(line1);

   }
} 
