package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.MemberSNSDao;
import kr.talenton.web.vo.MemberSNS;

public class MyBatisMemberSNSDao implements MemberSNSDao {
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<MemberSNS> getMemberSNSs(String member_id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String member_id, String name) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public List<MemberSNS> getMemberSNSs() throws SQLException {
		
		return getMemberSNSs(1,"MID","");
	}

	@Override
	public List<MemberSNS> getMemberSNSs(int page) throws SQLException {
		
		return getMemberSNSs(page,"MID","");
	}

	@Override
	public List<MemberSNS> getMemberSNSs(int page, String field, String query) throws SQLException {
		
        SqlSession session = ssf.openSession();
        MemberSNSDao dao = session.getMapper(MemberSNSDao.class);
		List<MemberSNS> list = dao.getMemberSNSs(page,"MID","jwk");
		
		session.close();
		return list;
	}

	@Override
	public int update(MemberSNS membersns) {
		
		 SqlSession session = ssf.openSession();
		 MemberSNSDao dao = session.getMapper(MemberSNSDao.class);
			int aft = dao.update(membersns);
			
			session.commit();
			session.close();
		
		return aft;
	}
	
	@Override
	public int insert(MemberSNS membersns) {
		SqlSession session = ssf.openSession();
		MemberSNSDao dao = session.getMapper(MemberSNSDao.class);
		int aft = dao.insert(membersns);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String mid) {
		
		SqlSession session = ssf.openSession();
		MemberSNSDao dao = session.getMapper(MemberSNSDao.class);
		int aft = dao.delete(mid);
		
		session.commit();
		session.close();
		
		return aft;
	}


}
