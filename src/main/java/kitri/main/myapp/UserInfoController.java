package kitri.main.myapp;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;


@Controller
public class UserInfoController {
	
	@Autowired
	ScholarMybatisService service;

	
	@RequestMapping(value = "/login")
	ModelAndView getCalendarList() {
	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("users/login");

		return mv;
	}



	@RequestMapping(value = "/user_infoview")
	ModelAndView getUser(String user_id, String password) {
	
		
		UserInfoVO vo=service.getUser(user_id, password);
		ModelAndView mv = new ModelAndView();
	
		if(vo!=null) {
			mv.addObject("user",vo);
			mv.setViewName("users/user_infoview");
			
			
		}
		else {
			
			mv.setViewName("users/login");
		}
			
		
	
		

		return mv;
	
	}
	

	@RequestMapping(value = "/changePassword")
	ModelAndView changePw(String user_id, String password) {
	
		
		UserInfoVO vo=service.changePw(user_id, password);
		ModelAndView mv = new ModelAndView();
	
		System.out.println("changepw");
		if(vo!=null) {
			mv.addObject("user",vo);
			mv.setViewName("users/login");
			System.out.println("업데이트 완료");
			
		}
		else {
			
			mv.setViewName("users/user_infoview");
		}
				
		

		return mv;
	
	}
	


	
}
