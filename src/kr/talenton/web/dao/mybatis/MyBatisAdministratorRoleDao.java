package kr.talenton.web.dao.mybatis;


import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.AdministratorRoleDao;
import kr.talenton.web.vo.AdministratorRole;

public class MyBatisAdministratorRoleDao implements AdministratorRoleDao {
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<AdministratorRole> getAdministratorRoles() throws SQLException {
	
		return getAdministratorRoles(1, "NAME", "");
	}

	@Override
	public List<AdministratorRole> getAdministratorRoles(int page) throws SQLException {
	
		return getAdministratorRoles(page, "NAME", "");
	}

	@Override
	public List<AdministratorRole> getAdministratorRoles(int page, String field, String query) throws SQLException {
	
		SqlSession session = ssf.openSession();
		AdministratorRoleDao dao = session.getMapper(AdministratorRoleDao.class);
		
		List<AdministratorRole> list = dao.getAdministratorRoles(page, field, query); //페이지 1인부분 출력
		session.close();
		return list;
	}

	@Override
	public int update(AdministratorRole administratorRole) throws SQLException {

		SqlSession session = ssf.openSession();
		AdministratorRoleDao dao = session.getMapper(AdministratorRoleDao.class);
		
		int aft = dao.update(administratorRole);
		
		session.commit();
		session.close();
		return aft;
		
	}

	@Override
	public int delete(String name) throws SQLException {
		
		SqlSession session = ssf.openSession();
		AdministratorRoleDao dao = session.getMapper(AdministratorRoleDao.class);
		
		int aft = dao.delete(name);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int insert(AdministratorRole administratorRole) throws SQLException {
		
		SqlSession session = ssf.openSession();
		AdministratorRoleDao dao = session.getMapper(AdministratorRoleDao.class);
		
		int aft = dao.insert(administratorRole);
		session.commit();
		session.close();
		return aft;
	}


}
