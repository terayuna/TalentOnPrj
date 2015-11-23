package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.InquiryDao;
import kr.talenton.web.vo.Inquiry;

public class MyBatisInquiryDao implements InquiryDao{

	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Inquiry> getInquirys() throws SQLException {
		// TODO Auto-generated method stub
		return getInquirys(1,"MEMBER_ID","");
	}

	@Override
	public List<Inquiry> getInquirys(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getInquirys(1,"MEMBER_ID","");
	}

	@Override
	public List<Inquiry> getInquirys(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		InquiryDao dao = session.getMapper(InquiryDao.class);
		
		List<Inquiry> list = dao.getInquirys(page, field, query);
		session.close();
		
		return list;
	}
	

	@Override
	public int update(Inquiry inquiry) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		InquiryDao dao = session.getMapper(InquiryDao.class);
		int aft = dao.update(inquiry);
		
		session.commit();		
		session.close();
		
		return aft;
	}

	@Override
	public int delete(int code) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		InquiryDao dao = session.getMapper(InquiryDao.class);
		int aft = dao.delete(code);
		
		session.commit();		
		session.close();
		
		return aft;
	}

	@Override
	public int insert(Inquiry inquiry) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		InquiryDao dao = session.getMapper(InquiryDao.class);
		int aft = dao.insert(inquiry);
		
		session.commit();
		session.close();
		
		return aft;
	}
	
}
