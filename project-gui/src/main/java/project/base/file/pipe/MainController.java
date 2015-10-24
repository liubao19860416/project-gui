package project.base.file.pipe;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 总的控制器：PipedOutputStream和PipedInputStream组合使用
 * 
 * @author Liubao
 * @2014年12月4日
 * 
 */
public class MainController {

    public static void main(String[] args) throws IOException {

        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();

        Receiver r1 = new Receiver(pis);// .start();
        Sender s1 = new Sender(pos);// .start();

        /**
         *  一种新的连接方法
         */
        PipedOutputStream pos1 = s1.getPipedOutputStream();
        PipedInputStream pis1 = r1.getPipedInputStream();

        // 连接管道流,可以互相连接，只能用一个就行了
        pos1.connect(pis1);
        //pis1.connect(pos1);

        // 启动各自的流
        s1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("程序结束了。。");

    }

}
