package Weather;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

class Weather implements Runnable{

    public void run(){
       
        String weather[]={"Clear","Cloudy","Raining","Sunny","Huimd","Thunderstorm"};
        Random random = new Random();
        int index = random.nextInt(weather.length);
        System.out.println(Thread.currentThread().getName()+" Weather:"+weather[index]);
        System.out.println();

    }
}
class WeatherAssessment{
    public static void main(String[] args) throws Exception {
    
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
        w2.setName("Banglore");
        w3.setName("Delhi");
        w4.setName("Mysore");
        w5.setName("Bhopsl");
        w6.setName("Mumbai");
        w7.setName("Goa");

        w1.start();
        w1.sleep(20000);
        w2.start();
        w2.sleep(20000);
        w3.start();
        w3.sleep(20000);
        w4.start();
        w4.sleep(20000);
        w5.start();
        w5.sleep(20000);
        w6.start();
        w6.sleep(20000);
        w7.start();
        w7.sleep(20000);

        

    }
}
