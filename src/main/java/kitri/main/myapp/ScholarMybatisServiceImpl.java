package kitri.main.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// service = new EmpServiceImpl()
@Service("service")
public class ScholarMybatisServiceImpl implements ScholarMybatisService{
	@Autowired
	ScholarMybatisDAO dao;

	@Autowired
	UserInfoDAO udao;
	
	@Autowired
	RegisterAdminDAO radao;
	
	
	@Autowired
	ExtraAdminDAO edao;
	
	
	@Override
	public List<CalendarVO> getCalendarAll() {
		return dao.getCalendarAll();
	}

	public void setDAO(UserInfoDAO udao) {
		this.udao = udao;
		}

	@Override
	public List<UserInfoVO> getUserinfoList() {
		List<UserInfoVO> list = udao.getUserinfoList();
		return list;

	}

	@Override
	public void updateUserinfo(UserInfoVO vo) {
		udao.updateUserInfo(vo);
	}

	@Override
	public void insertRegisterAdmin(RegisterAdminVO vo) {
		radao.insertRegisterAdmin(vo);
	}

	@Override
	public List<RegisterAdminVO> getAllRequest() {
		return radao.getAllRequest();
	}

	@Override
	public UserInfoVO getUserinfo(UserInfoVO vo) {
		return udao.getUserinfo(vo);
	}

	@Override
	public List<RegisterAdminVO> getMyRequest(String user_id) {
		return radao.getMyRequest(user_id);
	}

	@Override
	public void deleteRequest(RegisterAdminVO vo) {
		radao.deleteRequest(vo);
	}
	
	@Override
	public UserInfoVO getUser(String user_id, String password) {
		UserInfoVO uvo=udao.getUser(user_id, password);
		return uvo;
	}

	@Override
	public UserInfoVO changePw(String user_id, String password) {
		UserInfoVO uvo=udao.changePw(user_id, password);
		return uvo;
	}

	@Override
	public List<ExtraAdminVO> getMyRequestExtra(String user_id) {
		
		return edao.getMyRequestExtra(user_id);
	}

	@Override
	public List<ExtraAdminVO> getAllRequestExtra() {

		return edao.getAllRequestExtra();
	}

	@Override
	public void insertExtraAdmin(ExtraAdminVO vo) {
		edao.insertAdminExtra(vo);
		
	}

	@Override
	public void deleteRequestExtra(ExtraAdminVO vo) {
	edao.deleteRequestExtra(vo);;
		
	}
	
}
