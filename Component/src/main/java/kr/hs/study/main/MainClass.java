package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;



public class MainClass {
	public static void main(String[] args) {

	ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
	TestBean1 obj1=ctx1.getBean("t1",TestBean1.class); 
	System.out.println("obj1 : "+obj1);
	ctx1.close();
	
	System.out.println("--------------------------------------------------");
	
	
	AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	TestBean2 obj2=ctx2.getBean("t2",TestBean2.class); 
	System.out.println("obj2 : "+obj2);
	ctx2.close();

	}
}
