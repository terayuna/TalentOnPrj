package kr.talenton.web.dao;

import java.util.List;

import kr.talenton.web.vo.MemberSNS;

public interface MemberSNSDao {
	
	public List<MemberSNS> getMemberSNSs(String member_id, String name);
	public int update(MemberSNS membersns);
	public int delete(String member_id, String name);
	public int insert(MemberSNS membersns);
	

}
