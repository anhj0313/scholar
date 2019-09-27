package kitri.main.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// service = new EmpServiceImpl()
@Service("service")
public class ScholarMybatisServiceImpl implements ScholarMybatisService{
	@Autowired
	ScholarMybatisDAO dao;

	@Override
	public List<CalendarVO> getCalendarAll() {
		return dao.getCalendarAll();
	}
	
}
