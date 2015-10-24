package project.base.others.usbdemo;

import java.io.InputStream;
import java.util.Properties;
/**
 * 控制器
 * @author Liubao
 * @2014年12月3日
 *
 */
public class ComputerController {

    public static void main(String[] args) {
        Mainboard mainBoard = new Mainboard();
        InputStream inputStream = ComputerController.class.getClassLoader().getResourceAsStream("USB.properties");
        Properties pop = new Properties();
        try {
            pop.load(inputStream);
            // 加载配置文件
            for (int i = 0; i < pop.size(); i++) {
                String USBName = pop.getProperty("USB" + (i + 1));
                Usb usb = null;
                try {
                    usb = (Usb) Class.forName(USBName).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 启动
                mainBoard.useUSB(usb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

}
