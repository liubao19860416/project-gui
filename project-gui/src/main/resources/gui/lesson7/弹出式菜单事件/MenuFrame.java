import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import javax.swing.event.*;  
  class  MenuFrame extends JFrame  
  {      
     public static final int DEFAULT_WIDTH=300;  
     public static final int DEFAULT_HEIGHT=200;      
     private   JPopupMenu   popup;  
     JButton b=new JButton();
    public MenuFrame()  
        {      
              setTitle("�����˵�����");  
              setSize(DEFAULT_WIDTH,   DEFAULT_HEIGHT);  
              popup=new JPopupMenu();  
              JMenuItem item=new   JMenuItem("�뵥��");  
              item.addActionListener(new  ActionListener(){  
                              public   void   actionPerformed(ActionEvent   e)  
                              {  
                                      JOptionPane.showMessageDialog(MenuFrame.this,"��Һ�","��ʾ�Ի���",1);  
                              }  
                      });  
              popup.add(item); 
              item=new   JMenuItem("���赥��"); 
              popup.add(item); 
              getContentPane().addMouseListener(new  MouseAdapter(){      
                          public   void   mousePressed(MouseEvent   event)  
                          {      
                                if(event.isPopupTrigger())  
                                      popup.show(event.getComponent(), event.getX(), event.getY());  
                          }  
                          public   void   mouseReleased(MouseEvent   event)  
                          {      
                                if   (event.isPopupTrigger())  
                                      popup.show(event.getComponent(),event.getX(),event.getY());  
                          }  
                    });  
        }  
       public static void main(String args[]){
              MenuFrame   frame   =   new   MenuFrame();  
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
             // frame.show();  
             frame.setVisible(true);
        } 
}  
