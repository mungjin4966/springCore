package com.lacred.chap02.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lacred.chap02.section01.javaconfig.config.ContextConfiguration3;

public class Application03 {

	public static void main(String[] args) {
		
		ApplicationContext  context = new AnnotationConfigApplicationContext(ContextConfiguration3.class);

		
		String[] beanNames = context.getBeanDefinitionNames();
		for(String name : beanNames) {
			System.out.println(name);
		}
	}

}
