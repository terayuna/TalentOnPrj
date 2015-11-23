package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Notification;


public interface NotificationDao {
	
	public List<Notification> getNotifications() throws SQLException;
	public List<Notification> getNotifications(int page) throws SQLException;
	public List<Notification> getNotifications(int page,String field, String query) throws SQLException;
	public int update(Notification notification);
	public int delete(String status);
	public int insert(Notification notification);

}
