package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.BidPayTypeDao;
import kr.talenton.web.vo.BidPayType;

public class MyBatisBidPayTypeDao implements BidPayTypeDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<BidPayType> getBidPayTypes() throws SQLException {
	
		return getBidPayTypes(1, "NAME", "");
	}

	@Override
	public List<BidPayType> getBidPayTypes(int page) throws SQLException {
	
		return getBidPayTypes(page, "NAME", "");
	}

	@Override
	public List<BidPayType> getBidPayTypes(int page, String field, String query) throws SQLException {
	
		SqlSession session = ssf.openSession();
		BidPayTypeDao dao = session.getMapper(BidPayTypeDao.class);
		
		List<BidPayType> list = dao.getBidPayTypes(page, field, query); //페이지 1인부분 출력
		session.close();
		return list;
	}

	@Override
	public int update(BidPayType bidPayType) throws SQLException {

		SqlSession session = ssf.openSession();
		BidPayTypeDao dao = session.getMapper(BidPayTypeDao.class);
		
		int aft = dao.update(bidPayType);
		
		session.commit();
		session.close();
		return aft;
		
	}

	@Override
	public int delete(String name) throws SQLException {
		
		SqlSession session = ssf.openSession();
		BidPayTypeDao dao = session.getMapper(BidPayTypeDao.class);
		
		int aft = dao.delete(name);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int insert(BidPayType bidPayType) throws SQLException {
		
		SqlSession session = ssf.openSession();
		BidPayTypeDao dao = session.getMapper(BidPayTypeDao.class);
		
		int aft = dao.insert(bidPayType);
		session.commit();
		session.close();
		return aft;
	}


}
