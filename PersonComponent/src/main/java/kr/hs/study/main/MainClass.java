package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		Test t1 = ctx.getBean("t1", Test.class);
		t1.setP1(new Person("상여자", 19 , "런쥔"));
		t1.getP1();
		
		t1.setP2(new Person("상여자", 19 , "뉴"));
		t1.getP2();
	
	}
}
