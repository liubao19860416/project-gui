import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WindowE extends JFrame{
    Container content;
    JTextArea jtf;
    public WindowE(){
    //	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         content=getContentPane();
         jtf=new JTextArea(10,10);
         content.setLayout(new FlowLayout());
         addWindowListener(new Mo());
         content.add(jtf);
         setTitle("�����¼�����");
         setSize(200,200);
         setVisible(true);
    }
   class Mo implements WindowListener{
           public void windowClosing(WindowEvent e){
                 jtf.append("\n�������ڹر�");
              }
           public void windowOpened(WindowEvent e){
                  jtf.append("\n���ڴ�");
             }
           public void windowIconified(WindowEvent e){
                  jtf.append("\n������С��");
             }
           public void windowDeiconified(WindowEvent e){
                  jtf.append("\n����ͼ�껯");
              }
           public void windowClosed(WindowEvent e){
                  jtf.append("\n����������У��رմ���");
             }
           public void windowActivated(WindowEvent e){
                   jtf.append("\n���ڱ�����");
             }
           public void windowDeactivated(WindowEvent e){
                   jtf.append("\n���ڲ��ڼ���״̬");
             } 
      } 
    public static void main(String args[]){
          new WindowE();
     }
}