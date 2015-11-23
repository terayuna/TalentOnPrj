package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Product;

public interface ProductDao {
	
	public List<Product> getProducts() throws SQLException;
	public List<Product> getProducts(int page) throws SQLException;
	public List<Product> getProducts(int page,String field, String query) throws SQLException;
	public int update(Product product);
	public int delete(String mid);
	public int insert(Product product);

}
