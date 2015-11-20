package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.talenton.web.dao.CommentDao;
import kr.talenton.web.dao.mybatis.TalentOnSqlSessionFactoryBuilder;
import kr.talenton.web.vo.Comment;

public class MyBatisCommentDao implements CommentDao{
	SqlSessionFactory ssf = TalentOnSqlSessionFactoryBuilder.getSqlSessionFactory();
	//멤버 다오를 공장에서 꺼내와야함

	@Override
	public List<Comment> getComments() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getComments(int more_count) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getComments(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Comment comment) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String member_id, int product_code) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Comment comment) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
