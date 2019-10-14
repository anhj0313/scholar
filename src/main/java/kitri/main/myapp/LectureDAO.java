package kitri.main.myapp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LectureDAO {
	@Autowired
	SqlSession session;
	
	public List<LectureVO> getLectureTime(String search){
		return session.selectList("sch.getlecturetime", search);
	}
}
