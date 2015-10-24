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
         setTitle("窗口事件测试");
         setSize(200,200);
         setVisible(true);
    }
   class Mo implements WindowListener{
           public void windowClosing(WindowEvent e){
                 jtf.append("\n窗口正在关闭");
              }
           public void windowOpened(WindowEvent e){
                  jtf.append("\n窗口打开");
             }
           public void windowIconified(WindowEvent e){
                  jtf.append("\n窗口最小化");
             }
           public void windowDeiconified(WindowEvent e){
                  jtf.append("\n撤销图标化");
              }
           public void windowClosed(WindowEvent e){
                  jtf.append("\n程序结束运行，关闭窗口");
             }
           public void windowActivated(WindowEvent e){
                   jtf.append("\n窗口被激活");
             }
           public void windowDeactivated(WindowEvent e){
                   jtf.append("\n窗口不在激活状态");
             } 
      } 
    public static void main(String args[]){
          new WindowE();
     }
}