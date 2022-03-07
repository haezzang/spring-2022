package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//config.xml를 로딩시킨다: 객체를 생성해서 컨테이너에 보관
		
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		HelloWorld HelloWorldEn=ctx.getBean("HelloWorldEn",HelloWorldEn.class); //다운캐스팅

		System.out.println("HelloWorldEn "+HelloWorldEn); //주소값이 찍힘
		
		HelloWorld HelloWorldKr=ctx.getBean("HelloWorldKr",HelloWorldKr.class); //다운캐스팅

		System.out.println("HelloWorldKr "+HelloWorldEn); //주소값이 찍힘


	
	}


}
