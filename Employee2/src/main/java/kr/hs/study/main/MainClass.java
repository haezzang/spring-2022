package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.desiner;
import kr.hs.study.beans.developer;
import kr.hs.study.beans.employee;
import kr.hs.study.beans.publisher;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		
		employee a1=ctx.getBean("java1",publisher.class);
		a1.Checkin();
		a1.Checkout();
		
		employee a2=ctx.getBean("java2",developer.class);
		a2.Checkin();
		a2.Checkout();
		
		employee a3=ctx.getBean("java3",desiner.class);
		a3.Checkin();
		a3.Checkout();
		

	}

}
