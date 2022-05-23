package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		
		 TestDAO dao = ctx.getBean(TestDAO.class);
		 
		 
		//�ֱ�
		/*
		 * // 1.dao �������� TestDAO dao = ctx.getBean(TestDAO.class);
		 * 
		 * // 2TestBean ��ü t1 ����� 
		 * TestBean t1 = ctx.getBean("t1", TestBean.class);
		 * t1.setData1(10); t1.setData2("spring");
		 * 
		 * TestBean t2 = ctx.getBean("t1", TestBean.class); 
		 * t2.setData1(20);
		 * t2.setData2("spring2");
		 * 
		 * // 3.dao�� insert_dataȣ�� 
		 * dao.insert_data(t1); dao.insert_data(t2);
		 * 
		 * System.out.println("inserted");
		 */
		

		//������Ʈ
		
		/*
		 * TestBean t2=new TestBean(); 
		 * t2.setData1(20); t2.setData2("d");
		 * dao.update_data(t2); 
		 * System.out.println("update"); ctx.close();
		 */
		 
		 
		//����
		/*
		 * TestBean t2=new TestBean(); t2.setData1(20); dao.delete_data(t2);
		 * System.out.println("delete"); ctx.close();
		 */
	  

		 
		 List<TestBean> list=dao.select_data();
		 
		 for(TestBean bean : list ) {
			 System.out.println("data1:"+bean.getData1());
			 System.out.println("data2:"+bean.getData2());
		 }
	  

	}

}
