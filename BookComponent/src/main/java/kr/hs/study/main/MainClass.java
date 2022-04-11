package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazin;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
	Book b1=ctx.getBean("b1",Magazin.class);
	b1.buy(); b1.create(); b1.sell();
	
	Book b2=ctx.getBean("b2",Novel.class);
	b2.buy(); b2.create(); b2.sell();
	
	Book b3=ctx.getBean("b3",Poet.class);
	b3.buy(); b3.create(); b3.sell();
	
	}

}
