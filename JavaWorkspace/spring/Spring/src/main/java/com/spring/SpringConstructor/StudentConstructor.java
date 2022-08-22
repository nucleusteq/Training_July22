package com.spring.SpringConstructor;

public class StudentConstructor {

		private Integer id;
		private String name;
		

			public StudentConstructor(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
			}
			
			@Override
			public String toString() {
				return "Student [id=" + id + ", name=" + name + "]";
			}

		}
