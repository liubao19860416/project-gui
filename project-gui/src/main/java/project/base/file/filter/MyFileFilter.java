package project.base.file.filter;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器
 */
public class MyFileFilter implements FileFilter {
    
    private String[] prexs = {};
    
    public MyFileFilter( String[] prexs){
        this.prexs=prexs;
    }
    
    //文件名过滤器
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return false;
        }
        String name = file.getName();
        int index = name.lastIndexOf('.');
        String prefix = (index > -1) ? name.substring(index) : null;
        String suffix = (index > -1) ? name.substring(0, index) : null;

        if (prefix == null || suffix == null) {
            return false;
        }

        for (int i = 0; i < prexs.length; i++) {
            if (prexs[i].equalsIgnoreCase(prefix))
                return true;
        }
        return false;
    }
}
