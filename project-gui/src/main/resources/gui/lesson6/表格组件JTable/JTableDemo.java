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
		//object代表所有对象的父类，所以用任何类都能实现二维数组 
		Object tableDate[][]=new Object[3][8];
		for (int i=0;i<3;i++)
		{
			tableDate[i][0]="姓名"+i;
			for(int j=1;j<8;j++)
			{
				tableDate[i][j]=0;
			}
		}
		String name[]={"姓名","数学","语文","英语","物理","化学","生物","总分"};
		JTable table=new JTable(tableDate,name);
		contentpane.add(new JScrollPane(table));
		frame.setVisible(true);
	}
}