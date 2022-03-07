package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//config.xml�� �ε���Ų��: ��ü�� �����ؼ� �����̳ʿ� ����
		
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		HelloWorld HelloWorldEn=ctx.getBean("HelloWorldEn",HelloWorldEn.class); //�ٿ�ĳ����

		System.out.println("HelloWorldEn "+HelloWorldEn); //�ּҰ��� ����
		
		HelloWorld HelloWorldKr=ctx.getBean("HelloWorldKr",HelloWorldKr.class); //�ٿ�ĳ����

		System.out.println("HelloWorldKr "+HelloWorldEn); //�ּҰ��� ����


	
	}


}
