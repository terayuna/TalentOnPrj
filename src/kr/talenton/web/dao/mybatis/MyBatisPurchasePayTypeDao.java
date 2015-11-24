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
		
		return getPurchasePayTypes(1,"NAME","");
	}

	@Override
	public List<PurchasePayType> getPurchasePayTypes(int page) throws SQLException {
		
		return getPurchasePayTypes(page,"NAME","");
	}

	@Override
	public List<PurchasePayType> getPurchasePayTypes(int page, String field, String query) throws SQLException {
		
        SqlSession session = ssf.openSession();
        PurchasePayTypeDao dao = session.getMapper(PurchasePayTypeDao.class);
		List<PurchasePayType> list = dao.getPurchasePayTypes(page,field,query);
		
		session.commit();
		session.close();
		return list;
	}

	@Override
	public int update(PurchasePayType purchasePayType) {
		
		 SqlSession session = ssf.openSession();
		 PurchasePayTypeDao dao = session.getMapper(PurchasePayTypeDao.class);
			int aft = dao.update(purchasePayType);
			
			session.commit();
			session.close();
		
		return aft;
	}
	
	@Override
	public int insert(PurchasePayType purchasePayType) {
		SqlSession session = ssf.openSession();
		PurchasePayTypeDao dao = session.getMapper(PurchasePayTypeDao.class);
		int aft = dao.insert(purchasePayType);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String name) {
		
		SqlSession session = ssf.openSession();
		PurchasePayTypeDao dao = session.getMapper(PurchasePayTypeDao.class);
		int aft = dao.delete(name);
		
		session.commit();
		session.close();
		
		return aft;
	}

}
