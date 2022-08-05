package com.spring.SpringBeanLifeCycle;

public class BeanLifeCycle {

		private String name;
	
			@Override
			public String toString() {
				return "Message given is "+ name +" ";
			}
			
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}


			public void __init__(){
			      System.out.println("This is init method.");
			   }
			public void __destroy__() {
			      System.out.println("This is destroy method.");
			   }
			
			

		}
