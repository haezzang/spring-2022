package kr.hs.study.main;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.Publisher;

public class MainClass {
	public static void main(String[] args) {
	
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Employee e1=ctx.getBean("t1",Designer.class);
		e1.Checkin();	
		e1.Checkout();
		
		Employee e2=ctx.getBean("t2",Developer.class);
		e2.Checkin();	
		e2.Checkout();
		
		Employee e3=ctx.getBean("t3",Publisher.class);
		e3.Checkin();	
		e3.Checkout();
	}

}
