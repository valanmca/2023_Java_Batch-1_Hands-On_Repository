package com.vms.bean;
import java.lang.annotation.Native;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="car")
public class Car {
	 @Id
	    @Column(name ="carNo")
	    private String carNo ;      
	    
	    @Column(name ="Manufacturer")
	    private String Manufacturer;
	    
	    @Column(name ="Model")
	    private String Model;
	    
	    @Column(name ="KmsRan")
	    private int KmsRan;
	    
	    @Column(name ="PriceExpected")
	    private int PriceExpected;
	    
	    @Column(name ="NoOfOwners")
	    private int NoOfOwners;

		public String getCarNo() {
			return carNo;
		}

		public void setCarNo(String carNo) {
			this.carNo = carNo;
		}

		public String getManufacturer() {
			return Manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			Manufacturer = manufacturer;
		}

		public String getModel() {
			return Model;
		}

		public void setModel(String model) {
			Model = model;
		}

		public int getKmsRan() {
			return KmsRan;
		}

		public void setKmsRan(int kmsRan) {
			KmsRan = kmsRan;
		}

		public int getPriceExpected() {
			return PriceExpected;
		}

		public void setPriceExpected(int priceExpected) {
			PriceExpected = priceExpected;
		}

		public int getNoOfOwners() {
			return NoOfOwners;
		}

		public void setNoOfOwners(int noOfOwners) {
			NoOfOwners = noOfOwners;
		}

		public Car(String carNo, String manufacturer, String model, int kmsRan, int priceExpected, int noOfOwners) {
			super();
			this.carNo = carNo;
			Manufacturer = manufacturer;
			Model = model;
			KmsRan = kmsRan;
			PriceExpected = priceExpected;
			NoOfOwners = noOfOwners;
		}

		@Override
		public String toString() {
			return "Car [carNo=" + carNo + ", Manufacturer=" + Manufacturer + ", Model=" + Model + ", KmsRan=" + KmsRan
					+ ", PriceExpected=" + PriceExpected + ", NoOfOwners=" + NoOfOwners + "]";
		}
	    
	    
	    }
