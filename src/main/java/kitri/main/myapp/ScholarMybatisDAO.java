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
		return session.selectList("cal.calendarall");
	}
}
