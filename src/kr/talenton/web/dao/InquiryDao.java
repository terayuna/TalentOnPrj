package kr.talenton.web.dao;
import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Comment;
import kr.talenton.web.vo.Inquiry;

public interface InquiryDao {
	public List<Inquiry> getInquirys() throws SQLException;
	public List<Inquiry> getInquirys(int page) throws SQLException;
	public List<Inquiry> getInquirys(int page,String field, String query) throws SQLException;

	
	public int update(Inquiry inquiry) throws SQLException;
	public int delete(int code) throws SQLException;
	public int insert(Inquiry inquiry) throws SQLException;
	
}
