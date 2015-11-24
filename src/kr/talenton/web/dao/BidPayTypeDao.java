package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.BidPayType;

public interface BidPayTypeDao {
	
	public List<BidPayType> getBidPayTypes() throws SQLException;
	public List<BidPayType> getBidPayTypes(int page) throws SQLException;
	public List<BidPayType> getBidPayTypes(int page, String field, String query) throws SQLException;
	public int update(BidPayType bidPayType) throws SQLException;
	public int delete(String name) throws SQLException;
	public int insert(BidPayType bidPayType) throws SQLException;

}
