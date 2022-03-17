package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

//config.xml의 역할과 동일(bean 생성) 자바로 설정할땐 @Configuration 꼭 붙이기



@Configuration
public class BeanClassConfiguration {
	
	//  <bean id="t1" class="kr.hs.study.beans.TestBean1"></bean>    
	@Bean
	public TestBean1 java1() {
		TestBean1 t1=new TestBean1();
		return t1; //t1객체 생성 java1 이 아이디가 된다
	} 
	
	

	
	


}
