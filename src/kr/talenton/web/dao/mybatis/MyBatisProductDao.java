package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.ProductDao;
import kr.talenton.web.vo.Product;

public class MyBatisProductDao implements ProductDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Product> getProducts() throws SQLException {
		
		return getProducts(1,"code","");
	}

	@Override
	public List<Product> getProducts(int page) throws SQLException {
		
		return getProducts(page,"code","");
	}

	@Override
	public List<Product> getProducts(int page, String field, String query) throws SQLException {
		
        SqlSession session = ssf.openSession();
        ProductDao dao = session.getMapper(ProductDao.class);
		List<Product> list = dao.getProducts(page,field,query);
		
		session.commit();
		session.close();
		return list;
	}

	@Override
	public int update(Product product) {
		
		 SqlSession session = ssf.openSession();
		 ProductDao dao = session.getMapper(ProductDao.class);
			int aft = dao.update(product);
			
			session.commit();
			session.close();
		
		return aft;
	}
	
	@Override
	public int insert(Product product) {
		SqlSession session = ssf.openSession();
		ProductDao dao = session.getMapper(ProductDao.class);
		int aft = dao.insert(product);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int delete(int code) {
		
		SqlSession session = ssf.openSession();
		ProductDao dao = session.getMapper(ProductDao.class);
		int aft = dao.delete(code);
		
		session.commit();
		session.close();
		
		return aft;
	}

}
