package kitri.main.myapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScholarMybatisDAO {
	@Autowired
	SqlSession session;	// mybatis dbconnetion
	
	public List<CalendarVO> getCalendarAll() {
		return session.selectList("sch.calendarall");
	}
	
	public List<CalendarVO> getCalendarMonth(String month) {
		System.out.println("DAO에서의 month=" + month); // month값 잘 받아온다!! 
		return session.selectList("sch.calendarmonth", month); //여기서 오류!!
		//이부분 물어보자 !!
	}
	
}
