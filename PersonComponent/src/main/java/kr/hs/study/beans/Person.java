package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {
	String name;
	int age;
	String act;
	
	public Person(String name, int age, String act) {
		this.name=name;
		this.age=age;
		this.act=act;
		eat();
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	
	public void eat() {
		System.out.println(name+age+act);
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}
	

}
