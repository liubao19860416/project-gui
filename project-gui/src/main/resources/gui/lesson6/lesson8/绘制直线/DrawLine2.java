import java.awt.*;
import java.awt.event.*;
public class DrawLine2
{
	Frame f= new Frame("IT��Ѷ������");
	public static void main(String [] args)
	{
		new DrawLine2().init();	
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
	        	Graphics g=f.getGraphics();
				g.setColor(Color.red);
				g.setFont(new Font("����",Font.ITALIC|Font.BOLD,30));
                  //���û�ͼ��ɫΪ��ɫ
                g.drawString(new String(orgX+","+orgY),orgX,orgY);
                g.drawString(new String(e.getX()+","+e.getY()),e.getX(),e.getY());
                g.drawLine(orgX,orgY,e.getX(),e.getY());
                System.out.println("123");
		
			}	
    	});
	}
}