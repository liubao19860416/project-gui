package project.base.file.channel;

import java.io.File;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo03 {
    public static void main(String args[]) throws Exception {
        File file = new File("d:" + File.separator + "mldn.txt");
        FileInputStream input =  new FileInputStream(file);
        FileChannel fin = input.getChannel();
        MappedByteBuffer mbb = null;
        mbb = fin.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
        byte data[] = new byte[(int) file.length()];
        int foot = 0;
        while (mbb.hasRemaining()) {
            data[foot++] = mbb.get();
        }
        System.out.println(new String(data));
        fin.close();
        input.close();
    }
}