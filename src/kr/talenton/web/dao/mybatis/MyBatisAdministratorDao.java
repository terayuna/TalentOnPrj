package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.AdministratorDao;
import kr.talenton.web.vo.Administrator;


public class MyBatisAdministratorDao implements AdministratorDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Administrator> getAdministrators() throws SQLException {
	
		return getAdministrators(1, "ID", "");
	}

	@Override
	public List<Administrator> getAdministrators(int page) throws SQLException {
	
		return getAdministrators(page, "ID", "");
	}

	@Override
	public List<Administrator> getAdministrators(int page, String field, String query) throws SQLException {
	
		SqlSession session = ssf.openSession();
		AdministratorDao dao = session.getMapper(AdministratorDao.class);
		
		List<Administrator> list = dao.getAdministrators(page, field, query); //페이지 1인부분 출력
		session.close();
		return list;
	}

	@Override
	public int update(Administrator administrator) throws SQLException {

		SqlSession session = ssf.openSession();
		AdministratorDao dao = session.getMapper(AdministratorDao.class);
		
		int aft = dao.update(administrator);
		
		session.commit();
		session.close();
		return aft;
		
	}

	@Override
	public int delete(String id) throws SQLException {
		
		SqlSession session = ssf.openSession();
		AdministratorDao dao = session.getMapper(AdministratorDao.class);
		
		int aft = dao.delete(id);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int insert(Administrator administrator) throws SQLException {
		
		SqlSession session = ssf.openSession();
		AdministratorDao dao = session.getMapper(AdministratorDao.class);
		
		int aft = dao.insert(administrator);
		session.commit();
		session.close();
		return aft;
	}

}
