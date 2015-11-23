package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Category;

public interface CategoryDao {
	
	public List<Category> getCategorys() throws SQLException;
	public List<Category> getCategorys(int page) throws SQLException;
	public List<Category> getCategorys(int page, String field, String query) throws SQLException;
	public int update(Category category) throws SQLException;
	public int delete(String mid) throws SQLException;
	public int insert(Category category) throws SQLException;


}
