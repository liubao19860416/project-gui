import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class StringG extends JFrame{
    public StringG(){
         FontsPanel jp=new FontsPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new StringG();
     }
}

class FontsPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     String quote="2008 北京奥运会";
     g.drawString(quote,20,20);
   }
} 
