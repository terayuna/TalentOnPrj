package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Bid;

public interface BidDao {
	
	public List<Bid> getBids() throws SQLException;
	public List<Bid> getBids(int page) throws SQLException;
	public List<Bid> getBids(int page, String field, String query) throws SQLException;
	public int update(Bid bid) throws SQLException;
	public int delete(String mid) throws SQLException;
	public int insert(Bid bid) throws SQLException;

}
