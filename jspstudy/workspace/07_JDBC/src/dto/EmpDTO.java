package dto;

import java.sql.Date;

public class EmpDTO {
	private Long num;
	private String name;
	private Date hire;
	
	public EmpDTO() {
		// TODO Auto-generated constructor stub
	}

	public EmpDTO(String name) {
		super();
		this.name = name;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHire() {
		return hire;
	}

	public void setHire(Date hire) {
		this.hire = hire;
	}
	
	
	
	
}
