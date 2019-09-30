package kitri.main.myapp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDAO {
	@Autowired
	SqlSession session;

	public List<UserInfoVO> getUserinfoList() {
		List<UserInfoVO> list = session.selectList("sch.userall");
		return list;
	}

	// 학적 변경
	public void updateUserInfo(UserInfoVO vo) {
		session.update("sch.updateuser", vo);
	}

	public UserInfoVO getUserinfo(UserInfoVO user) {
		return session.selectOne("sch.user", user);
	}

	public UserInfoVO getUser(String user_id, String password) {
		UserInfoVO info = new UserInfoVO();
		info.setUser_id(user_id);
		info.setPassword(password);
		UserInfoVO info2 = session.selectOne("sch.user", info);
		return info2;
	}

	public UserInfoVO changePw(String user_id, String password) {
		UserInfoVO info = new UserInfoVO();
		info.setUser_id(user_id);
		info.setPassword(password);
		session.update("sch.changePw", info);
		return info;

	}
}
