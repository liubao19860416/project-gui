import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WindowA extends JFrame{
    Container content;
    public WindowA(){
         content=getContentPane();
         content.setLayout(new FlowLayout());
         addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent e){
                System.exit(0);
               }
          });
         setTitle("�رյ�ǰ���ڲ���");
         setSize(200,200);
         setVisible(true);
    }

    public static void main(String args[]){
          new WindowA();
     }
}