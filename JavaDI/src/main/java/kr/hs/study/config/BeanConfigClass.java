package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.DataBean5;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.beans.TestBean5;

@Configuration
public class BeanConfigClass {
	
	
	@Bean(name="test")
	@Lazy
	@Scope("prototype")	
	public TestBean3 t1() {
		return new TestBean3();
		
	}
	
	@Bean
	public TestBean3 t2() {
		return new TestBean3();
		
	}
	
	
	//Constructor
	@Bean
	public TestBean4 java5() {
		TestBean4 t4=new TestBean4(100,"spring4",new DataBean4());
		return t4;
	}
	
	
	//setterDI
	@Bean
	public TestBean5 java6() {
		TestBean5 t5=new TestBean5();
		t5.setData1(100);
		t5.setData2("spring");
		t5.setData3(new DataBean5());
		return t5;
	}


}
