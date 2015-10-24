package project.base.gui.chat_demo;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Chat extends JFrame {

    List list = new List(6);
    TextField tfIP = new TextField(15);
    TextField tfDate = new TextField(20);

    public void Chat() {

        this.add(list, "Center");
        Panel p = new Panel();
        this.add(p, "South");

        p.setLayout(new BorderLayout());
        p.add(tfIP, BorderLayout.WEST);
        p.add(tfDate, "East");

        tfDate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDate.setText("");
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // super.windowClosing(e);
                dispose();
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater(new Runnable() {
        // public void run() {
        Chat inst = new Chat();
        inst.setSize(300, 400);
        inst.setTitle(" ");
        inst.setVisible(true);
        inst.setResizable(false);

        // inst.setLocationRelativeTo(null);
        // inst.setVisible(true);
        // }
        // });
    }

    // public Chat() {
    // super();
    // initGUI();
    // }

    // private void initGUI() {
    // try {
    // setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    // pack();
    // setSize(400, 300);
    // } catch (Exception e) {
    // // add your error handling code here
    // e.printStackTrace();
    // }
    // }

}
