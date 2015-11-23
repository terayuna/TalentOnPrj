package kr.talenton.web.dao;

import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.UploadType;


public interface UploadTypeDao {
	
	public List<UploadType> getUploadTypes() throws SQLException;
	public List<UploadType> getUploadTypes(int page) throws SQLException;
	public List<UploadType> getUploadTypes(int page,String field, String query) throws SQLException;
	public int update(UploadType uploadtype);
	public int delete(String mid);
	public int insert(UploadType uploadtype);

}
