package com.learnspring.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){}
record Address (String firstLine, String city) {}

//@Configuration
public class HelloWorldConfig {

	@Bean
	public String name() {
		return "PB";
	}
	
	@Bean
	public int age() {
		return 21;
	}
	
	@Bean
	public Person person()
	{
		var person = new Person("Ravi", 20);
		return person;
	}
	
	@Bean
	public Address address()
	{
		return new Address("Mumbai", "Mumbai");
	}
}
