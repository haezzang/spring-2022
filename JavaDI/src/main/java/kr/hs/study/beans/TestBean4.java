package kr.hs.study.beans;

public class TestBean4 {
	private int data1;
	private String data3;
	private DataBean4 data4;
	
	public TestBean4(int data1, String data3, DataBean4 data4) {
		this.data1=data1;
		this.data3=data3;
		this.data4=data4;
	}

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public String getData3() {
		return data3;
	}

	public void setData3(String data3) {
		this.data3 = data3;
	}

	public DataBean4 getData4() {
		return data4;
	}

	public void setData4(DataBean4 data4) {
		this.data4 = data4;
	}
	

}
