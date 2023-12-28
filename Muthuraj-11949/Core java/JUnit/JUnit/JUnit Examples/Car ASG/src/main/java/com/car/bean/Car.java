package com.car.bean;

public class Car {
    private String  no;
    private String man;
    private String  mod;
    private int  kms;
    private int  price;
    private int noOfOwn;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String no, String man, String mod, int kms, int price, int noOfOwn) {
		super();
		this.no = no;
		this.man = man;
		this.mod = mod;
		this.kms = kms;
		this.price = price;
		this.noOfOwn = noOfOwn;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMan() {
		return man;
	}
	public void setMan(String man) {
		this.man = man;
	}
	public String getMod() {
		return mod;
	}
	public void setMod(String mod) {
		this.mod = mod;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfOwn() {
		return noOfOwn;
	}
	public void setNoOfOwn(int noOfOwn) {
		this.noOfOwn = noOfOwn;
	}
	@Override
	public String toString() {
		return "Car [no=" + no + ", man=" + man + ", mod=" + mod + ", kms=" + kms + ", price=" + price + ", noOfOwn="
				+ noOfOwn + "]";
	}

}


