package project.base.file.pipe;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * PipedOutputStream发送端线程任务
 * 
 * @author Liubao
 * @2014年12月4日
 * 
 */
public class Sender extends Thread {

    private PipedOutputStream pos;

    public Sender(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void setPipedOutputStream(PipedOutputStream pis) {
        this.pos = pis;
    }

    public PipedOutputStream getPipedOutputStream() {
        return pos;
    }

    //任务
    public void run() {
        try {
            //TODO 这里可以执行其他的读取任务。。。
            
            pos.write("Sender is sending data...".getBytes());
            // pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
