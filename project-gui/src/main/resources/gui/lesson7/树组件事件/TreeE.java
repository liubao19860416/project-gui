import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;
import javax.swing.event.*;
class TreeE extends JFrame implements TreeSelectionListener{
    JTree tree=null; 
    Container content;
    JTextArea text=new JTextArea(20,20);
    public TreeE(){
         content=getContentPane();
         content.setLayout(new FlowLayout());
         DefaultMutableTreeNode root=new DefaultMutableTreeNode("图书专柜");
         DefaultMutableTreeNode dm1=new DefaultMutableTreeNode("计算机图书");         
         DefaultMutableTreeNode dm2=new DefaultMutableTreeNode("经济与管理类图书");
         DefaultMutableTreeNode dm3=new DefaultMutableTreeNode("文学类图书");
         DefaultMutableTreeNode dm1_1=new DefaultMutableTreeNode("Java实例教程");
         DefaultMutableTreeNode dm1_2=new DefaultMutableTreeNode("JSP大全");
         DefaultMutableTreeNode dm1_3=new DefaultMutableTreeNode("Ajax精通");
         DefaultMutableTreeNode dm2_1=new DefaultMutableTreeNode("中国金融走向");
         DefaultMutableTreeNode dm2_2=new DefaultMutableTreeNode("谈商业经济");
         DefaultMutableTreeNode dm2_3=new DefaultMutableTreeNode("经济走向");
         root.add(dm1);root.add(dm2);
         dm1.add(dm1_1);dm1.add(dm1_2);dm1.add(dm1_3);
         dm2.add(dm2_1);dm2.add(dm2_2);dm2.add(dm2_3);
         tree=new JTree(root);
         DefaultTreeCellRenderer render=new DefaultTreeCellRenderer();
         render.setBackground(Color.yellow);
         render.setTextSelectionColor(Color.red);
         render.setTextNonSelectionColor(Color.green);
         render.setFont(new Font("TimeRoman",Font.BOLD,16));
         tree.setCellRenderer(render);
         JScrollPane scrollpane=new JScrollPane(text);
         JSplitPane splitpane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,tree,scrollpane);
         tree.addTreeSelectionListener(this);
         content.add(splitpane);
         addWindowListener(new WindowAdapter(){
               public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
           }); 
         setTitle("树事件测试");
         setSize(500,400);
         setVisible(true);
    }
    public void valueChanged(TreeSelectionEvent e){
            if(e.getSource()==tree){
                    DefaultMutableTreeNode node=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
                    if(node.isLeaf()){
                       String str=node.toString();
                       if(str.equals("Java实例教程"))
                        {text.setText(str+"\n作者：刘海松 \t清华出版社\n深入浅出的理论介绍，经典的实例讲解\n，是本书的一大特色");}
                       if(str.equals("JSP大全"))
                        {text.setText(str+"\n作者：刘红霞");} 
                       if(str.equals("Ajax精通"))
                        {text.setText(str+"\n作者：王华林");} 
                       if(str.equals("中国金融走向"))
                        {text.setText(str+"\n作者：赵天");}
                       if(str.equals("谈商业经济"))
                        {text.setText(str+"\n作者：曹玉铃");} 
                       if(str.equals("经济走向"))
                        {text.setText(str+"\n作者：李章帅");} 
                     }
                  else{
                      text.setText(node.getUserObject().toString());
                   }
                }
    }
    public static void main(String args[]){
          new TreeE();
     }
}