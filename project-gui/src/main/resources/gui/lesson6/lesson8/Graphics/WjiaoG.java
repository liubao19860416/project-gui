import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class WjiaoG extends JFrame{
    public WjiaoG(){
         WjiaoPanel jp=new WjiaoPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new WjiaoG();
     }
}
class WjiaoPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d=(Graphics2D)g;
     g2d.setColor(Color.red);
     int xpoint[]={55,67,109,73,83,55,27,37,1,43};
     int ypoint[]={0,36,36,54,96,72,96,54,36,36};
     GeneralPath star=new GeneralPath();
     star.moveTo(xpoint[0],ypoint[0]);
     for(int count=1;count<xpoint.length;count++)
     star.lineTo(xpoint[count],ypoint[count]);
     star.closePath();
     g2d.draw(star);
   }
} 