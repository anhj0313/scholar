package kitri.main.myapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmpServiceImpl implements EmpService{
	
	EmpDAO dao;
		
	public void setDAO(EmpDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmpVO> getEmpList() {
		List<EmpVO> list = dao.getEmpList();
		return list;
	}

	@Override
	public EmpVO getEmpOne(int id) {
		return dao.getEmpOne(id);
	}

	@Override
	public List<EmpVO> getEmpName(String name) {
		return dao.getEmpName(name);
	}

	@Override
	public void insertEmp(EmpVO vo) {
		//중복검사
		//EmpVO resultvo = dao.getEmpOne(vo.getEmployee_id());
		dao.insertEmp(vo);		
	}

	@Override
	public void updateEmp(EmpVO vo) {
		dao.updateEmp(vo);
		
	}

	@Override
	public void deleteEmp(int id) {
		dao.deleteHistory(id);
		dao.deleteEmp(id);
	}

	@Override
	public int getCount() {
		return dao.getCount();
	}

	@Override
	public List<EmpVO> getEmpPage(int[] arr) {
		return dao.getEmpPage(arr);
	}

	@Override
	public void insertEmpWithSeq(EmpVO vo) {
		dao.insertEmpWithSeq(vo);
	}

	@Override
	public List<EmpVO> getEmpWithArray(int[] dept) {
		return dao.getEmpWithArray(dept);
	}

	@Override
	public List<EmpVO> getEmpWithList(ArrayList<Integer> dept) {
		return dao.getEmpWithList(dept);
	}

	@Override
	public void updateEmpWithMap(HashMap<String, String> map) {
		dao.updateEmpWithMap(map);
		
	}

	@Override
	public EmpVO getEmpWithResultMap() {
		return dao.getEmpWithResultMap();
	}
	
}
