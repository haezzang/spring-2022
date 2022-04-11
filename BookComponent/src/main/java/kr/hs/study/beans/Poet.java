package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b3")
public class Poet implements Book {
	
	private String writer;
	private String title;
	private int price;
	

	
	public  Poet(@Value("심재윤") String writer, @Value("호주핫가이") String title, @Value("1000") int price) {
			this.writer=writer;
			this.price=price;
			this.title=title;
		
	}
	
	public String getWriter() {
		return writer;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	
	public void buy() {
		System.out.println(getWriter()+"의 소설 "+getTitle()+"을 "+getPrice()+" 산다");
		
	}
	public void sell() {
		
		System.out.println(getWriter()+"의 소설 "+getTitle()+"을 "+getPrice()+" 판다");
	}
	public void create() {
		System.out.println(getWriter()+"의 소설 "+getTitle()+"을 "+getPrice()+" 만들다");
		
	}
	

}
