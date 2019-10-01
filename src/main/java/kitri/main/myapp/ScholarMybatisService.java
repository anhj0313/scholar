package kitri.main.myapp;

import java.util.List;

public interface ScholarMybatisService {
	public List<CalendarVO> getCalendarAll();
	public List<CalendarVO> getCalendarMonth(String month);
	public List<UserinfoVO> getUserinfoList(); 
}

