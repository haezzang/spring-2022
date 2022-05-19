package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {

	@Autowired
	private JdbcTemplate db;
	//jdbcTemplate 자동주입 시킴
	//실제 쿼리 날림
	
	//1. insert
	public void insert_data(TestBean bean) {
		//container에 있는 TestBean의 객체가 bean에 자동주입된다
		String sql="insert into test values(?,?)";
		db.update(sql,bean.getData1(),bean.getData2());
	}
	
	public void update_data(TestBean bean) {
	      String sql = "update test set data2 = ? where data1= ?";
	      db.update(sql,bean.getData2(),bean.getData1());
	   }
	
	public void delete_data(TestBean bean) {
	      String sql = "delete test where data1 = ?";
	      db.update(sql,bean.getData1());
	   }

}
