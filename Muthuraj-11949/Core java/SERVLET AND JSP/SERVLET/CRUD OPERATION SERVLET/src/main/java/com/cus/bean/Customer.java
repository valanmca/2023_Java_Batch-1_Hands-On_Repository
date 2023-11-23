package com.cus.bean;

public class Customer {

		 private int Id;
		    private String Name;
		    private String Email;
		    private int ConNmuber;
		    private  String Location;
		    public Customer() {
		        super();
		    }
		    public Customer(int id, String name,String email,int connumber,String location) {
		        super();
		        Id =id;
		        Name = name;
		        Email  = email;
		        ConNmuber  =connumber;
		        Location=location;
		        
		        
		    }

		    public Customer(int nextInt, String next) {
				// TODO Auto-generated constructor stub
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
			public String getEmail() {
				return Email;
			}
			public void setEmail(String email) {
				Email= email;
			}
			public int getConNmuber() {
				return ConNmuber;
			}
			public void setConNumber(int connumber ) {
				ConNmuber =connumber ;
			}
			public String getLocation() {
				return Location;
			}
			public void setLocation(String location) {
				Location = location;
			}
			public void displaycustomer() {
		        System.out.println("*************************************");

		        System.out.println("Customer ID is : " + Id );
		        System.out.println("Customer Name is : " + Name);
		        System.out.println("Customer Email is : " + Email);
		        System.out.println("Customer ConNumber is: " + ConNmuber);
		        System.out.println("Customer Location is : " +Location );

		        System.out.println("*************************************");
		    }
		}
