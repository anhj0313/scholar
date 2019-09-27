package kitri.main.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("service")
public class CalServiceImpl implements CalService{
	
	
	@Autowired
	CalendarDAO dao;
	
	
	public void setDAO(CalendarDAO dao) {
	this.dao = dao;
	}
	
	@Override
	public List<CalendarVO> getCalenderList() {
		List<CalendarVO> list = dao.getCalList();
		return list;
	}

}
