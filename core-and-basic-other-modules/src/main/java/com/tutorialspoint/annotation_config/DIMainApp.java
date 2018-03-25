package com.tutorialspoint.annotation_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIMainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		
		TextEditor textEditor = ctx.getBean(TextEditor.class);
		textEditor.spellCheck();
	}
}
