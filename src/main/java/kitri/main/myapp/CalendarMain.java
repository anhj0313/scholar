package kitri.main.myapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalendarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=
				new ClassPathXmlApplicationContext("kitri/main/myapp/mybatis_cal.xml");
		CalService service=factory.getBean("service",CalService.class);
		List<CalendarVO> list=service.getCalenderList(); 
		for(CalendarVO vo:list) {
		System.out.println(vo.getCal_content()); }
	}

}
