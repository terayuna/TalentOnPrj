package kr.talenton.web.vo;

import java.util.Date;

public class Comment {
	
	private String member_id; //기본키, 외래키
	private int product_code; // 기본키, 외래키
	private Date date;
	private String content;
	
	
	public String getMember_id() {
		return member_id;
	}
	
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	public int getProduct_code() {
		return product_code;
	}
	
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
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
