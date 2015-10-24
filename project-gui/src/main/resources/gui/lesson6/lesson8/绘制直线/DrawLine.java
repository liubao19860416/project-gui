import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DrawLine
{
	
	
JFrame f= new JFrame("IT资讯交流网");

   
	public static void main(String [] args)
	{	
	
		new DrawLine().init();	
	}
	public void init()
	{
		
		f.setSize(300,300);
		f.setVisible(true);
		f.addMouseListener(new MouseAdapter()
        {
	        int orgX;
	        int orgY;
            public void mousePressed(MouseEvent e)
            {
		        orgX=e.getX();
		        orgY=e.getY();
		        
            }
            public void mouseReleased(MouseEvent e)
	        {
			
//设置绘图颜色为红色
Graphics g=f.getGraphics();
           g.setColor(Color.red); //该语句若放在下一语句后将不起作用
		   g.drawLine(orgX,orgY,e.getX(),e.getY());
		  
			}	
    	});
	}
}