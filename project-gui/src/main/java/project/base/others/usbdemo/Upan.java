package project.base.others.usbdemo;

public class Upan implements Usb {

    @Override
    public void start() {
        System.out.println("Upan is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Upan is stoping...");
    }

}
