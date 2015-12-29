import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import kr.talenton.web.dao.MemberDao;
import kr.talenton.web.dao.mybatis.MyBatisMemberDao;
import kr.talenton.web.dao.mybatis.TalentOnSqlSessionFactoryBuilder;
import kr.talenton.web.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException {

		SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
				//멤버 다오를 공장에서 꺼내와야함
		
		SqlSession session = ssf.openSession();
		MemberDao dao = new MyBatisMemberDao();
		Member member = new Member();
	
		member.setAddress("서울시 구로구");
		member.setBirthday("1990-04-15");
		member.setEmail("mansoo@naver.com");
		member.setId("minsook");
		member.setName("김민수");
		member.setNotification_status("Yes");
		member.setPassword("1111");
		member.setPhone("02-1111-1111");
		member.setDate(null);
		member.setImage(null);
		member.setSelf_introduction(null);
		dao.insert(member);
		
		
		
		/*List<Member> list = dao.getMembers(1,"TITLE","");
		
		
		for(Member l : list)
		{
			System.out.printf("code : %s, name : %s\n", l.getWriterName(), l.getContent());
		}*/
		session.close();
		
	}

}