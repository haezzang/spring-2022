package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Desineer;
import kr.hs.study.beans.Devloper;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.Publisher;
import kr.hs.study.config.BeanConfigClass;



public class MainClass {
	public static void main(String[] args) {
		  
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Employee obj1=ctx.getBean("e1",Desineer.class);
		obj1.Checkin();
		obj1.Checkout();
		
		Employee obj2=ctx.getBean("e2",Devloper.class);
		obj2.Checkin();
		obj2.Checkout();
		Employee obj3=ctx.getBean("e3",Publisher.class);
		obj3.Checkin();
		obj3.Checkout();


	
		
	}

}
