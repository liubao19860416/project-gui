import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDialogDemo1
{
	public static void main(String[] args)
	{
		JDialog dialog = new JDialog();
		//dialog.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		dialog.addWindowListener(new WindowAdapter(){ 
        public void windowClosing(WindowEvent e) { 
        //this.dispose(); 
        System.exit(0);
         } 
         }); 
        dialog.setSize(800, 200);
        Container contentPane=dialog.getContentPane();
        contentPane.add(new JLabel("����һ��JLabel����������",JLabel.CENTER),BorderLayout.SOUTH);
        contentPane.add(new JLabel("����һ��JLabel���������",JLabel.CENTER),BorderLayout.WEST);
        contentPane.add(new JLabel("����һ��JLabel����������",JLabel.CENTER),BorderLayout.EAST);
        contentPane.add(new JLabel("����һ��JLabel����������",JLabel.CENTER),BorderLayout.NORTH);
        dialog.setVisible(true);        
	}
}