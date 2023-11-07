package com.emp.bean;

public class Employee {
	
	 private int Id;
	    private String Name;
	    private float Salary;
	    private String Address;
	    private  String Position;
	    public Employee() {
	        super();
	    }
	    public Employee(int id, String name,float salary,String address,String position) {
	        super();
	        Id =id;
	        Name = name;
	        Salary= salary;
	        Address =address;
	        Position=position;
	        
	        
	    }

	    public int getId() {
			return Id;
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
		public float getSalary() {
			return Salary;
		}
		public void setSalary(float salary) {
			Salary = salary;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getPosition() {
			return Position;
		}
		public void setPosition(String position) {
			Position = position;
		}
		public void displayemployee() {
	        System.out.println("*************************************");

	        System.out.println("Employee ID is : " + Id );
	        System.out.println("Employee Name is : " + Name);
	        System.out.println("Employee Salary is : " + Salary);
	        System.out.println("Employee Address is: " + Address);
	        System.out.println("Employee Position is : " + Position);

	        System.out.println("*************************************");
	    }
	}


	

	