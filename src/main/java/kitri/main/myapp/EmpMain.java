package kitri.main.myapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) throws Exception{
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("kitri/main/myapp/mybatis_spring.xml");
		
		EmpService service = factory.getBean("service", EmpService.class);
		
		
			service.getTuition(); System.out.println("@@@");
		 
		
		//EmpDAO dao = new EmpDAO(); ->@Repository
		//dao.setSession(session); ->@Autowired
		
		//EmpService service = new EmpServiceImpl(); ->@Service("service")
		//((EmpServiceImpl)service).setDAO(dao);
		
		/*
		 * List<EmpVO> list = service.getEmpList(); for(EmpVO vo : list) {
		 * System.out.println(vo.employee_id + ":" + vo.getFirst_name()); }
		 * 
		 * EmpVO vo = service.getEmpOne(100); System.out.println(vo);
		 * 
		 * List<EmpVO> vo2 = service.getEmpName("William"); System.out.println(vo2);
		 */
		
		//insert test
		/*
		 * EmpVO vo3 = new EmpVO(); vo3.setEmployee_id(1000); vo3.setLat_name("홍");
		 * vo3.setEmail("hong@email.com"); vo3.setJob_id("IT_PROG");
		 * vo3.setDepartment_id(50); service.insertEmp(vo3);
		 * System.out.println("insert complete");
		 */
		
		//update test
		/*
		 * EmpVO vo3 = new EmpVO(); vo3.setEmployee_id(1000); vo3.setDepartment_id(80);
		 * vo3.setLat_name("이"); service.updateEmp(vo3);
		 * System.out.println("update complete");
		 */
		
		//delete test
		/*
		 * service.deleteEmp(1000); System.out.println("delete complete");
		 */
		
		//paing test
		/*
		 * int count = service.getCount(); System.out.println(count);
		 * 
		 * int currentpage = 1; int start = (currentpage-1)*10+1; int end =
		 * currentpage*10;
		 * 
		 * int rownums[] = new int[2]; rownums[0] = start; rownums[1] = end;
		 * 
		 * List<EmpVO> list2 = service.getEmpPage(rownums); for(EmpVO vo3 : list2) {
		 * System.out.println(vo3); }
		 */
		
		//insert with seq test
		/*
		 * EmpVO vo3 = new EmpVO(); vo3.setLat_name("김"); vo3.setJob_id("IT_PROG");
		 * vo3.setDepartment_id(100); vo3.setEmail("kim@kitri.com");
		 * service.insertEmpWithSeq(vo3); System.out.println("insertion complete");
		 */
		
		//array test
		/*
		 * int[] dept = {50, 80, 100, 120}; List<EmpVO> list2 =
		 * service.getEmpWithArray(dept); for(EmpVO vo3: list2) {
		 * System.out.println(vo3.getDepartment_id()); }
		 */
		
		//ArrayList test
		/*
		 * ArrayList<Integer> deptlist = new ArrayList<Integer>(); deptlist.add(100);
		 * deptlist.add(200); deptlist.add(10); List<EmpVO> list2 =
		 * service.getEmpWithList(deptlist); for(EmpVO vo3 : list2) {
		 * System.out.println(vo3.getDepartment_id()); }
		 */
		
		//map test
/*		HashMap<String, String> map = new HashMap<String, String>();
		map.put("deptid", "50");
		map.put("emp_id", "303");
		map.put("email", "lee@a.com");
		service.updateEmpWithMap(map);
		System.out.println("update complete");*/
		
		/*
		 * EmpVO resultmapvo = service.getEmpWithResultMap();
		 * System.out.println(resultmapvo.getLast_name() + ":" +
		 * resultmapvo.getPhone());
		 */
	}
}
