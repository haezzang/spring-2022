package kr.hs.study.main;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanClassConfiguration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//BeanClassConfiguration 클래스 파일을 로딩해서  bean에 등록
		AnnotationConfigApplicationContext ctx=new
				AnnotationConfigApplicationContext(BeanClassConfiguration.class);

		
		
		TestBean1 obj1=ctx.getBean("java1",TestBean1.class);
		
		
		System.out.println(obj1);
		ctx.close();
	}

}
