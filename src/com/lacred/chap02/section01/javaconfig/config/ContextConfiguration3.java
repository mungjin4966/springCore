package com.lacred.chap02.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.lacred.chap02.section01.javaconfig.MemberDAO;

@Configuration
@ComponentScan(basePackages="com.lacred.chap02.section01.javaconfig",
	useDefaultFilters = false, // Configuratio 어노테이션을 제외한 모든 Bean의 스캔을 제외
	includeFilters= { // 아래에 해당되는 것만 포함하겠다는 의
			@ComponentScan.Filter(
						type = FilterType.ASSIGNABLE_TYPE,
						classes = {MemberDAO.class}
					)
		}
		
	)
public class ContextConfiguration3 {

}
