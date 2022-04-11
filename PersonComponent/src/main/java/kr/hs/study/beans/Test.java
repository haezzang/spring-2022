package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("t1")
public class Test {
	

	private Person p1;

	private Person p2;
	
	public Test() {
		
	}
	
	@Autowired
	public Test(Person p1, Person p2){
		this.p1=p1;
		this.p2=p2;	
	}
	
	public Person getP1() {
		return p1;
	}
	public Person getP2() {
		return p2;
	}
	public void setP1(Person p1) {
	this.p1=p1;
	}
	
	public void setP2(Person p2) {
		this.p2=p2;
	}
	
	
	

}
