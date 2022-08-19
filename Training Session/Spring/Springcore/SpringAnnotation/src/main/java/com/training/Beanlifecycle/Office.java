package com.training.Beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Office {
	private Employee employee;

	public Office(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Office [employee=" + employee + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("Bean is created");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Bean is destoryed");
	}
}
