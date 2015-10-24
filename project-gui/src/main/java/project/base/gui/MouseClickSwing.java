package project.base.gui;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 获取当前鼠标点击的坐标信息
 * 
 * @author Liubao
 * @2014年12月3日
 * 
 */
public class MouseClickSwing implements MouseListener {
    
    //测试main方法
    public static void main(String[] args) {
        new MouseClickSwing().begin();
    }

    private Frame f;
    private TextField t;

    public void begin() {
        f = new Frame("Mouse");
        f.setSize(600, 600);
        f.setLayout(new GridLayout());
        f.addWindowListener(new WindowAdapter() {
            // 覆写的鼠标关闭按钮触发监听事件
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        t = new TextField(10);
        f.add(t);
        f.setVisible(true);
        t.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        t.setText(String.valueOf(e.getX() + ",") + String.valueOf(e.getY()));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }
}
