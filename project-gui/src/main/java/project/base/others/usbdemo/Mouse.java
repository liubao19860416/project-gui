package project.base.others.usbdemo;

public class Mouse implements Usb {

    @Override
    public void start() {
        System.out.println("Mouse is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Mouse is stoping...");

    }

}
