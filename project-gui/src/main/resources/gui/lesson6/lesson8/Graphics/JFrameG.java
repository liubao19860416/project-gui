import javax.swing.*;
import java.awt.*;
public class JFrameG extends JFrame{
    public JFrameG(){
         setSize(200,200);
         setVisible(true);
    }
   public void paint(Graphics g) {
       super.paint(g);
       String quote="www.itzcn.com��һ��ITѧϰ��վ";
       g.drawString(quote,50,50);
   }
    public static void main(String args[]){
          new JFrameG();
     }
}




