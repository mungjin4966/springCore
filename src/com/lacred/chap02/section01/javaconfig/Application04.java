package com.lacred.chap02.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application04 {

	public static void main(String[] args) {

		
		ApplicationContext context = 
				// 아래의 부분에 문자열로 BasePackge 설정을 하는 것이 가능하며 여러개 설정 또한 가능하다.
				new AnnotationConfigApplicationContext("package com.lacred.chap02.section01.javaconfig");
		
		String[] beanName = context.getBeanDefinitionNames();
	}

}
