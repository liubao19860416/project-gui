import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KeyE extends JFrame{
    Container content;
    JTextArea jta;
    public KeyE(){
         content=getContentPane();
         jta=new JTextArea(15,10);
         content.setLayout(new FlowLayout());
         jta.addKeyListener(new Mo());
         content.add(jta);
         setTitle("键盘事件测试");
         setSize(200,200);
         setVisible(true);
    }
   class Mo implements KeyListener{
          public void  keyPressed(KeyEvent e){
               int keyCode = e.getKeyCode();
               if ( keyCode ==e.VK_RIGHT && e.isShiftDown()){ 
                         jta.setBackground(Color.red);
                    }
                if(e.getKeyChar()=='e'){ // && e.isShiftDown()
                         System.exit(0);
                        // System.out.println("aaa");
                   }
               jta.setText(e.getKeyChar()+"键的码值为"+e.getKeyCode());
           }
          public void  keyReleased(KeyEvent e){}
          public void  keyTyped(KeyEvent e){}
      }
    public static void main(String args[]){
          new KeyE();
     }
}