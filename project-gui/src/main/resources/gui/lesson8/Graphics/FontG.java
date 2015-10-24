import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FontG extends JFrame{
    public FontG(){
         FontPanel jp=new FontPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new FontG();
     }
}

class FontPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Font f=new Font("Helvetica",Font.BOLD+Font.ITALIC,24);
     g.setFont(f);
     String quote="2008 北京奥运会";
     g.drawString(quote,20,20);
   }
} 
