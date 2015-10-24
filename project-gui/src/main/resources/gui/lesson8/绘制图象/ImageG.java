import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ImageG extends JFrame{
    public ImageG(){
         ImagePanel ip=new ImagePanel();
         getContentPane().add(ip);
         setSize(200,200);
         setVisible(true);
    }
    public static void main(String args[]){
          new ImageG();
     }
}
class ImagePanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Toolkit tool=this.getToolkit();
     Image image=tool.getImage("7.jpg");
     g.drawImage(image,10,10,image.getWidth(this),image.getHeight(this),this); 
   }
} 
