package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.magazin;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;




@Configuration
public class BeanConfigClass {
	
	
	@Bean
	public magazin java1() {
		magazin a1=new magazin();
		a1.setWriter("박");
		a1.setTitle("스프링1");
		a1.setPrice(100);
		return a1;
	}
	
	@Bean
	public novel java2() {
		novel a2=new novel();
		a2.setWriter("조");
		a2.setTitle("스프링2");
		a2.setPrice(300);
		return a2;
	}
	
	@Bean
	public poet java3() {
		poet a3=new poet();
		a3.setWriter("김");
		a3.setTitle("스프링3");
		a3.setPrice(900);
		return a3;
	}


}
