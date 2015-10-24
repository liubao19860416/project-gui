import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ItemE extends JFrame{
    Container content;
    JComboBox combo;
    JLabel jl;
    public ItemE(){
         content=getContentPane();
         String s[]={"VB.NET","C++教程","Delphi开发实例","Java"};
         combo=new JComboBox(s);
         jl=new JLabel();
         content.setLayout(new FlowLayout());
         combo.addItemListener(new Mo());
         content.add(combo);
         content.add(jl);
         setTitle("选项事件测试");
         setSize(200,200);
         setVisible(true);
    }
   class Mo implements ItemListener{
          public void itemStateChanged(ItemEvent e){
              if(combo.getSelectedIndex()==0)
                 jl.setIcon(new ImageIcon("1.jpg"));
              if(combo.getSelectedIndex()==1)
                 jl.setIcon(new ImageIcon("2.jpg"));
              if(combo.getSelectedIndex()==2)
                 jl.setIcon(new ImageIcon("3.jpg"));
              if(combo.getSelectedIndex()==3)
                 jl.setIcon(new ImageIcon("4.jpg"));
           }
      }
    public static void main(String args[]){
          new ItemE();
     }
}