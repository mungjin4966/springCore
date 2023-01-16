package com.lacred.chap01.section02.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// 자바 기반의 설정 방식
// 아래와 같이 Configuration  어노테이션을 추가하면 설정파일임을 인식하게 된다.

@Configuration
public class ContextConfiguration {
	/*
	 * configuration 기반의 설정을 하는 경우 컨테이너가 해당 파일을 읽게 되고
	 * 모든 메소드를 읽어와서 Bean에 등록하는 과정을 거친다. 
	 * 이때 Bean의 설정을 알려주기 위해서 @Bean 어노테이션을 추가하여 관리하게 된다.
	 * */
	
	@Bean(name="member")
	public MemberDTO getMember() {
		return new MemberDTO(1,"user","pass","lacred");
	}

}
