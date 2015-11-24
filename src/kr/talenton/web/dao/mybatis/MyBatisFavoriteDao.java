package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.CommentDao;
import kr.talenton.web.dao.FavoriteDao;
import kr.talenton.web.vo.Comment;
import kr.talenton.web.vo.Favorite;

public class MyBatisFavoriteDao implements FavoriteDao{
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<Favorite> getFavorites() throws SQLException {
		// TODO Auto-generated method stub
		return getFavorites(1,"ADD_ID","");
	}

	@Override
	public List<Favorite> getFavorites(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getFavorites(page,"ADD_ID","");
	}

	@Override
	public List<Favorite> getFavorites(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		FavoriteDao dao = session.getMapper(FavoriteDao.class);
		
		List<Favorite> list = dao.getFavorites(page, field, query);
		session.close();
		
		return list;
	}

	@Override
	public int update(Favorite favorite) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		FavoriteDao dao = session.getMapper(FavoriteDao.class);
		int aft = dao.update(favorite);
		
		session.commit();		
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String add_id, String added_id) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		FavoriteDao dao = session.getMapper(FavoriteDao.class);
		int aft = dao.delete(add_id,added_id);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int insert(Favorite favorite) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		FavoriteDao dao = session.getMapper(FavoriteDao.class);
		int aft = dao.insert(favorite);
		
		session.commit();
		session.close();
		
		return aft;
	}
	
}
