package com.lacred.chap03.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lacred.chap03.javaconfig.config.ContextConfiguration1;


public class Application01 {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration1.class);
		
		Member member = context.getBean(Member.class);
		System.out.println(member);
		
	}

}
