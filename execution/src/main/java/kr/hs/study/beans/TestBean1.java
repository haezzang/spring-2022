package kr.hs.study.beans;

public class TestBean1 {

	
	public void method1() {
		System.out.println("�׽�Ʈ�� �޼���1 ȣ��");
	}
	
	public void method1(int a1) {
		System.out.println("int �Ű����� method1");
	}
	
	public void method1(int a1,  int a2) {
		System.out.println("int 2�� �Ű����� method1");
	}
	
	
	public void method1(String s) {
		System.out.println("String �Ű����� method1");
	}
	
	
	public void method1(int a, String s) {
		System.out.println("int �Ű����� String �Ű����� method1");
	}
	public void method1(int a, char c) {
		System.out.println("��� Ÿ���� �Ű����� 2��");
	}
	public void method1(int a, int b, String c) {
		System.out.println("��� Ÿ���� �Ű����� 0���̻�");
	}
	
	public void method2() {
		System.out.println("�׽�Ʈ�� �޼���2 ȣ��");
	}
}
