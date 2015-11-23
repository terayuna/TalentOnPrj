package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.UploadTypeDao;
import kr.talenton.web.vo.UploadType;

public class MyBatisUploadTypeDao implements UploadTypeDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<UploadType> getUploadTypes() throws SQLException {
		
		return getUploadTypes(1,"title","");
	}

	@Override
	public List<UploadType> getUploadTypes(int page) throws SQLException {
		
		return getUploadTypes(page,"title","");
	}

	@Override
	public List<UploadType> getUploadTypes(int page, String field, String query) throws SQLException {
		
        SqlSession session = ssf.openSession();
        UploadTypeDao dao = session.getMapper(UploadTypeDao.class);
		List<UploadType> list = dao.getUploadTypes(page,"title","");
		
		session.commit();
		session.close();
		return list;
	}

	@Override
	public int update(UploadType uploadtype) {
		
		 SqlSession session = ssf.openSession();
		 UploadTypeDao dao = session.getMapper(UploadTypeDao.class);
			int aft = dao.update(uploadtype);
			
			session.commit();
			session.close();
		
		return aft;
	}
	
	@Override
	public int insert(UploadType uploadtype) {
		SqlSession session = ssf.openSession();
		UploadTypeDao dao = session.getMapper(UploadTypeDao.class);
		int aft = dao.insert(uploadtype);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String mid) {
		
		SqlSession session = ssf.openSession();
		UploadTypeDao dao = session.getMapper(UploadTypeDao.class);
		int aft = dao.delete(mid);
		
		session.commit();
		session.close();
		
		return aft;
	}


}
