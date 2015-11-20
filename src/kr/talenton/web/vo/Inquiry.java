package kr.talenton.web.vo;

import java.util.Date;

public class Inquiry {
	private int code;
	private String title;
	private String content;
	private String answer_title;
	private String answer_content;
	private String answer_id;//외래키
	private String inquire_id;//외래키
	private Date inquire_date;
	private Date answer_date;
	
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
	public String getAnswer_title() {
		return answer_title;
	}
	public void setAnswer_title(String answer_title) {
		this.answer_title = answer_title;
	}
	public String getAnswer_content() {
		return answer_content;
	}
	public void setAnswer_content(String answer_content) {
		this.answer_content = answer_content;
	}
	public String getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(String answer_id) {
		this.answer_id = answer_id;
	}
	public String getInquire_id() {
		return inquire_id;
	}
	public void setInquire_id(String inquire_id) {
		this.inquire_id = inquire_id;
	}
	public Date getInquire_date() {
		return inquire_date;
	}
	public void setInquire_date(Date inquire_date) {
		this.inquire_date = inquire_date;
	}
	public Date getAnswer_date() {
		return answer_date;
	}
	public void setAnswer_date(Date answer_date) {
		this.answer_date = answer_date;
	}
	
}
