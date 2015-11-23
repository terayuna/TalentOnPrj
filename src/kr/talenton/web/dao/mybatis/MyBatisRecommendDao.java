package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.RecommendDao;
import kr.talenton.web.vo.Recommend;

public class MyBatisRecommendDao implements RecommendDao {
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Recommend> getRecommends() throws SQLException {
	
		return getRecommends(1, "MID", "");
	}

	@Override
	public List<Recommend> getRecommends(int page) throws SQLException {
	
		return getRecommends(page, "MID", "");
	}

	@Override
	public List<Recommend> getRecommends(int page, String field, String query) throws SQLException {
	
		SqlSession session = ssf.openSession();
		RecommendDao dao = session.getMapper(RecommendDao.class);
		
		List<Recommend> list = dao.getRecommends(page, field, query); //페이지 1인부분 출력
		session.close();
		return list;
	}

	@Override
	public int update(Recommend recommend) throws SQLException {

		SqlSession session = ssf.openSession();
		RecommendDao dao = session.getMapper(RecommendDao.class);
		
		int aft = dao.update(recommend);
		
		session.commit();
		session.close();
		return aft;
		
	}

	@Override
	public int delete(String mid) throws SQLException {
		
		SqlSession session = ssf.openSession();
		RecommendDao dao = session.getMapper(RecommendDao.class);
		
		int aft = dao.delete(mid);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int insert(Recommend recommend) throws SQLException {
		
		SqlSession session = ssf.openSession();
		RecommendDao dao = session.getMapper(RecommendDao.class);
		
		int aft = dao.insert(recommend);
		session.commit();
		session.close();
		return aft;
	}
	
	

}
