package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.MemberSNS;

public interface MemberSNSDao {
	
	public List<MemberSNS> getMemberSNSs() throws SQLException;
	public List<MemberSNS> getMemberSNSs(int page) throws SQLException;
	public List<MemberSNS> getMemberSNSs(int page,String field, String query) throws SQLException;
	public int update(MemberSNS memberSNS);
	public int delete(String member_id, String name);
	public int insert(MemberSNS memberSNS);
	

}
