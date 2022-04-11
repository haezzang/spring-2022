package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b2")
public class Novel  implements Book {
	private String writer;
	private String title;
	private int price;
	

	
	public  Novel(@Value("�ڼ���") String writer, @Value("�ǰܿ���") String title, @Value("1000") int price) {
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
		System.out.println(getWriter()+"�� �Ҽ� "+getTitle()+"�� "+getPrice()+" ���");
		
	}
	public void sell() {
		
		System.out.println(getWriter()+"�� �Ҽ� "+getTitle()+"�� "+getPrice()+" �Ǵ�");
	}
	public void create() {
		System.out.println(getWriter()+"�� �Ҽ� "+getTitle()+"�� "+getPrice()+" �����");
		
	}

}
