package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Recommend;

public interface RecommendDao {
	
	public List<Recommend> getRecommends() throws SQLException;
	public List<Recommend> getRecommends(int page) throws SQLException;
	public List<Recommend> getRecommends(int page, String field, String query) throws SQLException;
	public int update(Recommend recommend) throws SQLException;
	public int delete(String mid) throws SQLException;
	public int insert(Recommend recommend) throws SQLException;
	

	
}
