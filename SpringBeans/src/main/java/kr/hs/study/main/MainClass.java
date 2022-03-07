package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//config.xml를 로딩시킨다: 객체를 생성해서 컨테이너에 보관
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean t1=(TestBean) ctx.getBean("t1"); //업캐스팅
		System.out.println("t1"+t1); //주소값이 찍힘
		
		TestBean t2=ctx.getBean("t1",TestBean.class); //다운캐스팅
		System.out.println("t2"+t2); //주소값이 찍힘


	}

}
