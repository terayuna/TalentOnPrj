package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.AdministratorRole;

public interface AdministratorRoleDao {
	
	public List<AdministratorRole> getAdministratorRoles() throws SQLException;
	public List<AdministratorRole> getAdministratorRoles(int page) throws SQLException;
	public List<AdministratorRole> getAdministratorRoles(int page, String field, String query) throws SQLException;
	public int update(AdministratorRole administratorRole) throws SQLException;
	public int delete(String name) throws SQLException;
	public int insert(AdministratorRole administratorRole) throws SQLException;

}
