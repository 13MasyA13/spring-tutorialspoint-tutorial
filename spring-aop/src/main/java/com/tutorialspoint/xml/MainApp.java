package com.tutorialspoint.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = (Student) ctx.getBean("student");
		
		student.getName();
		student.getAge();
		
		student.printThrowException();
	}
}
