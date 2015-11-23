package kr.talenton.web.dao;
import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Comment;
import kr.talenton.web.vo.Favorite;

public interface FavoriteDao {
	public List<Favorite> getFavorites() throws SQLException;
	public List<Favorite> getFavorites(int page) throws SQLException;
	public List<Favorite> getFavorites(int page,String field, String query) throws SQLException;

	
	public int update(Favorite favorite) throws SQLException;
	public int delete(String add_id, int added_id) throws SQLException;
	public int insert(Favorite favorite) throws SQLException;
	
}
