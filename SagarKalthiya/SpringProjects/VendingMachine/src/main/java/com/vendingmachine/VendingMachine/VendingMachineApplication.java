package com.vendingmachine.VendingMachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendingMachineApplication {

	public static void main(String[] args) {
		//System.out.println("hello world");
		SpringApplication.run(VendingMachineApplication.class, args);
		
		System.out.println("hello world "+getString());
	}
	
	private static String getString() {
		return "hello world";
	}

}
