package com.spring.firsst.ConsInjection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsInjectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ConsInjection.xml");
	    //  Employee sch = (Employee) context.getBean("emp");
	      //sch.show();
	      
	      ApplicationContext context =  new ClassPathXmlApplicationContext("ConsInjection.xml"); 
	      Employee emp = (Employee) context.getBean("employee");
	    		System.out.println("Employee info: ");
	    		System.out.println("Employe Id: " + emp.getEmpId());
	    		System.out.println("Employee Name: " + emp.getEmpName());
	    		List<Office> studentAddressList = emp.getOffice();
	    		int addressCounter = 1;
	   
	    		for (Office studentAddress : studentAddressList) {
	    		  System.out.println("Employee Address " +addressCounter+ ": ");
	    		  System.out.println("Address Line: "+studentAddress.getAddLine());
	    		  System.out.println("City: " + studentAddress.getCity());
	    	          System.out.println("State: " + studentAddress.getState());
	    		  System.out.println("Country: " + studentAddress.getCountry());
	    		  addressCounter++;
	    	    }	

	}

}
