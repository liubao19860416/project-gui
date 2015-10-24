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
         DefaultMutableTreeNode root=new DefaultMutableTreeNode("ͼ��ר��");
         DefaultMutableTreeNode dm1=new DefaultMutableTreeNode("�����ͼ��");         
         DefaultMutableTreeNode dm2=new DefaultMutableTreeNode("�����������ͼ��");
         DefaultMutableTreeNode dm3=new DefaultMutableTreeNode("��ѧ��ͼ��");
         DefaultMutableTreeNode dm1_1=new DefaultMutableTreeNode("Javaʵ���̳�");
         DefaultMutableTreeNode dm1_2=new DefaultMutableTreeNode("JSP��ȫ");
         DefaultMutableTreeNode dm1_3=new DefaultMutableTreeNode("Ajax��ͨ");
         DefaultMutableTreeNode dm2_1=new DefaultMutableTreeNode("�й���������");
         DefaultMutableTreeNode dm2_2=new DefaultMutableTreeNode("̸��ҵ����");
         DefaultMutableTreeNode dm2_3=new DefaultMutableTreeNode("��������");
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
         setTitle("���¼�����");
         setSize(500,400);
         setVisible(true);
    }
    public void valueChanged(TreeSelectionEvent e){
            if(e.getSource()==tree){
                    DefaultMutableTreeNode node=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
                    if(node.isLeaf()){
                       String str=node.toString();
                       if(str.equals("Javaʵ���̳�"))
                        {text.setText(str+"\n���ߣ������� \t�廪������\n����ǳ�������۽��ܣ������ʵ������\n���Ǳ����һ����ɫ");}
                       if(str.equals("JSP��ȫ"))
                        {text.setText(str+"\n���ߣ�����ϼ");} 
                       if(str.equals("Ajax��ͨ"))
                        {text.setText(str+"\n���ߣ�������");} 
                       if(str.equals("�й���������"))
                        {text.setText(str+"\n���ߣ�����");}
                       if(str.equals("̸��ҵ����"))
                        {text.setText(str+"\n���ߣ�������");} 
                       if(str.equals("��������"))
                        {text.setText(str+"\n���ߣ�����˧");} 
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