package com.lacred.chap01.section01.xmlconfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] agrs) {
		//Spring IOC Conteiner 만들기	
		
		// 해당 부분에서 error이 발생되는데 이유는 spring Expressio을 추가하지 않아서 그렇다.
		// 위 lib는 xml을 파싱하는데 사용되는 라이브 러리이다.
		// 아래는 스프링에서 가장 핵심 적인 기능을 담은 내용으로 객체 생성을 컨테이너가 하는 방식으로 IO라고 한다.
		
		//아래의 장점 결합도를 낮추는 효과를 보여준다.
		ApplicationContext  context = new GenericXmlApplicationContext("com/lacred/section01/xmlconfig/spring-context.xml");
		
		
		// 1. Bean의 id를 이용하여 Bea을 가져오는 방법이다.
		MemberDTO member =(MemberDTO) context.getBean("member");
		System.out.println(member);
		
		// 2. Bean의 type 정보를 통해 가지고 오는 방법
		MemberDTO member2 = context.getBean(MemberDTO.class);
		System.out.println("member2 : " + member2);
		
		// 3. Bean의 Id와 타입정보를 함께 전달하여 가져오는 방법
		MemberDTO member3 = context.getBean(MemberDTO.class, "member");
		System.out.println(member3);
		
	}
}
