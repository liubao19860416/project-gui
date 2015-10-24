import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseMe extends JFrame{
    Container content;
    int x=-1,y=-1;
    public MouseMe(){
         content=getContentPane();
         content.setLayout(new FlowLayout());
         content.setBackground(Color.green);
         content.addMouseMotionListener(new Mo());
         setTitle("鼠标高级事件测试");
         setSize(200,200);
         setVisible(true);
    }
   class Mo implements MouseMotionListener{
            public void mouseDragged(MouseEvent e){
                  x=(int)e.getX();
                  y=(int)e.getY();
                  // if(x!=-1 && y!=-1)
                   {
                    Graphics g=MouseMe.this.getGraphics();
                      g.drawLine(x,y,x,y);
                   }
               }
            public void mouseMoved(MouseEvent e){}
      }
    public static void main(String args[]){
          new MouseMe();
     }
}