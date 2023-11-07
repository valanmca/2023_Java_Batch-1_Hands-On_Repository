package com.stu.bean;

public class student {
		 private int Id;
		    private String Name;

		    public student() {
		        super();
		    }
		    public student(int id, String name) {
		        super();
		        Id = id;
		        Name = name;
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
		    public void displaystudent() {
		        System.out.println("Student ID is : " + Id);
		        System.out.println("Student Name is : " + Name);
		        System.out.println("*************************************");
		    }
		}
