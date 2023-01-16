package com.lacred.chap03.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lacred.chap03.javaconfig.Account;
import com.lacred.chap03.javaconfig.Member;
import com.lacred.chap03.javaconfig.PersonalAccount;

// 생성자 주입을 이용하여 Bean의 값을 주입 
@Configuration
public class ContextConfiguration1 {

	@Bean
	public Account accountGenerator() {
		
		return new PersonalAccount(20,"110-232-232323","1234");
	}
	
	@Bean
	public Member memberGenerator() {
		
		return new Member(1, "홍길","010-2320-2323", "hong123@gmail.com",accountGenerator());
	}
}
