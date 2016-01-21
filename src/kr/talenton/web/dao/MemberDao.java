package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Comment;
import kr.talenton.web.vo.Member;

public interface MemberDao {
	
	
	public List<Member> getMembers() throws SQLException;
	public List<Member> getMembers(int page) throws SQLException;
	public List<Member> getMembers(int page,String field, String query) throws SQLException;

	public Member getMember(String id);
	
	public int update(Member member) throws SQLException;
	public int delete(String id) throws SQLException; //실제로는 업데이트 (아이디 :탈퇴회원 1)
	public int insert(Member member) throws SQLException;
	public String searchId(String member_email);
	public String searchPwd(String member_id, String member_email);
}
