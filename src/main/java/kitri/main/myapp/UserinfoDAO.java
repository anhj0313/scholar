package kitri.main.myapp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserinfoDAO {
	@Autowired
	SqlSession session;
	

	public List<UserinfoVO> getUserinfoList() {
		List<UserinfoVO> list = session.selectList("cal.userall");
		return list;
	}


}
