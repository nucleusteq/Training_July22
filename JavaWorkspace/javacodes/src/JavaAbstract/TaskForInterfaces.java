package JavaAbstract;
class Phone{

    void call(){System.out.println("this is call");
    }
    void sms(){System.out.println("this is sms");
        
    }
}
interface Camera{
    void click();
    void record();
}

interface MusicPlayer{
    void play();
    void stop();
}

class smartPhone extends Phone implements Camera,MusicPlayer{
    public void play()
    {
        System.out.println("this is play");
    }

    public void stop()
    {
        System.out.println("this is stop");
    }

    public void click()
    {
        System.out.println("this is click");
    }

    public void record()
    {
        System.out.println("this is record");
    }
}

public class TaskForInterfaces {
    public static void main(String[] args) {
        Phone ob = new smartPhone();
        ob.call();
        ob.sms();
        smartPhone ob2 = new smartPhone();
        ob2.play();
        ob2.stop();
        ob2.click();
        ob2.record();

    }
}
