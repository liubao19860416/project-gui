import java.awt.*;
import javax.swing.*;
/** *//**
 * Method Container.pain() Test.
 * Using paint() to draw some shapes.
 * @author nyzhl
*/
public class PaintTest {
    public static void main (String[] args) {
        new MyFrame();
    }     
}
/** *//**
 * Design window
*/
class MyFrame extends JFrame {
    public MyFrame() {
        setBounds(200,200,200,200);
        setVisible(true);
    }
    public void paint(Graphics g) {
    	super.paint(g);
        Color c = g.getColor();
        g.setColor(Color.red);
        g.drawLine(20,20,100,80);
        g.setColor(Color.blue);
        g.fill3DRect(50,50,50,80,true);
        g.setColor(Color.yellow);
        g.drawString("PaintTest.java",50,150);
        g.setColor(c);
    }
}
