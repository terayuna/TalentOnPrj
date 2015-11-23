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
	public List<MemberSNS> getMemberSNSs() throws SQLException {
		
		return getMemberSNSs(1,"member_id","");
	}

	@Override
	public List<MemberSNS> getMemberSNSs(int page) throws SQLException {
		
		return getMemberSNSs(page,"member_id","");
	}

	@Override
	public List<MemberSNS> getMemberSNSs(int page, String field, String query) throws SQLException {
		
        SqlSession session = ssf.openSession();
		MemberSNSDao dao = session.getMapper(MemberSNSDao.class);
		List<MemberSNS> list = dao.getMemberSNSs(page,field,query);
		
		session.close();
		return list;
	}
	@Override
	public int update(MemberSNS memberSNS) {
		
		 SqlSession session = ssf.openSession();
		 MemberSNSDao dao = session.getMapper(MemberSNSDao.class);
			int aft = dao.update(memberSNS);
			
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
	public int delete(String member_id, String name) {
		
		SqlSession session = ssf.openSession();
		MemberSNSDao dao = session.getMapper(MemberSNSDao.class);
		int aft = dao.delete(member_id,name);
		
		session.commit();
		session.close();
		
		return aft;
	}

	

}
