package com.mt.training.LifeCycle;

public class LifeCycleBean {
	private String name;

	public LifeCycleBean() {
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