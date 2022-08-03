package phone;

public class Phone {
    void call() {
        System.out.println("Make a CALL");
    }

    void sms() {
        System.out.println("Send Messages");
    }

}

interface Camera {
    void click();

    void record();
}

interface player {
    void play();

    void stop();
}
