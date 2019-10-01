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
public class ExtraAdminController {

	@Autowired
	ScholarMybatisService service;

	// 전과 신청 페이지
	@RequestMapping("/insertrequestextra")
	public ModelAndView insertRequestExtra(String user_id) {
		
		UserInfoVO user = new UserInfoVO();
		user.setUser_id(user_id);
		user.setPassword("0000");
		
		user = service.getUserinfo(user);

		ModelAndView mv = new ModelAndView();

		mv.addObject("userinfo", user);
		
		if(!user_id.contentEquals("admin")) {
			mv.addObject("requestlistextra", service.getMyRequestExtra(user_id));			
			mv.setViewName("schoolextra/insertrequest(student)");
		}
		else {
			mv.addObject("requestlistextra", service.getAllRequestExtra());
			mv.setViewName("schoolextra/checkrequest(admin)");
		}
		
		return mv;
	}
	
	// 전과 신청 결과(데이터 추가)
	@RequestMapping("/resultrequestextra")
	public ModelAndView resultRequestExtra(ExtraAdminVO vo) {
		
		service.insertExtraAdmin(vo);
		
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("user_id", vo.getUser_id());
		mv.addObject("requestlistextra", service.getMyRequestExtra(vo.getUser_id()));
		
		mv.setViewName("schoolextra/checkrequest(student)");

		return mv;
	}

	// 전과 신청 데이터 삭제
	@RequestMapping(value="/deleterequestextra")
	public ModelAndView deleteRequestExtra(ExtraAdminVO vo) {
		
		ModelAndView mv = new ModelAndView();
		
		service.deleteRequestExtra(vo);
		
		mv.setViewName("schoolextra/insertrequest(student)");
		return mv;
	}
	
}
