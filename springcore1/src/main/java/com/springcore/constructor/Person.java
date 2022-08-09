package com.springcore.constructor;

public class Person {
    private String name;
    private int personId;
    
    
    public Person(String name,int personId) {
    	this.name=name;
    	this.personId=personId;
    }


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.personId;
	}
    
    
}
