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
	
	
	public void method1(int a, String s) {
		System.out.println("int 매개변수 String 매개변수 method1");
	}
	public void method1(int a, char c) {
		System.out.println("모든 타입의 매개변수 2개");
	}
	public void method1(int a, int b, String c) {
		System.out.println("모든 타입의 매개변수 0개이상");
	}
	
	public void method2() {
		System.out.println("테스트빈 메서드2 호출");
	}
}
