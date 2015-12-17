package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kr.talenton.web.dao.NoticeDao;
import kr.talenton.web.vo.Notice;

public class MyBatisNoticeDao implements NoticeDao{

	
	@Autowired
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	
	@Override
	public List<Notice> getNotices() throws SQLException {
		
		return getNotices(1, "MID", "");
	}

	@Override
	public List<Notice> getNotices(int page) throws SQLException {
		return getNotices(page, "MID", "");
	}

	@Override
	public List<Notice> getNotices(int page, String field, String query) throws SQLException {
		
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		List<Notice> list = dao.getNotices(page, field, query); //페이지 1인부분 출력
		return list;
	}

	

	@Override
	public String getLastCode() {
		//sqlSession session = ssf.openSession();
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		String code = dao.getLastCode();
		//sqlSession.close();
		return code;
	}

	

	@Override
	public int delete(String code) throws SQLException {
		//sqlSession session = ssf.openSession();
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
				
		return dao.delete(code);
	}

	
	@Override
	public Notice getNotice(String code) throws SQLException {
		//SqlSession session = ssf.openSession();
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
				
		Notice notice = dao.getNotice(code);
		//sqlSession.close();
		return notice;
	}

	@Override
	public int update(Notice notice) throws SQLException {
		//sqlSession session = ssf.openSession();
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
				
		int aft = dao.update(notice);
				
		//sqlSession.commit();
		//sqlSession.close();
		return aft;
	}

	@Override
	public int insert(Notice n) throws SQLException {
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		int aft = 0;
		
		aft = dao.insert(n);
	
		return aft;
	}

	@Override
	public Notice getPrevNotice(String code) {
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		return dao.getPrevNotice(code);
	}

	@Override
	public Notice getNextNotice(String code) {
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		return dao.getNextNotice(code);
	}

}
