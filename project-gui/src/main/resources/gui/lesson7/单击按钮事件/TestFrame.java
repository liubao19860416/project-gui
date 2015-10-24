import java.awt.*;
import java.awt.event.*;
public class TestFrame
{
	public static void main(String [] args)
	{
		Frame f=new Frame("IT资讯交流网");
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
	//	((Window)e.getComponent()).dispose(); //两种方法都可以
		e.getWindow().dispose();  //e.getWindow()返回事件的发起方。类型Window
		System.exit(0);           //e.getComponent() 返回事件的发起方。类型Component
	}
	public void windowActivated(WindowEvent e){}
//	public void windowClosed(WindowEvent e){}
//	public void windowDeactivated(WindowEvent e){}
//	public void windowDeiconified(WindowEvent e){}
//	public void windowIconified(WindowEvent e){}
//	public void windowOpened(WindowEvent e){}
}