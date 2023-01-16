package com.lacred.chap02.section02.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application02 {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("com/lacred/chap02/section02/xmlconfig/comfig/spring-context02.xml");
		String[] beanNames = context.getBeanDefinitionNames();
		
		for(String name : beanNames) {
			System.out.println(name);
		}

	}

}
