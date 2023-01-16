package com.lacred.chap03.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("com/lacred/chap03/xmlconfig/config/spring-context.xml");
		
		Member member = context.getBean(Member.class);
		
		System.out.print(member.getPersonalAccount().getBalance());

	}

}
