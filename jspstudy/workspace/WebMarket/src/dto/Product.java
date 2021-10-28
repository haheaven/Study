package dto;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long  serialVersionUID = -4274700572038677000L;
	
	private String product;		  // 상품아이디 
	private String pname;  		  // 상품명 
	private Integer unitPrice;    // 상품가격 
	private String description;   // 상품설명 
	private String manufacture;   // 제조사 
	private String category;      // 분류 
	private long unitsInStock;    // 재고 
	private String condition;     // 신상품 중고 재생품 
	
	public Product() {
		super();
	}
	public Product(String product, String pname, Integer unitPrice) {
		this.product = product;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
} 
