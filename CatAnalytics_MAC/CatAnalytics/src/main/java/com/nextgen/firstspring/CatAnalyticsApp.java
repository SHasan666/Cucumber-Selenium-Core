package com.nextgen.firstspring;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CatAnalyticsApp {

	
	public static void main(String[] args) {
		
		
		SpringApplication.run(CatAnalyticsApp.class, args);
		
		/*System.out.println("-------- Number of bean auto configured is -> "+ApplicationContext.getBeanDefinitionCount());
		System.out.println("=========================================");
		for(String name : ApplicationContext.getBeanDefinitionNames())
		{
			System.out.println(name);
		}
		
		System.out.println("=========================================");*/
	
	}
}
