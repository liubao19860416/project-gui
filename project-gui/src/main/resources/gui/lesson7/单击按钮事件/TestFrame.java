import java.awt.*;
import java.awt.event.*;
public class TestFrame
{
	public static void main(String [] args)
	{
		Frame f=new Frame("IT��Ѷ������");
		f.setSize(300,300);
		f.setVisible(true);
		f.addWindowListener(new MyWindowListener());
	}
}
class MyWindowListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		e.getWindow().setVisible(false);
	//	((Window)e.getComponent()).dispose(); //���ַ���������
		e.getWindow().dispose();  //e.getWindow()�����¼��ķ��𷽡�����Window
		System.exit(0);           //e.getComponent() �����¼��ķ��𷽡�����Component
	}
	public void windowActivated(WindowEvent e){}
//	public void windowClosed(WindowEvent e){}
//	public void windowDeactivated(WindowEvent e){}
//	public void windowDeiconified(WindowEvent e){}
//	public void windowIconified(WindowEvent e){}
//	public void windowOpened(WindowEvent e){}
}