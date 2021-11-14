package dto;

import java.sql.Date;

public class aStudent {
	private long stuNo;
	private String name;
	private int grade;
	private String addr;
	private String email;
	private String score;
	private String major;
	private Date register;
	
	public aStudent() {
		// TODO Auto-generated constructor stub
	}
	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public long getStuNo() {
		return stuNo;
	}

	public void setStuNo(long stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Date getRegister() {
		return register;
	}

	public void setRegister(Date register) {
		this.register = register;
	}
	
	
	
	
}
