import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DrawLine
{
	
	
JFrame f= new JFrame("IT��Ѷ������");

   
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
			
//���û�ͼ��ɫΪ��ɫ
Graphics g=f.getGraphics();
           g.setColor(Color.red); //�������������һ���󽫲�������
		   g.drawLine(orgX,orgY,e.getX(),e.getY());
		  
			}	
    	});
	}
}