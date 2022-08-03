package com.spring.firsst.lifecylce;

public class LifeCons {
	   private String message;

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void init(){
	      System.out.println("Bean is initialted.");
	   }
	   public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }
	}