package com.douzone.guestbook.vo;

public class GuestbookVo {
	private Long no;
	private String namel;
	private String password;
	private String message;
	
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getNamel() {
		return namel;
	}
	public void setNamel(String namel) {
		this.namel = namel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	private String regDate;


	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", namel=" + namel + ", password=" + password + ", message=" + message
				+ ", regDate=" + regDate + "]";
	}
	
	
	

}
