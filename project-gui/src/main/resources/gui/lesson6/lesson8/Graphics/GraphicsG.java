import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsG extends JFrame{
    public GraphicsG(){
         GraphicsPanel jp=new GraphicsPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new GraphicsG();
     }
}

class GraphicsPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     g.drawLine(64,70,150,156);
     g.drawRect(24,22,60,34);
     g.drawRoundRect(10,10,90,60,50,30);
     g.fillOval(10,80,120,60);
     int px1[]={40,40,60,80,100,70};
     int py1[]={80,40,20,10,30,70};
     g.drawPolygon(px1,py1,6);
   }
} 
