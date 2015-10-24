import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JMenuE extends JFrame{
    Container con;
    public JMenuE(){
        con=getContentPane();
        JMenuBar menubar=new JMenuBar();
        JMenu filemenu=new JMenu("�ļ�");
        JMenu editmenu=new JMenu("�༭");
        JMenu helpmenu=new JMenu("����");
        JMenuItem item1=new JMenuItem("��");
        JMenuItem item2=new JMenuItem("��ɫ");
        JMenuItem item3=new JMenuItem("�˳�");
        filemenu.add(item1);filemenu.add(item2);filemenu.add(item3);
        menubar.add(filemenu);
        menubar.add(editmenu);
        menubar.add(helpmenu);
        item1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                        JFileChooser chooser = new JFileChooser("d:\\");
                        int returnVal = chooser.showOpenDialog(JMenuE.this);
                        if(returnVal == JFileChooser.APPROVE_OPTION) {
                               System.out.println("You chose to open this file: " +
                                chooser.getSelectedFile().getName());
                          }
                  }
           }); 
         item2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Color newcolor=JColorChooser.showDialog(JMenuE.this,"��ɫ��",getBackground());
                    con.setBackground(newcolor);
                 }
           });
         item3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                 }
           });
        setJMenuBar(menubar);
         setTitle("�˵��¼�����");
         setSize(200,200);
         setVisible(true);
    }
   public static void main(String args[]){
         new JMenuE();
     }
}