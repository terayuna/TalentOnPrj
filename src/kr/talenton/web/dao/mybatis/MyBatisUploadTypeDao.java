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
		
		return getUploadTypes(1,"name","");
	}

	@Override
	public List<UploadType> getUploadTypes(int page) throws SQLException {
		
		return getUploadTypes(page,"name","");
	}

	@Override
	public List<UploadType> getUploadTypes(int page, String field, String query) throws SQLException {
		
        SqlSession session = ssf.openSession();
        UploadTypeDao dao = session.getMapper(UploadTypeDao.class);
		List<UploadType> list = dao.getUploadTypes(page,field,query);
		
		session.commit();
		session.close();
		return list;
	}

	@Override
	public int update(UploadType uploadType) {
		
		 SqlSession session = ssf.openSession();
		 UploadTypeDao dao = session.getMapper(UploadTypeDao.class);
			int aft = dao.update(uploadType);
			
			session.commit();
			session.close();
		
		return aft;
	}
	
	@Override
	public int insert(UploadType uploadType) {
		SqlSession session = ssf.openSession();
		UploadTypeDao dao = session.getMapper(UploadTypeDao.class);
		int aft = dao.insert(uploadType);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String name) {
		
		SqlSession session = ssf.openSession();
		UploadTypeDao dao = session.getMapper(UploadTypeDao.class);
		int aft = dao.delete(name);
		
		session.commit();
		session.close();
		
		return aft;
	}


}
