package kr.talenton.web.dao;
import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Comment;
import kr.talenton.web.vo.ExportSNS;

public interface ExportSNSDao {

	public List<ExportSNS> getExportSNSs() throws SQLException;
	public List<ExportSNS> getExportSNSs(int page) throws SQLException;
	public List<ExportSNS> getExportSNSs(int page,String field, String query) throws SQLException;

	
	public int update(ExportSNS exportsns) throws SQLException;
	public int delete(String name) throws SQLException;
	public int insert(ExportSNS exportsns) throws SQLException;
	
}
