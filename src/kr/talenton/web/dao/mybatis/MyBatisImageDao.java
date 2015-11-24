package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.ImageDao;
import kr.talenton.web.vo.Image;

public class MyBatisImageDao implements ImageDao{
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<Image> getImages() throws SQLException {
		// TODO Auto-generated method stub
		return getImages(1,"CODE","");
	}

	@Override
	public List<Image> getImages(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getImages(page,"CODE","");
	}

	@Override
	public List<Image> getImages(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ImageDao dao = session.getMapper(ImageDao.class);
		
		List<Image> list = dao.getImages(page, field, query);
		session.close();
		
		return list;
	}

	@Override
	public int update(Image image) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ImageDao dao = session.getMapper(ImageDao.class);
		int aft = dao.update(image);
		
		session.commit();		
		session.close();
		
		return aft;
	}

	@Override
	public int delete(int code) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ImageDao dao = session.getMapper(ImageDao.class);
		int aft = dao.delete(code);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int insert(Image image) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ImageDao dao = session.getMapper(ImageDao.class);
		int aft = dao.insert(image);
		
		session.commit();
		session.close();
		
		return aft;
	}
	
}
