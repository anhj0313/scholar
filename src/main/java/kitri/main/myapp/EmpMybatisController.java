package kitri.main.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpMybatisController {
	@Autowired
	EmpService service;
	
	@RequestMapping("/emplist")
	public ModelAndView getEmpPaging() {
		List<EmpVO> list = service.getTuition();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("emplist", list);
		mv.setViewName("mybatis/emplist");
		return mv;
	}
}
