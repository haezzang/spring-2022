package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.magazin;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Book obj1=ctx.getBean("t1", Book.class);
		obj1.buy();
		
		Book obj2=ctx.getBean("t2", Book.class);
		obj2.buy();
		Book obj3=ctx.getBean("t3", Book.class);
		obj3.buy();
		

	}

}
