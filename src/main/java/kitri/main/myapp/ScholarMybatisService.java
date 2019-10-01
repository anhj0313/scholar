package kitri.main.myapp;

import java.util.List;

public interface ScholarMybatisService {
	public List<CalendarVO> getCalendarAll();
	public List<UserInfoVO> getUserinfoList();
	public void updateUserinfo(UserInfoVO vo);
	public void insertRegisterAdmin(RegisterAdminVO vo);
	public List<RegisterAdminVO> getAllRequest(); 
	public UserInfoVO getUserinfo(UserInfoVO vo);
	public List<RegisterAdminVO> getMyRequest(String user_id);
	public void deleteRequest(RegisterAdminVO vo);
	

	public UserInfoVO getUser(String user_id, String password);
	public UserInfoVO changePw(String user_id, String password);
	public List<ExtraAdminVO> getMyRequestExtra(String user_id);
	public List<ExtraAdminVO> getAllRequestExtra();
	public void insertExtraAdmin(ExtraAdminVO vo);
	public void deleteRequestExtra(ExtraAdminVO vo);
	public void updateuserextra(ExtraAdminVO vo);
	public void updateusermajor(ExtraAdminVO vo);
	public void updateaccept(ExtraAdminVO vo);
	
	
}

