package kr.talenton.web.vo;

import java.util.Date;

public class Administer {
	
	private String member_id; // 기본키, 외래키
	private String administrator_id; // 기본키, 외래키
	private Date date; // 기본키
	private String content;
	

	public String getMember_id() {
		return member_id;
	}
	
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	public String getAdministrator_id() {
		return administrator_id;
	}
	
	public void setAdministrator_id(String administrator_id) {
		this.administrator_id = administrator_id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	

}
