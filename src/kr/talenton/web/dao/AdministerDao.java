package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import kr.talenton.web.vo.Administer;

public interface AdministerDao {
	
	public List<Administer> getAdministers() throws SQLException;
	public List<Administer> getAdministers(int page) throws SQLException;
	public List<Administer> getAdministers(int page, String field, String query) throws SQLException;
	public int update(Administer administer) throws SQLException;
	public int delete(String member_id, String administrator_id, Date date) throws SQLException;
	public int insert(Administer administer) throws SQLException;

}
