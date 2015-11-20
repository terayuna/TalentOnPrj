package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Member;

public interface MemberDao {
	public List<Member> getMembers() throws SQLException;
	
	public int update(Member member) throws SQLException;
	public int delete(String mid) throws SQLException; //실제로는 업데이트 (아이디 :탈퇴회원 1)
	public int insert(Member member) throws SQLException;
}