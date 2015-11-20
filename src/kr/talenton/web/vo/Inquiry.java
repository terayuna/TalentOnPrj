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
	
}
