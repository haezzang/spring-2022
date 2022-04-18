package kr.hs.study.beans;

public class TestBean1 {

	
	public void method1() {
		System.out.println("테스트빈 메서드1 호출");
	}
	
	public void method1(int a1) {
		System.out.println("int 매개변수 method1");
	}
	
	public void method1(int a1,  int a2) {
		System.out.println("int 2개 매개변수 method1");
	}
	
	
	public void method1(String s) {
		System.out.println("String 매개변수 method1");
	}
	
	
	
	public void method2() {
		System.out.println("테스트빈 메서드2 호출");
	}
}
