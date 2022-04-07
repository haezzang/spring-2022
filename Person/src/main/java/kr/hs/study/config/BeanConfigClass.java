package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public Test java1() {
		return new Test(new Person("����", 19, "������"), new Person("kim", 18, "��"));
	}

}
