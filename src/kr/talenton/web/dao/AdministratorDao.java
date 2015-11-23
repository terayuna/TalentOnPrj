package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;
import kr.talenton.web.vo.Administrator;

public interface AdministratorDao {
	
	public List<Administrator> getAdministrators() throws SQLException;
	public List<Administrator> getAdministrators(int page) throws SQLException;
	public List<Administrator> getAdministrators(int page, String field, String query) throws SQLException;
	public int update(Administrator administrator) throws SQLException;
	public int delete(String mid) throws SQLException;
	public int insert(Administrator administrator) throws SQLException;

}
