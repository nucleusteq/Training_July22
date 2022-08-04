package com.nt.training.lifeCycleBean;

public class LifeCycle {
	private String name;
	
	public LifeCycle() {
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
		return "LifeCycle [name=" + name + "]";
	}
	public void init() {
		System.out.println("Bean start.");
	}
	public void destroy() {
		System.out.println("Bean destroyed");
	}
}
