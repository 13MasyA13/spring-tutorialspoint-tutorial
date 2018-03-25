package com.tutorialspoint.annotation_config;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWolrdConfig {
	
	/*
	 * The above code will be equivalent to the following XML configuration : 
	 * <beans>
   			<bean id = "helloWorld" class = "com.tutorialspoint.xml_config.HelloWorld" />
		</beans>
	 */
	
	@Bean
	public HelloWorldAnnotation helloWorld() {
		return new HelloWorldAnnotation();
	}
}
