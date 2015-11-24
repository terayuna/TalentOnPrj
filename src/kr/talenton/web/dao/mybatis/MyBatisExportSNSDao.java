package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.ExportSNSDao;
import kr.talenton.web.vo.ExportSNS;

public class MyBatisExportSNSDao implements ExportSNSDao{
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
	//멤버 다오를 공장에서 꺼내와야함

	@Override
	public List<ExportSNS> getExportSNSs() throws SQLException {
		// TODO Auto-generated method stub
		return getExportSNSs(1,"NAME","");
	}

	@Override
	public List<ExportSNS> getExportSNSs(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getExportSNSs(page,"NAME","");
	}

	@Override
	public List<ExportSNS> getExportSNSs(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ExportSNSDao dao = session.getMapper(ExportSNSDao.class);
		
		List<ExportSNS> list = dao.getExportSNSs(page, field, query);
		session.close();
		
		return list;
	}

	@Override
	public int update(ExportSNS exportSNS) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ExportSNSDao dao = session.getMapper(ExportSNSDao.class);
		int aft = dao.update(exportSNS);
		
		session.commit();		
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String name) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ExportSNSDao dao = session.getMapper(ExportSNSDao.class);
		int aft = dao.delete(name);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int insert(ExportSNS exportSNS) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ExportSNSDao dao = session.getMapper(ExportSNSDao.class);
		int aft = dao.insert(exportSNS);
		
		session.commit();
		session.close();
		
		return aft;
	}

}
