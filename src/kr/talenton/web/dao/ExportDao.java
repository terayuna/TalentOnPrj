package kr.talenton.web.dao;
import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Comment;
import kr.talenton.web.vo.Export;

public interface ExportDao {

	public List<Export> getExports() throws SQLException;
	public List<Export> getExports(int page) throws SQLException;
	public List<Export> getExports(int page,String field, String query) throws SQLException;

	
	public int update(Export export) throws SQLException;
	public int delete(String member_id, int product_code) throws SQLException;
	public int insert(Export export) throws SQLException;
	
}
