package kr.talenton.web.vo;

public class Member {
	private String id;
	private String name;
	private String email;
	private String password;
	private String image;
	private String address;
	private String phone;
	private String birthday;
	private String self_introduction;
	private String date;
	private String notification_status; // ¿Ü·¡Å°
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSelf_introduction() {
		return self_introduction;
	}
	public void setSelf_introduction(String self_introduction) {
		this.self_introduction = self_introduction;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNotification_status() {
		return notification_status;
	}
	public void setNotification_status(String notification_status) {
		this.notification_status = notification_status;
	}
	
	
}
