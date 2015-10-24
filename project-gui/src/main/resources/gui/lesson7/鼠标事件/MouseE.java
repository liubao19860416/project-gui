import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseE extends JFrame{
    Container content;
    JTextField jtf;
    public MouseE(){
         content=getContentPane();
         jtf=new JTextField(15);
         content.setLayout(new FlowLayout());
         content.addMouseListener(new Mo());
         content.add(jtf);
         setTitle("鼠标事件测试");
         setSize(200,200);
         setVisible(true);
    }
   class Mo implements MouseListener{
            public void mousePressed(MouseEvent e){
                jtf.setText("鼠标在界面中被按下");
              }
            public void mouseReleased(MouseEvent e){
                 jtf.setText("鼠标在界面中被释放");
               }
            public void mouseEntered(MouseEvent e){
                 jtf.setText("鼠标进入到界面中");
                }
            public void mouseExited(MouseEvent e) {
                  jtf.setText("鼠标退出当前界面窗口");
             }
            public void mouseClicked(MouseEvent e){
                    jtf.setText("鼠标进行单击了，其位置X坐标为"+e.getX()+"Y坐标为"+e.getY());
              }

      }
    public static void main(String args[]){
          new MouseE();
     }
}