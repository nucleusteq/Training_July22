package manav_jindal_assignment_08_08;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import java.util.Random;

public class WheaterRecords extends Thread{
	public static HashMap<String,Set<Integer>> wheatherRecordBasedOnCities;
	
	WheaterRecords(){
		Set<Integer> temp=new HashSet<Integer>();
		temp.add(0);
		wheatherRecordBasedOnCities=new HashMap<String,Set<Integer>>();
		wheatherRecordBasedOnCities.put("Indore", temp);
		wheatherRecordBasedOnCities.put("Bhopal", temp);
	}
	public void run() {
		Random random=new Random();
		int temp=random.nextInt(45);
		for(int i=1;i<=60;i++) {
			String name=Thread.currentThread().getName();
			if(wheatherRecordBasedOnCities.containsKey(name)) {
				Set<Integer> temperatureList=wheatherRecordBasedOnCities.get(name);
				temperatureList.add(temp);
				wheatherRecordBasedOnCities.put(name, temperatureList);
				temp=random.nextInt(45);
			}
			else {
				Set<Integer> temperatureList=wheatherRecordBasedOnCities.get(name);
				temperatureList.add(temp);
				wheatherRecordBasedOnCities.put(name, temperatureList);
			}
			//System.out.println(name+" "+wheatherRecordBasedOnCities.get(name));
		}
		//System.out.println(wheatherRecordBasedOnCities);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		WheaterRecords records=new WheaterRecords();
		WheaterRecords records1=new WheaterRecords();
		records.setName("Indore");
		records1.setName("Bhopal");
		records.start();
		records1.start();
		records1.join();
		System.out.println(WheaterRecords.wheatherRecordBasedOnCities);
	}
}
