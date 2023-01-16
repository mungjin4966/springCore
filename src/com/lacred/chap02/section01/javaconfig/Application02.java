package com.lacred.chap02.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lacred.chap02.section01.javaconfig.config.ContextConfiguration2;

public class Application02 {

	public static void main(String[] args) {
		
		
		ApplicationContext context  = new AnnotationConfigApplicationContext(ContextConfiguration2.class);
		
		String[] beanName = context.getBeanDefinitionNames();
		for(String bean : beanName) {
			System.out.println(bean);
		}
	}

}
