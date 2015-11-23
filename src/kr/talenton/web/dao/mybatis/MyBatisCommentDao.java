package kr.talenton.web.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.CommentDao;
import kr.talenton.web.vo.Comment;

public class MyBatisCommentDao implements CommentDao{
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
	//멤버 다오를 공장에서 꺼내와야함

	@Override
	public List<Comment> getComments() throws SQLException {
		// TODO Auto-generated method stub
		return getComments(1,"MEMBER_ID","");
	}

	@Override
	public List<Comment> getComments(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getComments(page,"MEMBER_ID","");
	}

	@Override
	public List<Comment> getComments(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		CommentDao dao = session.getMapper(CommentDao.class);
		
		List<Comment> list = dao.getComments(page, field, query);
		session.close();
		
		return list;
	}

	@Override
	public int update(Comment comment) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		CommentDao dao = session.getMapper(CommentDao.class);
		int aft = dao.update(comment);
		
		session.commit();		
		session.close();
		
		return aft;
	}

	@Override
	public int delete(String member_id, int product_code) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		CommentDao dao = session.getMapper(CommentDao.class);
		int aft = dao.delete(member_id,product_code);
		
		session.commit();
		session.close();
		
		return aft;
	}

	@Override
	public int insert(Comment comment) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		CommentDao dao = session.getMapper(CommentDao.class);
		int aft = dao.insert(comment);
		
		session.commit();
		session.close();
		
		return aft;
	}

}
