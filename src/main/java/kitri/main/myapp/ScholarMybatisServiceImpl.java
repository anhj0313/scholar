package kitri.main.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// service = new EmpServiceImpl()
@Service("service")
public class ScholarMybatisServiceImpl implements ScholarMybatisService{
	@Autowired
	ScholarMybatisDAO dao;

	@Autowired
	UserinfoDAO udao;
	
	@Override
	public List<CalendarVO> getCalendarAll() {
		return dao.getCalendarAll();
	}

	public void setDAO(UserinfoDAO udao) {
		this.udao = udao;
		}

	@Override
	public List<UserinfoVO> getUserinfoList() {
		List<UserinfoVO> list = udao.getUserinfoList();
		return list;

	}

	@Override
	public List<CalendarVO> getCalendarMonth(String month) {
		System.out.println("ServiceImpl에서의 month=" + month);
		return dao.getCalendarMonth(month);
	}
	
	
	
	
}
