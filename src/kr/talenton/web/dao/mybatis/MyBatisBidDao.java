package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.BidDao;
import kr.talenton.web.vo.Bid;

public class MyBatisBidDao implements BidDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Bid> getBids() throws SQLException {
	
		return getBids(1, "MID", "");
	}

	@Override
	public List<Bid> getBids(int page) throws SQLException {
	
		return getBids(page, "MID", "");
	}

	@Override
	public List<Bid> getBids(int page, String field, String query) throws SQLException {
	
		SqlSession session = ssf.openSession();
		BidDao dao = session.getMapper(BidDao.class);
		
		List<Bid> list = dao.getBids(page, field, query); //페이지 1인부분 출력
		session.close();
		return list;
	}

	@Override
	public int update(Bid bid) throws SQLException {

		SqlSession session = ssf.openSession();
		BidDao dao = session.getMapper(BidDao.class);
		
		int aft = dao.update(bid);
		
		session.commit();
		session.close();
		return aft;
		
	}

	@Override
	public int delete(String mid) throws SQLException {
		
		SqlSession session = ssf.openSession();
		BidDao dao = session.getMapper(BidDao.class);
		
		int aft = dao.delete(mid);
		session.commit();
		session.close();
		return aft;
	}

	@Override
	public int insert(Bid bid) throws SQLException {
		
		SqlSession session = ssf.openSession();
		BidDao dao = session.getMapper(BidDao.class);
		
		int aft = dao.insert(bid);
		session.commit();
		session.close();
		return aft;
	}


}
