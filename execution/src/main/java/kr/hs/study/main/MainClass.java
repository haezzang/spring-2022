package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 obj=ctx.getBean("t1",TestBean1.class);
		obj.method1();
		obj.method2();
		obj.method1(100);
		obj.method1("ss");
		obj.method1(100,200);
		ctx.close();

	}

}
