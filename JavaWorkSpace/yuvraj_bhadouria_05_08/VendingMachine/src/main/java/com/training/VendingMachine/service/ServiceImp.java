import java.util.Random;

class Weather implements Runnable{
    public void run(){
        String arr[]={"Cloudy","Raining","Sunny","Huimd","Thunderstorm","Clear"};
        Random random = new Random();
        int index = random.nextInt(arr.length);

        System.out.println(Thread.currentThread().getName()+" Weather:"+index);
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Assesment{
    public static void main(String[] args) {
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
        w2.start();
        w3.start();
        w4.start();
        w5.start();
        w6.start();
        w7.start();

        

    }
}