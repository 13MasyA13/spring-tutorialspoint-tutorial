package com.tutorialspoint.annotation_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		// Configuration via '.class' in constructor args
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWolrdConfig.class);
		
		HelloWorldAnnotation hello = ctx.getBean(HelloWorldAnnotation.class);
		hello.setMessage("Hello From Annotation Config Bean!");
		System.out.println(hello.getMessage());
	}
}
