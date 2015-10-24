import javax.swing.*;
import java.awt.*;
public class NullLayoutDemo
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("NullLayout");
    	frame.setSize(250,150);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container contentPane=frame.getContentPane();
    	JPanel center=new JPanel();
    	center.setLayout(null);
	    JButton button=null;
    	int index=0;
    	for(int i=0;i<3;i++)
    	{
	    	for(int j=0; j<3; j++)
		    {
		    	button=new JButton((index++)+""); //数字与字符窜相连接结果为字符串型
		       	button.setBounds(j*50+18,i*30+5,45,27);  //绝对定位
		    	center.add(button);
	    	}
    	}
	    contentPane.add(center);
	    frame.setVisible(true);
    }
}