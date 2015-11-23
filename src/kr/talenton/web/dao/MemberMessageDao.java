package kr.talenton.web.dao;
import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Comment;
import kr.talenton.web.vo.MemberMessage;

public interface MemberMessageDao {
	public List<MemberMessage> getMemberMessages() throws SQLException;
	public List<MemberMessage> getMemberMessages(int page) throws SQLException;
	public List<MemberMessage> getMemberMessages(int page,String field, String query) throws SQLException;

	
	public int update(MemberMessage memberMessage) throws SQLException;
	public int delete(String administrator,String member_id, int code) throws SQLException;
	public int insert(MemberMessage memberMessage) throws SQLException;
	
}
