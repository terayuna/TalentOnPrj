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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notice> getNotices(int page) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notice> getNotices(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public String getLastCode() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public int delete(String code) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public Notice getNotice(String code) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Notice notice) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Notice n) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Notice getPrevNotice(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getNextNotice(String code) {
		// TODO Auto-generated method stub
		return null;
	}

}
