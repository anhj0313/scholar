package kitri.main.myapp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CalendarDAO {
	@Autowired
	SqlSession session;
	

	public List<CalendarVO> getCalList() {
		List<CalendarVO> list = session.selectList("cal.calall");
		return list;
	}


}
