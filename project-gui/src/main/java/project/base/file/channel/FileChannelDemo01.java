package project.base.file.channel;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.File;
import java.io.FileOutputStream;

public class FileChannelDemo01 {
    public static void main(String args[]) throws Exception {
        String info[] = { "MLDN", "MLDNJAVA", "www.mldn.cn", "www.mldnjava.cn",
                "李兴华", "lixinghua" };
        File file = new File("d:" + File.separator + "out.txt");
        FileOutputStream output = new FileOutputStream(file);
        FileChannel fout = output.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(1024);
        for (int i = 0; i < info.length; i++) {
            buf.put(info[i].getBytes());
        }
        buf.flip();
        fout.write(buf);
        fout.close();
        output.close();
    }
}