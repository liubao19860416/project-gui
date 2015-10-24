package project.base.others.usbdemo;

public class Mainboard {
    // 属性
    private Usb usb;

    public Mainboard() {
        super();
        System.out.println("mainBoard running1");
    }
    public void useUSB(Usb usb) {
        this.usb = usb;
        usb.start();
        usb.stop();
    }
    
    // 构造方法注入
    public Mainboard(Usb usb) {
        this.usb = usb;
        System.out.println("mainBoard running2");
    }

    public void useUSB() {
        if(usb !=null){
            usb.start();
            usb.stop();
        }
    }

}
