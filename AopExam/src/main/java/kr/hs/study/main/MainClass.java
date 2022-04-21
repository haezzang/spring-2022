package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.IprintMsg;
import kr.hs.study.beans.PrintMsg;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		IprintMsg obj=ctx.getBean("t1",IprintMsg.class);
		obj.sayHello1();
		obj.sayHello2();
		
		ctx.close();

	}

}
