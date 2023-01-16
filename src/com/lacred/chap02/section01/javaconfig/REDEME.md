### ComponentScan 기능을 이용한 Bean 등록

#### ComponentScan이란?
base-package로 설정된 경로 하위에 특정 어노테이션을 가지고 있는 클래스를 이용하여 bean으로 등록한다.<br>
@Component 어노테이션이 작성된 클래스를 인식하여 Bean으로 만들게 되며, 특수한 목적에 따라 세부 기능을 제공하는 <br>
@Controller, @Service, @Repository, @Configuration 등을 인식한다.

다음과 같이 등록된 Bean은 Context의 Bean 목록에서 확인 할 수 있다.<br>
여기서 ContextConfiguration1.class의 값을 설정하지 않았기 때문에 클래스명으로 Bean이 생성되게 된다.
<pre>
	
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration1.class);
		
		String[] beanName = context.getBeanDefinitionNames();
		
		for(String name : beanName) {
			System.out.println(name);
		}

result : contextConfiguration1

</pre>

- base-package란<br>
하위에 있는 모든 클래스를 스캐닝 할 수 있도록 하는 설정으로 스캐닝을 통해 특정 어노테이션을 가지고 있는 클래스를 Bean으로 등록하는 설정이다. <br>
기본적으로 @Componen 어노테이션이 추가된 것을 탐색하게 되며 MVC의 각계층을 나타내는 @Controller, @Service, @Repository, @Configuration <<br>
등의 값을 Bean으로 등록하게 된다. 


#### javaConfig
자바 기반 설정에서 class에  @Component 어노테이션을 추가하여 Bean으로 등록하는 것이 가능하다.<br>
그러한 경우 @Configration 클래스에 @ComponentScan을 추가하여야 한다.<br>
여기서 @Configration과 동일한 패키지에서 특수한 어노테이션이 달린 class를 탐색이 가능한다.<br>
이후 탐색은 별도의 Base-package 설정을 해야한다. <br>
ex) @ComponentScan(basePackages="")로 설정이 가능하다. <br>

#### 어노테이션 사용
Configration 설정을 통해 Bean을 등록하는 경우 @Controller, @Service, @Repository, @Configuration의 모든 어노테이션 설정이 가능하다.<br>
그러나 계층별로 적절한 어노테이션은 다음과 같다.

- @Component : 스프링에서 관리되는 객체(Bean)임을 표시하기 위해 사용하는 가장 기본적인 어노테이션 이다. <br>
계층이 명확하지 않는 경우 사용되는 어노테이션이다.

- @Controller : WebMVC 코드에서 사용되는 어노테이션으로 @RequestMApping 어노테이션은 해당 어노테이션이 작성된 클래스 내에서 사용 가능하다. <br>
컨트롤러 계층에서 사용되는 어노테이션으로 @RequestMappin이 서블릿에서 서블릿 어노테이션과 비슷한 기능을 수행하게 된다. <br>
Url 매핑 설정을 하는 경우 사용되는 어노테이션으로 Controller는 Url 패턴을 매핑하여 작성하게 되는데 이때 @Controller라는 어노테이션 하위에서만 Url매핑 설정이 가능

- @Service : 비즈니스 로직이 작성된 클래스에서 사용한다. 추가적인 기능은 없지만 기능을 제공할 가능성이 있으니 계층을 명시하는 것이 좋다. <br>별도의 기능을 제공하지 않는다.
- @Repository : 데이터베이스 관리 예외를 포착하여 DataAccessException으로 변환하여 다시 발생시킨다.<br>
데이터의 트랜젝션을 감지하여 DataAccesException 발생시 데이터를 롤백처리 


#### BeaFactory의 장점
BeanFactory를 이용하면 사용시 바로 호출하는 것 보다 번거로운 작업이 많다.<Br> 그러나 위와 같은 방법을 이용하면 Bean에 등록되는 과정에서 Bean에 등록되는 클래스의 구현은닉이 이루어지게 되며 이를 통해 결합관계를 낮출 수 있는 효과를 보여준다. <Br> 이러한 구현 은닉의 장점은 이후 class 명 혹은 기능을 수정하는 경우에도 각각의 사용하는 부분에 코드를 수정하지 않아도 되는 장점이 존재하게 된다.



