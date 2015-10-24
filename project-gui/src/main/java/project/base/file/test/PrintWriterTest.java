package project.base.file.test;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Test;
/**
 * PrintWriter测试输出StringWriter数据以及printStackTrace输出PrintWriter
 * @author Liubao
 * @2014年12月4日
 *
 */
public class PrintWriterTest {

    @Test
    public static void testStringWriter() throws Exception {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw, true);
        new RuntimeException(" 测试数据").printStackTrace(pw);
        sw.flush();
        System.out.println(sw.toString());

    }

}
