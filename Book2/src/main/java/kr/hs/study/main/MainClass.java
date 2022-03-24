package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.magazin;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {

	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
	
	Book a1=ctx.getBean("java1",magazin.class);
	a1.buy();
	
	Book a2=ctx.getBean("java2",novel.class);
	a2.buy();
	
	Book a3=ctx.getBean("java3",poet.class);
	a3.buy();
	}
}
