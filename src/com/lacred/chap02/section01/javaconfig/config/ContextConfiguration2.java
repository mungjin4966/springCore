package com.lacred.chap02.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.lacred.chap02.section01.javaconfig.MemberDAO;

@Configuration
@ComponentScan(basePackages = "com.greedy.section01.javaconfig",
		excludeFilters = { // 아래의 설정을 통해 MemberDAO.clas는 bean 생성에서 제외된다.
				@ComponentScan.Filter(
						type = FilterType.ASSIGNABLE_TYPE, //어떠한 타입인지 구체적으로 명시를 하겠다는 설
						classes = {MemberDAO.class}
						)
		}
)
public class ContextConfiguration2 {

}
