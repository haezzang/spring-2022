package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestDAO dao=ctx.getBean(TestDAO.class);
		
		TestBean t1=ctx.getBean(TestBean.class);
		TestBean t2=ctx.getBean(TestBean.class);
		TestBean t3=ctx.getBean(TestBean.class);
		
		t1.setUserid("kim"); t1.setUsername("김다리"); t1.setUserpass("1111");
		t2.setUserid("lee"); t2.setUsername("이로니"); t2.setUserpass("2222");
		t3.setUserid("park"); t3.setUsername("박호니"); t3.setUserpass("3333");
		
		dao.insert_data(t1);
		dao.insert_data(t2);
		dao.insert_data(t3);
		
		System.out.println("inserted");
		ctx.close();
		

	}

}
