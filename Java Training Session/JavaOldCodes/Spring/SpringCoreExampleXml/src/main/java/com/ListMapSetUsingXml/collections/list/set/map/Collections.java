package com.training.collections.list.set.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collections {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/training/collections/list/set/map/listConfigFile.xml");
		EmployeeLsit emp1=(EmployeeLsit) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getClothes());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
		context.close();
	}

}
 