package kitri.main.myapp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExtraAdminDAO {
	@Autowired
	SqlSession session; // mybatis dbconnetion


	public void insertAdminExtra(ExtraAdminVO vo) {
		session.insert("sch.insertrequestextra", vo);
	}
	
	public List<ExtraAdminVO> getAllRequestExtra(){
		return session.selectList("sch.allrequestextra");
	}
	
	public List<ExtraAdminVO> getMyRequestExtra(String user_id){
		return session.selectList("sch.myrequestextra", user_id);
	}
	
	
	
	
	public void deleteRequestExtra(ExtraAdminVO vo) {
		session.delete("sch.deleterequestextra", vo);
	}
	
	
	public void updateusermajor(ExtraAdminVO vo) {
		session.update("sch.updateusermajor", vo);
	}
	
	public void updateuserextra(ExtraAdminVO vo) {
		session.update("sch.updateuserextra", vo);
	}

	public void updateaccept(ExtraAdminVO vo) {
		
		session.update("sch.updateaccept",vo);
	}
}
