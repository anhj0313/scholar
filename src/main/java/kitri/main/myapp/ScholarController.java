package kitri.main.myapp;

import java.util.ArrayList;
import java.util.List;

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

	ArrayList<CalendarVO> list = new ArrayList<CalendarVO>();

	
	@RequestMapping(value = "/calendarlist")
	ModelAndView getCalendarList() {
		List<CalendarVO> list = service.getCalendarAll();
		ModelAndView mv = new ModelAndView();

		mv.addObject("calendarlist", list);
		mv.setViewName("calendar/list");

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
