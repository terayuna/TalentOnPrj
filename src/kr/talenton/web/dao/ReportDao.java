package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Report;


public interface ReportDao {
	
	public List<Report> getReports() throws SQLException;
	public List<Report> getReports(int page) throws SQLException;
	public List<Report> getReports(int page,String field, String query) throws SQLException;
	public int update(Report report);
	public int delete(String mid);
	public int insert(Report report);

}
