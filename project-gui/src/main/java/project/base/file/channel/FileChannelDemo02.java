package project.base.file.channel;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileChannelDemo02 {
    public static void main(String args[]) throws Exception {
        File file1 = new File("d:" + File.separator + "note.txt");
        File file2 = new File("d:" + File.separator + "outnote.txt");
        FileInputStream input = null;
        FileOutputStream output = null;
        output = new FileOutputStream(file2);
        input = new FileInputStream(file1);
        FileChannel fout = null;
        FileChannel fin = null;
        fout = output.getChannel();
        fin = input.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(1024);

        int temp = -1;
        while ((temp = fin.read(buf)) != -1) {
            buf.flip();
            fout.write(buf,temp);
            buf.clear();
        }
        fin.close();
        fout.close();
        input.close();
        output.close();
    }
}