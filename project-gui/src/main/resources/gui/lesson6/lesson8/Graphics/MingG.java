import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class MingG extends JFrame{
    public MingG(){
         MingPanel jp=new MingPanel();
         getContentPane().add(jp);
         setSize(400,300);
         setVisible(true);
    }
    public static void main(String args[]){
          new MingG();
     }
}
class MingPanel extends JPanel {   
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d=(Graphics2D)g;
     Rectangle2D rect=new Rectangle2D.Double(50,50,250,150);
     BasicStroke bs=new BasicStroke(2f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
     g2d.setColor(Color.blue);
     g2d.setStroke(bs);
     g2d.draw(rect);
     Font f=new Font("Helvetica",Font.BOLD,20);
     g2d.setFont(f);
     g2d.setColor(Color.red);
     g2d.drawString("经销各种品牌MP3,MP4",65,70);
     Font f1=new Font("Helvetica",Font.PLAIN,12);
     g2d.setFont(f1);
     g2d.drawString("步步高电子词典，复读机特约经销商",70,90);
     Font f2=new Font("Helvetica",Font.BOLD,30);
     g2d.setFont(f2);
     g2d.drawString("刘红霞",120,120);
     Line2D line=new Line2D.Double(50,150,300,150);
     g2d.setColor(Color.blue);
     g2d.draw(line);
     Font f3=new Font("Helvetica",Font.BOLD,10);
     g2d.setFont(f3);
     g2d.setColor(Color.red);
     g2d.drawString("地址：郑州市京广北路20号新亚教育书店",65,160);
     g2d.drawString("电话：0371-66666666     手机：13633826164",65,170);
      g2d.drawString("QQ：276659722  ",65,180);
   }
}