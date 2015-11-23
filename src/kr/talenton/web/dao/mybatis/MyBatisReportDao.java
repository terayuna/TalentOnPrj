package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import kr.talenton.web.dao.ReportDao;
import kr.talenton.web.vo.Report;

public class MyBatisReportDao implements ReportDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Report> getReports() throws SQLException {
		
		return getReports(1,"member_id","");
	}

	@Override
	public List<Report> getReports(int page) throws SQLException {
		
		return getReports(page,"member_id","");
	}

	@Override
	public List<Report> getReports(int page, String field, String query) throws SQLException {
		
        SqlSession session = ssf.openSession();
        ReportDao dao = session.getMapper(ReportDao.class);
		List<Report> list = dao.getReports(page,field,query);
		
		session.commit();
		session.close();
		return list;
	}

	@Override
	public int update(Report report) {
		
		 SqlSession session = ssf.openSession();
		 ReportDao dao = session.getMapper(ReportDao.class);
			int aft = dao.update(report);
			
			session.commit();
			session.close();
		
		return aft;
	}
	
	@Override
	public int insert(Report report) {
		SqlSession session = ssf.openSession();
		ReportDao dao = session.getMapper(ReportDao.class);
		int aft = dao.insert(report);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String member_id, int product_code) {
		
		SqlSession session = ssf.openSession();
		ReportDao dao = session.getMapper(ReportDao.class);
		int aft = dao.delete(member_id, product_code);
		
		session.commit();
		session.close();
		
		return aft;
	}

}
