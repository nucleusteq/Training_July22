class Phone{
    void call(){
        System.out.println("callS");
    }
    void sms(){
        System.out.println("sms");
    }

}
interface Camera{
    abstract void click();
    abstract void record();
}
interface MusicPlayer{
    abstract void play();
    abstract void stop();
}
class SmartPhone extends Phone implements Camera,MusicPlayer{
        public void  click(){
            System.out.println(" click");
        }
        public void record(){
            System.out.println("records");
      }
        public void play(){
                System.out.println("play");
            }
        public void stop() {
            System.out.println("stop");
        }
    }
 public class interfaces {
    public static void main(String[] args) {
        SmartPhone s =new SmartPhone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.stop();
    }
 }