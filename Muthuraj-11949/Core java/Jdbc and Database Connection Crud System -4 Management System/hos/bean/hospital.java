package com.hos.bean;

public class hospital {

	 private int Id;
	    private String Name;
	    private String Address;

	    public hospital() {
	        super();
	    }
	    public hospital(int id, String name, String address) {
	        super();
	        Id = id;
	        Name = name;
	        Address =address;
	    }
	    public int getId() {
	        return Id;
	    }
	    public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public void setId(int id) {
	        Id = id;
	    }
	    public String getName() {
	        return Name;
	    }
	    public void setName(String name) {
	        Name = name;
	    }
	    public void displayhospital() {
	        System.out.println("hospital ID is : " + Id);
	        System.out.println("hospital Name is : " + Name);
	        System.out.println("hospital Address is : +Address");
	        System.out.println("*************************************");
	    }
	}
