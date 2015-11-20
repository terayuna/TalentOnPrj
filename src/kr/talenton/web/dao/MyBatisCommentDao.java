package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.CommentDao;
import kr.talenton.web.dao.mybatis.TalentOnSqlSessionFactoryBuilder;
import kr.talenton.web.vo.Comment;

public class MyBatisCommentDao {
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
	//멤버 다오를 공장에서 꺼내와야함
	
	@Override
	public List<Member> getMembers() throws SQLException {
		// TODO Auto-generated method stub
		return getMembers(1,"MID","");
	}

	@Override
	public List<Member> getMembers(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getMembers(page,"MID","");
	}

	@Override
	public List<Member> getMembers(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		
		List<Member> list = dao.getMembers(page, field, query);
		session.close();
		
		return list;
	}

	@Override
	public int update(Member member) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		int aft = dao.update(member);
		
		session.commit();		
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String mid) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		int aft = dao.delete(mid);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int insert(Member member) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		int aft = dao.insert(member);
		
		session.commit();		
		session.close();
		
		return aft;
	}
}
