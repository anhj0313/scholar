package kitri.main.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LectureController {
	
	@Autowired
	ScholarMybatisService service;
	

	
	@RequestMapping("/lecture")
	public ModelAndView getLectureTime() {
		ModelAndView mv = new ModelAndView();
		List<LectureVO> list = service.getLectureTime();
		
		String time = list.get(0).getLecture_time();
		String[] time_frag = time.split("/");
		
		for(String wo : time_frag) {
			if(isStringDouble(wo)) {
				System.out.println(wo);
			}

		}
		
		mv.addObject("lecture", list);
		mv.setViewName("lecture/lectureTime");
		
		return mv;		
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("lecture/register");
		return mv;
	}
	
	public static boolean isStringDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}	catch(NumberFormatException e){
			return false;
		}
	}
}
