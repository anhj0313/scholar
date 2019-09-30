package kitri.main.myapp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterAdminDAO {
	@Autowired
	SqlSession session; // mybatis dbconnetion

	public void insertRegisterAdmin(RegisterAdminVO vo) {
		session.insert("sch.insertrequest", vo);
	}
	
	public List<RegisterAdminVO> getAllRequest(){
		return session.selectList("sch.allrequest");
	}
	
	public List<RegisterAdminVO> getMyRequest(String user_id){
		return session.selectList("sch.myrequest", user_id);
	}
	
	public void deleteRequest(RegisterAdminVO vo) {
		session.delete("sch.deleterequest", vo);
	}
	
}
