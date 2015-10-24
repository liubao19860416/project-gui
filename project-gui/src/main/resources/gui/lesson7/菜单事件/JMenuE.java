import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JMenuE extends JFrame{
    Container con;
    public JMenuE(){
        con=getContentPane();
        JMenuBar menubar=new JMenuBar();
        JMenu filemenu=new JMenu("文件");
        JMenu editmenu=new JMenu("编辑");
        JMenu helpmenu=new JMenu("帮助");
        JMenuItem item1=new JMenuItem("打开");
        JMenuItem item2=new JMenuItem("颜色");
        JMenuItem item3=new JMenuItem("退出");
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
                    Color newcolor=JColorChooser.showDialog(JMenuE.this,"调色板",getBackground());
                    con.setBackground(newcolor);
                 }
           });
         item3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                 }
           });
        setJMenuBar(menubar);
         setTitle("菜单事件测试");
         setSize(200,200);
         setVisible(true);
    }
   public static void main(String args[]){
         new JMenuE();
     }
}