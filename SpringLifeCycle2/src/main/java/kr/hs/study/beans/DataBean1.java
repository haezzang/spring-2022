package kr.hs.study.beans;

public class DataBean1 {
	public DataBean1() {
		System.out.println("DataBean1의 기본 생성자");
	}
	
	public void init() {
		System.out.println("init_method호출");
	}
	public void destory() {
		System.out.println("destory_method호출");
		
	}

}
