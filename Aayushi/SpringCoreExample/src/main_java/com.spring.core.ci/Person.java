package com.spring.core.ci;

public class Person {
private String name;
private int id;

public Person(String name ,int id) {
this.name=name;
this.id=id;

}

@Override
public String toString() {
	
	return this.name+" : "+this.id;
}}
