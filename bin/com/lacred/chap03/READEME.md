## DI(dependancy injection)

### DI란?
의존성 주입, 의존관계 주입이라고 불리우는 것이다.
아래와 같이 Perso에서 Wallet을 의존하는 것을 의존 관계라고 한다.
<pre>
	public class Person{
		private Wallet wallet;
	}
</pre>

DI가 가능한 이유는 Bean을 Spring IOC에서 관리하고 있기 때문에 DI를 통해 관계의 주입이 가능하게 된다.<br>
DI의 장점으로 강한 결합 상태에 있는 것을 느슨한 결합 상태로 변경하여 유지보수 성을 증가시키는 것이 있다.


<pre>
	@Component
	public class Person{
		private Wallet wallet;
	}
	
	@Component
	public class Wallet{
	
	}

</pre>

이때 의존성을 주입해주는 방식은 3가지가 있다.

1. 생성자를 이용하여 값을 주입
<pre>
	
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
</pre>


2. SET메소드를 이용하여 값을 주입

<pre>
	
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

</pre>

3.xml 이용하여 값을 주입하는 방

<pre>

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
		<bean id="accountGenerator" class="com.lacred.chap03.xmlconfig.PersonalAccount">
			<constructor-arg index="0" value ="10"/>
			<constructor-arg name="accNo" value="110-223-213123123"/>
			<constructor-arg name="accPwd" ><value>1234</value></constructor-arg>
		</bean>
		
		<bean id="memberGenerator" class="com.lacred.chap03.xmlconfig.Member">
			<constructor-arg name="sequence" value="1"/>
			<constructor-arg name="name" value="홍길"/>
			<constructor-arg name="phone" value="010-2322-2323"/>
			<constructor-arg name="email" value="hong123@naver.com"/>
			<constructor-arg name="personalAccount" ref="accountGenerator"/>
		</bean>
		
	</beans>

</pre>
