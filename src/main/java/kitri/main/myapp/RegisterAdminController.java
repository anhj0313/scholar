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
public class RegisterAdminController {

	@Autowired
	ScholarMybatisService service;

	// 학적 변동 신청 페이지
	@RequestMapping("/insertrequest")
	public ModelAndView insertRequest(String user_id) {
		
		UserInfoVO user = new UserInfoVO();
		user.setUser_id(user_id);
		user.setPassword("0000");
		
		user = service.getUserinfo(user);

		ModelAndView mv = new ModelAndView();

		mv.addObject("userinfo", user);
		
		if(!user_id.contentEquals("admin")) {
			mv.addObject("requestlist", service.getMyRequest(user_id));			
			mv.setViewName("schoolregister/insertrequest(student)");
		}
		else {
			mv.addObject("requestlist", service.getAllRequest());
			mv.setViewName("schoolregister/checkrequest(admin)");
		}
		
		return mv;
	}
	
	// 학적 변동 신청 결과(데이터 추가)
	@RequestMapping("/resultrequest")
	public ModelAndView resultRequest(RegisterAdminVO vo) {
		
		service.insertRegisterAdmin(vo);
		
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("user_id", vo.getUser_id());
		mv.addObject("requestlist", service.getMyRequest(vo.getUser_id()));
		
		mv.setViewName("schoolregister/checkrequest(student)");

		return mv;
	}

	// 학적 변동 신청 데이터 삭제(취소)
	@RequestMapping(value="/deleterequest")
	public ModelAndView deleteRequest(RegisterAdminVO vo) {
		
		ModelAndView mv = new ModelAndView();
		
		service.deleteRequest(vo);
		
		UserInfoVO user = service.getUser(vo.getUser_id());


		mv.addObject("userinfo", user);
		mv.addObject("requestlist", service.getMyRequest(vo.getUser_id()));
		mv.setViewName("schoolregister/insertrequest(student)");
		return mv;
	}
	
	// 학적 변경
	@RequestMapping("/acceptrequest")
	public ModelAndView acceptRequest(String user_id, String student_register, int request_id) {
		ModelAndView mv = new ModelAndView();
		
		UserInfoVO user = service.getUser(user_id);
		user.setStudent_register(student_register);
		service.updateUserinfo(user);
		RegisterAdminVO dvo = new RegisterAdminVO();
		dvo.setUser_id(user_id);
		dvo.setRequest_id(request_id);
		service.deleteRequest(dvo);
		mv.addObject("requestlist", service.getAllRequest());
		mv.setViewName("schoolregister/checkrequest(admin)");
		return mv;
		
	}
	
}
