package com.lacred.chap02.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lacred.chap02.section01.javaconfig.config.ContextConfiguration1;

public class Application01 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration1.class);
		
		String[] beanName = context.getBeanDefinitionNames();
		
		for(String name : beanName) {
			System.out.println(name);
		}
		
		// 구현은
		MemberDAO memberDAO = context.getBean(MemberDAO.class);
		System.out.println(memberDAO.selectMemeber(0));
		System.out.println(memberDAO.insertMember(new MemberDTO(3, "user3", "pass3", "newMember")));
		System.out.println(memberDAO.selectMemeber(3));
	}

}
