package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.CategoryDao;
import kr.talenton.web.vo.Category;

public class MyBatisCategoryDao implements CategoryDao {
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Category> getCategorys() throws SQLException {
	
		return getCategorys(1, "MID", "");
	}

	@Override
	public List<Category> getCategorys(int page) throws SQLException {
	
		return getCategorys(page, "MID", "");
	}

	@Override
	public List<Category> getCategorys(int page, String field, String query) throws SQLException {
	
		SqlSession session = ssf.openSession();
		CategoryDao dao = session.getMapper(CategoryDao.class);
		
		List<Category> list = dao.getCategorys(page, field, query); //페이지 1인부분 출력
		session.close();
		return list;
	}

	@Override
	public int update(Category category) throws SQLException {

		SqlSession session = ssf.openSession();
		CategoryDao dao = session.getMapper(CategoryDao.class);
		
		int aft = dao.update(category);
		
		session.commit();
		session.close();
		return aft;
		
	}

	@Override
	public int delete(String mid) throws SQLException {
		
		SqlSession session = ssf.openSession();
		CategoryDao dao = session.getMapper(CategoryDao.class);
		
		int aft = dao.delete(mid);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int insert(Category category) throws SQLException {
		
		SqlSession session = ssf.openSession();
		CategoryDao dao = session.getMapper(CategoryDao.class);
		
		int aft = dao.insert(category);
		session.commit();
		session.close();
		return aft;
	}


}
