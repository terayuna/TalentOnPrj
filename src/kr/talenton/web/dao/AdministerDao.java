package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Administer;


public interface AdministerDao {
	
	public List<Administer> getMembers() throws SQLException;
	public List<Administer> getMembers(int page) throws SQLException;
	public List<Administer> getMembers(int page, String field, String query) throws SQLException;
	public int update(Administer administer) throws SQLException;
	public int delete(String mid) throws SQLException;
	public int insert(Administer member) throws SQLException;

}
