package com.nt.training.springBeanLifecycle;

public class Beanlifecycle {
	private String name;

	public Beanlifecycle() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Beanlifecycle [name=" + name + "]";
	}
	public void init() {
		System.out.println("Bean is initiating..");
	}
	public void destroy() {
		System.out.println("Bean is destroyed now.");
	}
}