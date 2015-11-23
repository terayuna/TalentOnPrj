package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.CommentDao;
import kr.talenton.web.dao.mybatis.MyBatisCommentDao;
import kr.talenton.web.dao.mybatis.TalentOnSqlSessionFactoryBuilder;
import kr.talenton.web.vo.Comment;



public class TestProgram {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//SqlSessionFactory ssf = SqlNewlecSessionFactoryBuilder.getSqlSessionFactory();
		//멤버 다오를 공장에서 꺼내와야함
		
		//SqlSession session = ssf.openSession();
		//MemberDao dao = session.getMapper(MemberDao.class);
		//session.close();
		//==============================================================================
		/*MemberDao dao = new JdbcMemberDao();
		
		
		List<Member> list = dao.getMembers(1);
		
		System.out.println("검색결과 : "+list.size());
		
		for(Member m : list)
		{
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
		}
		
		System.out.println("=======================");
		
		Member member = new Member();
		
		member.setMid("wntjd");
		member.setName("메롱");
		dao.update(member);
		for(Member m : list)
		{
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
		}
		
		System.out.println("=======================");
		
		dao.delete("onion");
		for(Member m : list)
		{
			
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
		}

		System.out.println("=======================");*/

		//==============================================================================
		
		/*member.setMid("hihihihihihi");
		member.setName("hihihihihihi");
		dao.insert(member);
		for(Member m : list)
		{
			
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
		}

		System.out.println("=======================");*/
		
		//위에 삽입 (제약조건위반으로 주석처리해놨음)
		
		/*dao.delete("cr2ative");

		List<Member> list = dao.getMembers(1);
		
		System.out.println("검색결과 : "+list.size());
		
		for(Member m : list)
		{
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
		}*/
		//System.out.printf("mid : %s, name : %s\n", a.getMid(), a.getName());
		
		
		
		//session.close(); //갖다 쓸 때 까지 기다렸다가 클로즈 해줘야되 !!
		//MyBatisMemberDao로 주고받을 경우 스택이 따로 만들어지기때문에
		//MyBatisMemberDao에서 클로즈할 수 있음(더빠르게 클로즈 가능)

		SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
				//멤버 다오를 공장에서 꺼내와야함
		
		SqlSession session = ssf.openSession();
		CommentDao dao = new MyBatisCommentDao();
		List<Comment> list = dao.getComments(1,"TITLE","");
		for(Comment l : list)
		{
			System.out.printf("code : %s, name : %s\n", l.getMember_id(), l.getContent());
		}
		session.close();
		
	}

}