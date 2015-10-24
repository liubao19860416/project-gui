import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
public class JTreeDemo1
{
	public  static void main(String[] args)
	{
		JFrame frame=new JFrame("JTree");
		frame.setSize(160,220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new JTreeDemo1().createComponent());
		frame.pack();
		frame.setVisible(true);
	}
	private JPanel createComponent()
	{
		JPanel panel=new JPanel();
		String students[][]=new String[3][];
		DefaultMutableTreeNode root=new DefaultMutableTreeNode();
		students[0]=new String[]{"李俊","王红","成飞","成成","小飞","张花"};
		students[1]=new String[]{"孙南","赵敏","成花","刘多","魏军","史可","吴平"};
		students[2]=new String[]{"王郎","关军","钱趄","称丹","刘云"};
		String gradeNames[]={"2005届","2006届","2008届"};
		DefaultMutableTreeNode node=null;
		DefaultMutableTreeNode childNode=null;
		int length=0;
		for(int i=0; i<3;i++)
		{
			length=students[i].length;
			node=new DefaultMutableTreeNode(gradeNames[i]);
			for(int j=0;j<length;j++)
			{
		    	childNode=new DefaultMutableTreeNode(students[i][j]);
			    node.add(childNode);
			}
			root.add(node);
		}
	   JTree tree=new JTree(root);
	   panel.add(tree);
       panel.setVisible(true);
       return panel;
	} 
	
}