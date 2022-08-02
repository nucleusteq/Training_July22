package inter;

class Phone{
    void call(){
        System.out.println("call");
    }
    void sms(){
        System.out.println("sms");
    }
​
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
       public  void  click(){
            System.out.println(" click");
        }
      public   void record(){
            System.out.println("records");
      }
            public void play(){
                System.out.println("play");
            }
        public void stop() {
            System.out.println("stop");
        }
    }
 public class phone {
    public static void main(String[] args) {
        SmartPhone sp =new SmartPhone();
        sp.call();
        sp.sms();
        sp.click();
        sp.record();
        sp.play();
        sp.stop();
    }
 }
