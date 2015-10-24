package project.base.others.usbdemo;

public class ComputerController2 {

    public static void main(String[] args) {

        Usb mouse1 = new Mouse();
        Mainboard mainBoard = new Mainboard(mouse1);
        mainBoard.useUSB();

        Usb mp3 = new Mp3();
        Usb upan1 = new Upan();
        Usb upan2 = new Upan();
        Usb upan3 = new Upan();
        Usb keyboard = new Keyboard();

        new Mainboard(mp3).useUSB();
        new Mainboard(upan1).useUSB();
        new Mainboard(upan2).useUSB();
        new Mainboard(upan3).useUSB();
        new Mainboard(keyboard).useUSB();

    }

}
