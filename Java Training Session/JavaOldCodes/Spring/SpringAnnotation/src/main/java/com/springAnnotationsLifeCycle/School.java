package com.springAnnotationsLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class School {

	private String subject;

	@Override
	public String toString() {
		return "School [subject=" + subject + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
}
