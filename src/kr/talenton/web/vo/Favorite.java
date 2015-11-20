package kr.talenton.web.vo;

import java.util.Date;

public class Favorite {
	
	private String add_id; // 기본키, 외래키
	private String added_id; // 기본키, 외래키
	private Date date;
	
	
	public String getAdd_id() {
		return add_id;
	}
	
	public void setAdd_id(String add_id) {
		this.add_id = add_id;
	}
	
	public String getAdded_id() {
		return added_id;
	}
	
	public void setAdded_id(String added_id) {
		this.added_id = added_id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
