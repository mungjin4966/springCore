package com.lacred.chap03.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lacred.chap03.javaconfig.Account;
import com.lacred.chap03.javaconfig.Member;
import com.lacred.chap03.javaconfig.PersonalAccount;


//set을 이용한 주입
@Configuration
public class ContextConfiguration2 {
	
	@Bean
	public Account accountGenerator() {
		return new PersonalAccount(22, "123-232-23234","1234");
	}
	
	@Bean
	public Member membmerGenerator() {
		
		Member member = new Member();
		member.setSequence(1);
		member.setName("동글라미");
		member.setPhone("010-2323-2323");
		member.setPersonalAccount(accountGenerator());
		
		return member;
		
	}
}
