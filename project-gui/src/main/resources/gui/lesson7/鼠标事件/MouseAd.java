import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseAd extends JFrame{
    Container content;
    JTextField jtf;
    public MouseAd(){
         content=getContentPane();
         jtf=new JTextField("这是一个文本区",15);
         content.setLayout(new FlowLayout());
         content.addMouseListener(new Mo());
         content.add(jtf);
         setTitle("鼠标适配器测试");
         setSize(200,200);
         setVisible(true);
    }
   class Mo extends MouseAdapter{
            public void mouseEntered(MouseEvent e){
                 jtf.setBackground(Color.red);
                }
            public void mouseClicked(MouseEvent e){
                   int x = e.getX();
                   int y = e.getY();
                   int clickCount = e.getClickCount();
                   if(clickCount == 2){
                      Graphics g = getGraphics();
                      g.drawString("鼠标双击！", x, y);
                      g.dispose();
                   }
              }
      }
    public static void main(String args[]){
          new MouseAd();
     }
}