package project.base.gui;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
/**
 * 音乐播放applet小程序
 * @author Liubao
 * @2014年12月4日
 *
 */
public class SoundImage extends Applet implements Runnable {
    
    private static final long serialVersionUID = 7471075165355596792L;

    public static void main(String[] args) {
        new SoundImage().start();
    }
    
    private static int WIDTH=400; 
    private static int HEIGHT=300; 
    public final static Color DEFAULT_COLOR = Color.yellow;
    public final static String AUDIO_FILEPATH = "d:\\temp\\jijiao.au";
    
    
    Button button1 = new Button();
    Button button2 = new Button();
    Button button3 = new Button();
    Random randomNumber = new Random();
    Thread shapeThread = null;
    Color ImageColor;
    AudioClip audioclip1;

    //启动方法
    public void start() {
        if (shapeThread == null) {
            shapeThread = new Thread(this);
            shapeThread.start();
        }
    }

    //线程任务
    public void run() {
        while (true) {
            switch (randomNumber.nextInt(8)) {
            case 0:
                ImageColor = Color.black;
                break;
            case 1:
                ImageColor = Color.blue;
                break;
            case 2:
                ImageColor = Color.cyan;
                break;
            case 3:
                ImageColor = Color.magenta;
                break;
            case 4:
                ImageColor = Color.orange;
                break;
            case 5:
                ImageColor = Color.white;
                break;
            case 6:
                ImageColor = Color.green;
                break;
            default:
                ImageColor = Color.red;
            }
            try {
                Thread.sleep(1000);
                repaint();
            } catch (InterruptedException e) {
                repaint();
            }
        }
    }

    public void init() {
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(DEFAULT_COLOR);
        button1.setLabel("播放音乐");
        button2.setLabel("循环播放音乐");
        button3.setLabel("ֹͣ停止音乐");
        this.add(button1);
        this.add(button2);
        this.add(button3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                audioclip1 = getAudioClip(getCodeBase(), AUDIO_FILEPATH);
                // audioclip1=getAudioClip(getCodeBase(),
                showStatus("播放音乐");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // audioclip1.loop();
                showStatus("循环播放音乐");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // audioclip1.stop();
                showStatus("停止音乐");
            }
        });

    }

    /**
     * 随机绘图方法
     */
    public void paint(Graphics g) {
        g.setColor(ImageColor);
        switch (randomNumber.nextInt(3)) {
        case 0:
            g.fillRect(120, 60, 150, 200);
            break;
        case 1:
            g.fillOval(140, 80, 100, 100);
            break;
        case 2:
            g.fillRect(120, 60, 150, 180);
            break;
        default:
            g.fillOval(120, 60, 160, 200);
            break;
        }
    }

}