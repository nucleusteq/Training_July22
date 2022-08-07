package Interface;

class Phone {
    public void call() {
        System.out.println("Call Method of Phone class");
    }

    public void sms() {
        System.out.println("SMS Method of Phone class");
    }
}

interface Camera {

    void click();

    void record();

}

interface MusicPlayer {

    void play();

    void stop();

}

public class SmartPhone extends Phone implements Camera, MusicPlayer {
    public void click() {
        System.out.println("Click Method of SmartPhone class overridden from Camera interface called");
    }

    public void record() {
        System.out.println("Record Method of SmartPhone class overridden from Camera interface called");
    }

    public void play() {
        System.out.println("Play Method of SmartPhone class overridden from MusicPlayer interface called ");
    }

    public void stop() {
        System.out.println("Stop Method of SmartPhone class overridden from MusicPlayer interface called");
    }

    public void call() {
        System.out.println("Call Method of SmartPhone class");
    }

    public void sms() {
        System.out.println("SMS Method of SmartPhone class");
    }

    public static void main(String[] args) {
        Phone phone = new SmartPhone();
        phone.call();
        phone.sms();
        // phone.click(); It will throw compile time error no symbol found
        // phone.record(); It will throw compile time error no symbol found
        // phone.play(); It will throw compile time error no symbol found
        // phone.stop(); It will throw compile time error no symbol found
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.sms();
        smartPhone.click();
        smartPhone.record();
        smartPhone.play();
        smartPhone.stop();
    }
}