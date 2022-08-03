package phone;

public class SmartPhone extends Phone implements Camera, player {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("You can play Music");

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("You can stop Music");

    }

    @Override
    public void click() {
        // TODO Auto-generated method stub
        System.out.println("You can click the Pictures");

    }

    @Override
    public void record() {
        // TODO Auto-generated method stub
        System.out.println("You can record the Videos");

    }

    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.call();
        s.sms();
        s.play();
        s.stop();
        s.record();
        s.click();

    }

}
