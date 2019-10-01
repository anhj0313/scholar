package kitri.main.myapp;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ScholarController {

	@Autowired
	ScholarMybatisService service;
	List<CalendarVO> list = new ArrayList<CalendarVO>();


	@RequestMapping(value = "/calendarlist")
	ModelAndView getCalendarList(@RequestParam(value = "monthval", required =false,
	defaultValue = "")String month) {

		ModelAndView mv = new ModelAndView();

		if(month.equals("")) {
			System.out.println("전체 일정 받아오기 !! month=" + month);
			list = service.getCalendarAll();
		}
		else{
			System.out.println("한 달 일정 받아오기 !! month=" + month);
			mv.addObject("recmonth", month);
			int imonth = Integer.parseInt(month) + 1; //자바에서 Callnedar 타입 1월 == 0 인덱스 
			String searchmonth;
			if(imonth < 10) { //09 , 08 식으로 입력
				searchmonth = "0" + String.valueOf(imonth);
			}
			else
				searchmonth = String.valueOf(imonth);
			list = service.getCalendarMonth(searchmonth);
		}

		mv.addObject("calendarlist", list);
		mv.setViewName("calendar/calendar");
		return mv;
	}

	@RequestMapping("/userlist")
	public ModelAndView getUserinfoList() {
		List<UserinfoVO> userlist = service.getUserinfoList();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user_infoview");
		mv.addObject("userlist", userlist);

		return mv;

	}
}
