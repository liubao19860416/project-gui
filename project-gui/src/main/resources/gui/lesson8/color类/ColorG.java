import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorG extends JFrame{
    public ColorG(){
         ColorPanel jp=new ColorPanel();
         getContentPane().add(jp);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new ColorG();
     }
}

class ColorPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Color c=new Color(25,150,200);
     setBackground(Color.yellow);
     g.setColor(Color.red);
     g.fillOval(10,10,100,100);
     g.setColor(c);
     g.fillRect(40,40,40,40);
     Font f=new Font("Helvetica",Font.BOLD,18);
     g.setFont(f);
     g.setColor(Color.black);
     g.drawString("¿µ",50,30);
     g.drawString("Îõ",50,100);
     g.drawString("Í¨",20,70);
     g.drawString("±¦",80,70);
   }
} 
