package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e3")
public class Publisher implements Employee {


	private String job;
	

	private int intime;
	

	private int outtime;
	
	

	   public Publisher(@Value("ÆÛºí¸®¼Å") String job, @Value("10") int intime,  @Value("12") int outtime) {
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
		System.out.println(getJob()+" "+getIntime()+"½Ã Ãâ±Ù");
	}
	
	public void Checkout() {
		System.out.println(getJob()+" "+getIntime()+"½Ã Åð±Ù");
	}

}
