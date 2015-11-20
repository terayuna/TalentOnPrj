package kr.talenton.web.vo;

import java.util.Date;

public class AdministratorMessage {
	
	private String administrator_id; //기본키, 외래키
	private String member_id; //기본키, 외래키
	private int code; //기본키
	private String title;
	private String content;
	private Date send_date;
	private Date receive_date;
	
	
	public String getAdministrator_id() {
		return administrator_id;
	}
	
	public void setAdministrator_id(String administrator_id) {
		this.administrator_id = administrator_id;
	}
	
	public String getMember_id() {
		return member_id;
	}
	
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getSend_date() {
		return send_date;
	}
	
	public void setSend_date(Date send_date) {
		this.send_date = send_date;
	}
	
	public Date getReceive_date() {
		return receive_date;
	}
	
	public void setReceive_date(Date receive_date) {
		this.receive_date = receive_date;
	}
	
	
	

}
