package kr.talenton.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.mybatis.TalentOnSqlSessionFactoryBuilder;
import kr.talenton.web.vo.MemberSNS;

public class MyBatisMemberSNSDao implements MemberSNSDao {
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<MemberSNS> getMemberSNSs() {
		
		return ;
	}

	@Override
	public int update(MemberSNS membersns) {
		
		return 0;
	}

	@Override
	public int delete(String member_id, String name) {
		
		return 0;
	}

	@Override
	public int insert(MemberSNS membersns) {
		
		return 0;
	}
	
	
	

}
