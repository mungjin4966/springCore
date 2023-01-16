package com.lacred.chap02.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.lacred.chap02.section01.javaconfig.MemberDAO;

@Configuration
@ComponentScan(basePackages = "com.greedy.section01.javaconfig",
		excludeFilters = { // 아래의 설정을 통해 MemberDAO.clas는 bean 생성에서 제외된다.
				@ComponentScan.Filter(
						/* 1. 타입으로 설정 */
//						type = FilterType.ASSIGNABLE_TYPE, //어떠한 타입인지 구체적으로 명시를 하겠다는 설
//						classes = {MemberDAO.class}
						
						/* 2. 어노테이션 종류로 설정 */
//						type=FilterType.ANNOTATION, // 어노테이션 타입으로 설정하겠다는 의
//						classes= {org.springframework.stereotype.Component.class} //Component를 제외
						
						/* 3. 표현식으로 설정 */
						type=FilterType.REGEX, // 표현식으로 제거
						pattern = {"com.lacred.chap02.section01.javaconfig.*"} // 해당 루트의 값을 모두 제
						)
		}
)
public class ContextConfiguration2 {

}
