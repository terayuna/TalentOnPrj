package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.MemberMessageDao;
import kr.talenton.web.vo.MemberMessage;

public class MyBatisMemberMessageDao implements MemberMessageDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<MemberMessage> getMemberMessages() throws SQLException {
		// TODO Auto-generated method stub
		return getMemberMessages(1,"SEND_ID","");
	}

	@Override
	public List<MemberMessage> getMemberMessages(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getMemberMessages(page,"SEND_ID","");
	}

	@Override
	public List<MemberMessage> getMemberMessages(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		MemberMessageDao dao = session.getMapper(MemberMessageDao.class);
		
		List<MemberMessage> list = dao.getMemberMessages(page, field, query);
		session.close();
		
		return list;
	}

	@Override
	public int update(MemberMessage memberMessage) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		MemberMessageDao dao = session.getMapper(MemberMessageDao.class);
		int aft = dao.update(memberMessage);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String send_id, String receive_id, int code) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		MemberMessageDao dao = session.getMapper(MemberMessageDao.class);
		int aft = dao.delete(send_id, receive_id, code);
		
		session.commit();		
		session.close();
		
		return aft;
	}

	@Override
	public int insert(MemberMessage memberMessage) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		MemberMessageDao dao = session.getMapper(MemberMessageDao.class);
		int aft = dao.insert(memberMessage);
		
		session.commit();
		session.close();
		
		return aft;
	}

}
