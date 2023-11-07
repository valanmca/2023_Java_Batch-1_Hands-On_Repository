package com.sms.bean;

public class Student {
		private int id;
		private String name;
		private int depart;
		
		public Student() {
			super();
		}
		public Student(int id, String name, int depart) {
			super();
			this.id = id;
			this.name = name;
			this.depart = depart;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDepart() {
			return depart;
		}
		public void setDepart(int depart) {
			this.depart = depart;
		}
		public void display() {
			System.out.println("Student Id : " + id);
			System.out.println("Student Name : " + name);
			System.out.println("Student Dept : " + depart);
			System.out.println("-------------------------------");
		}


	}


