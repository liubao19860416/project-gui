package project.base.file.pipe;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * PipedInputStream接收端线程任务
 * 
 * @author Liubao
 * @2014年12月4日
 * 
 */
public class Receiver extends Thread {

    private PipedInputStream pis;

    // 构造方法注入
    public Receiver(PipedInputStream pis) {
        this.pis = pis;
    }

    public void setPipedInputStream(PipedInputStream pis) {
        this.pis = pis;
    }

    public PipedInputStream getPipedInputStream() {
        return pis;
    }

    // 线程任务
    public void run() {
        byte[] buf = new byte[1024];
        int len = -1;
        try {
            // while((len = pis.read(buf))!=-1){
            len = pis.read(buf);
            System.out.println("receiver:" + new String(buf, 0, len));
            // }
            // pis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
