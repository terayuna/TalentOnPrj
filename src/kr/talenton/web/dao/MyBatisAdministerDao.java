package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import kr.talenton.web.dao.mybatis.TalentOnSqlSessionFactoryBuilder;
import kr.talenton.web.vo.Administer;


public class MyBatisAdministerDao {
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Administer> getAdministers() throws SQLException {
	
		return getAdministers(1, "MID", "");
	}

	@Override
	public List<Administer> getAdministers(int page) throws SQLException {
	
		return getAdministers(page, "MID", "");
	}

	@Override
	public List<Administer> getAdministers(int page, String field, String query) throws SQLException {
	
		SqlSession session = ssf.openSession();
		AdministerDao dao = session.getMapper(AdministerDao.class);
		
		List<Administer> list = dao.getAdministers(page, field, query); //페이지 1인부분 출력
		session.close();
		return list;
	}

	@Override
	public int update(Administer administer) throws SQLException {

		SqlSession session = ssf.openSession();
		AdministerDao dao = session.getMapper(AdministerDao.class);
		
		int aft = dao.update(administer);
		
		session.commit();
		session.close();
		return aft;
		
	}

	@Override
	public int delete(String mid) throws SQLException {
		
		SqlSession session = ssf.openSession();
		AdministerDao dao = session.getMapper(AdministerDao.class);
		
		int aft = dao.delete(mid);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int insert(Administer administer) throws SQLException {
		
		SqlSession session = ssf.openSession();
		AdministerDao dao = session.getMapper(AdministerDao.class);
		
		int aft = dao.insert(administer);
		session.commit();
		session.close();
		return aft;
	}

}
