package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import kr.hs.study.beans.desiner;
import kr.hs.study.beans.developer;
import kr.hs.study.beans.publisher;

@Configuration
public class BeanConfigClass {
	
	
	@Bean
	public publisher java1() {
		publisher a1=new publisher();
		a1.setJob("퍼블리셔");
		a1.setIntime(6);
		a1.setOuttime(9);
		return a1;
	}
	
	@Bean
	public developer java2() {
		developer a2=new developer();
		a2.setJob("개발자");
		a2.setIntime(7);
		a2.setOuttime(10);
		return a2;
	}
	
	@Bean
	public desiner java3() {
		desiner a3=new desiner();
		a3.setJob("디자이너");
		a3.setIntime(10);
		a3.setOuttime(9);
		return a3;
	}


}
