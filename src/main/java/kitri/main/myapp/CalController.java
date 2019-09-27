package kitri.main.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalController {
	
	
	@Autowired
	CalService service;
	
	
	
   @RequestMapping("/callist")
   public ModelAndView getCalendarList() {
	   List<CalendarVO> callist = service.getCalenderList();
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("calendarview/calendarview");
	   mv.addObject("callist", callist);

	   
	   
	   return mv;

   }
 
	
	
	

}
