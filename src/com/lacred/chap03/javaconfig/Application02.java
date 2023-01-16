package com.lacred.chap03.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lacred.chap03.javaconfig.config.ContextConfiguration2;

public class Application02 {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration2.class);
		
		String[] beanName = context.getBeanDefinitionNames();
		for(String name : beanName) {
			System.out.println("bean : "+ name);
		}
		
		Member member= context.getBean(Member.class);
		
		System.out.print(member.getPersonalAccount().getBalance());
	}

}
