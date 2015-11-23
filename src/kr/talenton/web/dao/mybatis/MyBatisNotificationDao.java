package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.NotificationDao;
import kr.talenton.web.vo.Notification;


public class MyBatisNotificationDao implements NotificationDao{
	
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Notification> getNotifications() throws SQLException {
		
		return getNotifications(1,"MID","");
	}

	@Override
	public List<Notification> getNotifications(int page) throws SQLException {
		
		return getNotifications(page,"MID","");
	}

	@Override
	public List<Notification> getNotifications(int page, String field, String query) throws SQLException {
		
        SqlSession session = ssf.openSession();
        NotificationDao dao = session.getMapper(NotificationDao.class);
		List<Notification> list = dao.getNotifications(page,"MID","jwk");
		
		session.close();
		return list;
	}

	@Override
	public int update(Notification notification) {
		
		 SqlSession session = ssf.openSession();
		 NotificationDao dao = session.getMapper(NotificationDao.class);
			int aft = dao.update(notification);
			
			session.commit();
			session.close();
		
		return aft;
	}
	
	@Override
	public int insert(Notification notification) {
		SqlSession session = ssf.openSession();
		NotificationDao dao = session.getMapper(NotificationDao.class);
		int aft = dao.insert(notification);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String mid) {
		
		SqlSession session = ssf.openSession();
		NotificationDao dao = session.getMapper(NotificationDao.class);
		int aft = dao.delete(mid);
		
		session.commit();
		session.close();
		
		return aft;
	}


}
