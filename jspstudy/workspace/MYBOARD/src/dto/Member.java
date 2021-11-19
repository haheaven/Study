package dto;

import java.sql.Date;

public class Member {
	private Long mNo;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String ip;
	private String birth;
	private String gender;
	private Date register;
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}


	public Long getmNo() {
		return mNo;
	}


	public void setmNo(Long mNo) {
		this.mNo = mNo;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
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


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getRegister() {
		return register;
	}


	public void setRegister(Date register) {
		this.register = register;
	}


	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", ip=" + ip
				+ ", birth=" + birth + ", gender=" + gender + ", register=" + register + "]";
	}
	
	
	
	
}
