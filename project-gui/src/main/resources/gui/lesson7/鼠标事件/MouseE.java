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
         setTitle("����¼�����");
         setSize(200,200);
         setVisible(true);
    }
   class Mo implements MouseListener{
            public void mousePressed(MouseEvent e){
                jtf.setText("����ڽ����б�����");
              }
            public void mouseReleased(MouseEvent e){
                 jtf.setText("����ڽ����б��ͷ�");
               }
            public void mouseEntered(MouseEvent e){
                 jtf.setText("�����뵽������");
                }
            public void mouseExited(MouseEvent e) {
                  jtf.setText("����˳���ǰ���洰��");
             }
            public void mouseClicked(MouseEvent e){
                    jtf.setText("�����е����ˣ���λ��X����Ϊ"+e.getX()+"Y����Ϊ"+e.getY());
              }

      }
    public static void main(String args[]){
          new MouseE();
     }
}