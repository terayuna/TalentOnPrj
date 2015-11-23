package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;
import kr.talenton.web.vo.AdministratorMessage;

public interface AdministratorMessageDao {
	
	public List<AdministratorMessage> getAdministratorMessages() throws SQLException;
	public List<AdministratorMessage> getAdministratorMessages(int page) throws SQLException;
	public List<AdministratorMessage> getAdministratorMessages(int page, String field, String query) throws SQLException;
	public int update(AdministratorMessage administratorMessage) throws SQLException;
	public int delete(String mid) throws SQLException;
	public int insert(AdministratorMessage administratorMessage) throws SQLException;


}
