package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Notice;

public interface NoticeDao {
	
	public List<Notice> getNotices() throws SQLException;
	public List<Notice> getNotices(int page) throws SQLException;
	public List<Notice> getNotices(int page, String field, String query) throws SQLException;
	public Notice getNotice(String code) throws SQLException;
	public String getLastCode();
	public int update(Notice notice) throws SQLException;
	public int insert(Notice n) throws SQLException;
	public int delete(String code) throws SQLException;
	public Notice getPrevNotice(String code);
	public Notice getNextNotice(String code);

}
