package kr.talenton.web.vo;

import java.util.Date;

public class Report {
	private String member_id;
	private int product_code;
	private Date date;
	private Date respond_date;
	private String respond_content;
	private String respond_id;
	
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
	public Date getRespond_date() {
		return respond_date;
	}
	public void setRespond_date(Date respond_date) {
		this.respond_date = respond_date;
	}
	public String getRespond_content() {
		return respond_content;
	}
	public void setRespond_content(String respond_content) {
		this.respond_content = respond_content;
	}
	public String getRespond_id() {
		return respond_id;
	}
	public void setRespond_id(String respond_id) {
		this.respond_id = respond_id;
	}
	
	
}
