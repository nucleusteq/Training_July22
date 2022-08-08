import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

class Weather implements Runnable{

    public void run(){
       
        String arr[]={"Cloudy","Raining","Sunny","Huimd","Thunderstorm","Clear"};
        Random random = new Random();
        int index = random.nextInt(arr.length);
        System.out.println(Thread.currentThread().getName()+" Weather:"+arr[index]);
        System.out.println();

    }
}
class Assesment{
    public static void main(String[] args) throws Exception {
    
        //TreeMap<String,String> list = new TreeMap<>();
        Weather weather1=new Weather();
		Thread  w1 = new Thread(weather1);
        Weather weather2=new Weather();
		Thread  w2 = new Thread(weather2);
        Weather weather3=new Weather();
		Thread  w3 = new Thread(weather3);
        Weather weather4=new Weather();
		Thread  w4 = new Thread(weather4);
        Weather weather5=new Weather();
		Thread  w5 = new Thread(weather5);
        Weather weather6=new Weather();
		Thread  w6 = new Thread(weather6);
        Weather weather7=new Weather();
		Thread  w7 = new Thread(weather7);

        w1.setName("Indore");
        w2.setName("Gwalior");
        w3.setName("Bhopal");
        w4.setName("Delhi");
        w5.setName("Banglore");
        w6.setName("Mumbai");
        w7.setName("Punjab");

        w1.start();
        w1.sleep(60000);
        w2.start();
        w2.sleep(60000);
        w3.start();
        w3.sleep(60000);
        w4.start();
        w4.sleep(60000);
        w5.start();
        w5.sleep(60000);
        w6.start();
        w6.sleep(60000);
        w7.start();
        w7.sleep(60000);

        

    }
}