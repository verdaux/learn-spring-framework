package com.learnspring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppNewHelloWorldSpring {

	public static void main(String[] args)
	{
		//1. launch the spring context
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		//2. configure required stuff
		System.out.println(context.getBean("name"));
	}

}
