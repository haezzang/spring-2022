package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e1")
public class Desineer implements Employee {

	private String job;
	

	private int intime;
	
	

	private int outtime;
	
	
	   public Desineer(@Value("디자이너") String job, @Value("11") int intime,  @Value("12") int outtime) {
		   this.job=job;
		   this.intime=intime;
		   this.outtime=outtime;
   
   }
	
	public int getIntime() {
		return intime;
	}


	public int getOuttime() {
		return outtime;
	}


	public String getJob() {
		return job;
	}


	public void Checkin() {
		System.out.println(getJob()+" "+getIntime()+"시 출근");
	}
	
	public void Checkout() {
		System.out.println(getJob()+" "+getIntime()+"시 퇴근");
	}

}
