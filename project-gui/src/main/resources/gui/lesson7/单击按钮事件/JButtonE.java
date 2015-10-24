import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JButtonE extends JFrame{
    JButton jbutton; 
    Container content;
    public JButtonE(){
         content=getContentPane();
         content.setLayout(new FlowLayout());
         jbutton=new JButton("改变");
         jbutton.addActionListener(new Jbe());
         content.add(jbutton);
         setTitle("按钮事件测试");
         setSize(200,200);
         setVisible(true);
    }
   class Jbe implements ActionListener{
            public void actionPerformed(ActionEvent e){
                content.setBackground(Color.red);
             }
      }
    public static void main(String args[]){
          new JButtonE();
     }
}