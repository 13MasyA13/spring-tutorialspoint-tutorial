package com.tutorialspoint.xml;

public class Student {
	
	private String name;
	
	private int age;

	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		   System.out.println("Age : " + age );
		   System.out.println("Exception raised");
		   return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
}
