package com.msms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_msms")
public class Mobile {
    
	@Id
	@Column(name="mobId")
	private int mobId;
	
	@Column(name="brandName")
	private String brandName;
	
	@Column(name="modelName")
	private String modelName;
	
	@Column(name="mobPrice")
	private int mobPrice;
	
	public Mobile() {
		
	}
	public Mobile(int mobId,String brandName,String modelName,int mobPrice) {
		super();
		this.mobId = mobId;
		this.brandName = brandName;
		this.modelName = modelName;
		this.mobPrice = mobPrice;
		
	}
	
	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMobPrice() {
		return mobPrice;
	}

	public void setMobPrice(int mobprice) {
		this.mobPrice = mobprice;
	}
	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", brandName=" + brandName + ", modelName=" + modelName + ", mobPrice="
				+ mobPrice + "]";
	}
	
	


}
