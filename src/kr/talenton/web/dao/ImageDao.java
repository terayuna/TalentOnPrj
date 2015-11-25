package kr.talenton.web.dao;
import java.sql.SQLException;
import java.util.List;

import kr.talenton.web.vo.Comment;
import kr.talenton.web.vo.Image;

public interface ImageDao {
	public List<Image> getImages() throws SQLException;
	public List<Image> getImages(int page) throws SQLException;
	public List<Image> getImages(int page,String field, String query) throws SQLException;

	
	public int update(Image image) throws SQLException;
	public int delete(int code) throws SQLException;
	public int insert(Image image) throws SQLException;
	
}
