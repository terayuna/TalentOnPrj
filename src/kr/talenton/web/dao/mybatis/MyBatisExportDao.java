package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.CommentDao;
import kr.talenton.web.dao.ExportDao;
import kr.talenton.web.vo.Comment;
import kr.talenton.web.vo.Export;

public class MyBatisExportDao implements ExportDao{
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Override
	public List<Export> getExports() throws SQLException {
		// TODO Auto-generated method stub
		return getExports(1,"MEMBER_ID","");
	}

	@Override
	public List<Export> getExports(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getExports(page,"MEMBER_ID","");
	}

	@Override
	public List<Export> getExports(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ExportDao dao = session.getMapper(ExportDao.class);
		
		List<Export> list = dao.getExports(page, field, query);
		session.close();
		
		return list;
	}

	@Override
	public int update(Export export) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ExportDao dao = session.getMapper(ExportDao.class);
		int aft = dao.update(export);
		
		session.commit();		
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String member_id, int product_code) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ExportDao dao = session.getMapper(ExportDao.class);
		int aft = dao.delete(member_id,product_code);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int insert(Export export) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ExportDao dao = session.getMapper(ExportDao.class);
		int aft = dao.insert(export);
		
		session.commit();
		session.close();
		
		return aft;
	}


}
