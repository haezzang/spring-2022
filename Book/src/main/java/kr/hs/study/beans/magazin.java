package kr.hs.study.beans;

public class magazin implements Book {
	
	private String writer;
	private String title;
	private int price;
	

	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void buy() {
		System.out.println(getWriter()+"의 잡지 "+getTitle()+"을 "+getPrice()+" 산다");
	
		
	}
	public void sell() {
		// TODO Auto-generated method stub
		
	}
	public void create() {
		// TODO Auto-generated method stub
		
	}

}
