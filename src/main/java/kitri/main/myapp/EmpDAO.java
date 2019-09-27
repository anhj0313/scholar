package kitri.main.myapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class EmpDAO {
	SqlSession session;
		
	public void setSession(SqlSession session) {
		this.session = session;
	}

	public List<EmpVO> getEmpList() {
		List<EmpVO> list = session.selectList("emp.empall");
		return list;
	}

	public EmpVO getEmpOne(int id) {
		EmpVO vo = session.selectOne("emp.empone", id);
		return vo;
	}
	
	public List<EmpVO> getEmpName(String name) {
		List<EmpVO> list = session.selectList("emp.empname", name);
		return list;
	}
	
	public void insertEmp(EmpVO vo) {
		session.insert("emp.insertemp", vo);
	}
	
	public void updateEmp(EmpVO vo) {
		session.update("emp.updateemp", vo);
	}
	
	public void deleteHistory(int id) {
		session.delete("emp.deletehistory", id);
	}
	public void deleteEmp(int id) {
		session.delete("emp.deleteemp", id);
	}
	
	public int getCount() {
		return session.selectOne("emp.cntemp");
	}
	
	public List<EmpVO> getEmpPage(int[] arr){
		return session.selectList("emp.emppage", arr);
	}
	
	public void insertEmpWithSeq(EmpVO vo) {
		session.insert("emp.insertempwithseq", vo);
	}
	
	public List<EmpVO> getEmpWithArray(int[] dept){
		return session.selectList("emp.empwitharray", dept);
	}
	
	public List<EmpVO> getEmpWithList(ArrayList<Integer> dept){
		return session.selectList("emp.empwithlist", dept);
	}
	
	public void updateEmpWithMap(HashMap<String, String> map){
		session.update("emp.updateempwithmap", map);
	}
	
	public EmpVO getEmpWithResultMap() {
		return session.selectOne("emp.empwithresultmap");
	}
}
