package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.PurchasePayTypeDao;

import kr.talenton.web.vo.PurchasePayType;

public class MyBatisPurchasePayTypeDao implements PurchasePayTypeDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<PurchasePayType> getPurchasePayTypes() throws SQLException {
		
		return getPurchasePayTypes(1,"title","");
	}

	@Override
	public List<PurchasePayType> getPurchasePayTypes(int page) throws SQLException {
		
		return getPurchasePayTypes(page,"title","");
	}

	@Override
	public List<PurchasePayType> getPurchasePayTypes(int page, String field, String query) throws SQLException {
		
        SqlSession session = ssf.openSession();
        PurchasePayTypeDao dao = session.getMapper(PurchasePayTypeDao.class);
		List<PurchasePayType> list = dao.getPurchasePayTypes(page,"title","");
		
		session.commit();
		session.close();
		return list;
	}

	@Override
	public int update(PurchasePayType purchasepaytype) {
		
		 SqlSession session = ssf.openSession();
		 PurchasePayTypeDao dao = session.getMapper(PurchasePayTypeDao.class);
			int aft = dao.update(purchasepaytype);
			
			session.commit();
			session.close();
		
		return aft;
	}
	
	@Override
	public int insert(PurchasePayType purchasepaytype) {
		SqlSession session = ssf.openSession();
		PurchasePayTypeDao dao = session.getMapper(PurchasePayTypeDao.class);
		int aft = dao.insert(purchasepaytype);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String mid) {
		
		SqlSession session = ssf.openSession();
		PurchasePayTypeDao dao = session.getMapper(PurchasePayTypeDao.class);
		int aft = dao.delete(mid);
		
		session.commit();
		session.close();
		
		return aft;
	}

}
