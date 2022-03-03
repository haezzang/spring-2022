package kr.hr.study.main;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	
	//static은 객체가 없어도 메소드 호출 가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		HelloWorld hello1=new HelloWorldKr();
		callMethod(hello1);

	}
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();

		
	}

}
