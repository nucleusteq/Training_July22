package com.nt.testunit;

public class AddIntegers {
	 @SuppressWarnings("unused")
	public String addIntegers(Integer inputValue){
		 
		 
		 if(inputValue == null) {
			 return "Cant be null";
		 }
		 if(inputValue<0) {
			 return "Enter postitve only!";
		 }
		 if(inputValue>5000) {
			 return "Out of Range";
		 }
		 
		int valueTotal=0;
		for(int i=1 ;i<= inputValue ;i++) {
		valueTotal += i;	
		}
		System.out.println(valueTotal);	
		return valueTotal+"";
		}
}
