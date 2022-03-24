package kr.hs.study.beans;

public class desiner implements employee {
	private String job;
	private int intime;
	private int outtime;
	
	
	public int getIntime() {
		return intime;
	}

	public void setIntime(int intime) {
		this.intime = intime;
	}

	public int getOuttime() {
		return outtime;
	}

	public void setOuttime(int outtime) {
		this.outtime = outtime;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
	public void Checkin() {
		System.out.println(getJob()+" "+getIntime()+"시 출근");
	}
	
	public void Checkout() {
		System.out.println(getJob()+" "+getIntime()+"시 퇴근");
	}

	
}
