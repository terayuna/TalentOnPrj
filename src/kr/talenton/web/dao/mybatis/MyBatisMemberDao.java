package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import kr.talenton.web.dao.MemberDao;
import kr.talenton.web.vo.Member;

public class MyBatisMemberDao implements MemberDao{
	//SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Member> getMembers() throws SQLException {
		// TODO Auto-generated method stub
		return getMembers(1,"ID","");
	}

	@Override
	public List<Member> getMembers(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getMembers(page,"ID","");
	}

	@Override
	public List<Member> getMembers(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		
		List<Member> list = dao.getMembers(page, field, query);
		//session.close();
		
		return list;
	}

	@Override
	public int update(Member member) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		int aft = dao.update(member);
		
		//session.commit();		
		//session.close();
		
		return aft;
	}

	@Override
	public int delete(String id) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		int aft = dao.delete(id);
		
		//session.commit();		
		//session.close();
		
		return aft;
	}

	@Override
	public int insert(Member member) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		int aft = dao.insert(member);
		
		//session.commit();
		//session.close();
		
		return aft;
	}
	
}
