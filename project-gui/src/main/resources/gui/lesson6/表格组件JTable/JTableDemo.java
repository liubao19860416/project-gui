import javax.swing.*;
import javax.swing.table.*;
import java.awt.Container;
public class JTableDemo
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("BorderLayoutdemo");
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentpane=frame.getContentPane();
		//object�������ж���ĸ��࣬�������κ��඼��ʵ�ֶ�ά���� 
		Object tableDate[][]=new Object[3][8];
		for (int i=0;i<3;i++)
		{
			tableDate[i][0]="����"+i;
			for(int j=1;j<8;j++)
			{
				tableDate[i][j]=0;
			}
		}
		String name[]={"����","��ѧ","����","Ӣ��","����","��ѧ","����","�ܷ�"};
		JTable table=new JTable(tableDate,name);
		contentpane.add(new JScrollPane(table));
		frame.setVisible(true);
	}
}