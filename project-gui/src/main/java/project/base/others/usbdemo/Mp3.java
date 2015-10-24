package project.base.others.usbdemo;

public class Mp3 implements Usb {

    @Override
    public void start() {
        System.out.println("Mp3 is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Mp3 is stoping...");
    }

}
