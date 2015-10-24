import javax.swing.*;
import java.awt.*;
public class AppletG extends JApplet {   
   public void paint(Graphics g) {
     int x=120;
     int y=120;
     char a[]="IT ÔÚÖÐ¹ú(www.itzcn.com)".toCharArray();
     //for(int i=0;i<a.length;i++){
        // y=2*x-200;
       //  g.drawChars(a,i,a.length,x,y);
        // y=x+6;
     // }
     g.drawChars(a,5,16,x,y);
     g.drawChars(a,0,21,x,y+25);
   }
} 