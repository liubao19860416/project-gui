package project.base.others.studentos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileOperator {
    private File file = null;

    public FileOperator(String file) {
        this.file = new File(file);
    }

    public void save(Object obj) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(obj);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Object load() {
        Object temp = null;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            temp = ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }
}
