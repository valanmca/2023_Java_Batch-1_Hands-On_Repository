package com.muthu.day10;

class Member1 {
	String Name;
	int age;
	int Phone;
	String address;
	int sal;

	Member1(String Name, int age, int phone, String address, int sal) {
		this.Name = Name;
		this.age = age;
		this.Phone = phone;
		this.address = address;
		this.sal = sal;
	}

	void displaysal() {
		System.out.println("The display sal:" + sal);

	}

	class Employee1 extends Member1 {
		String Specialization;
		String Department;

		Employee1(String Name, int age, int phone, String address, int sal,String Specialization, String Department) {
			super(Name,age,phone,address,sal);
			this.Specialization = Specialization;
			this.Department = Department;
		}

		void display() {
			System.out.println("Name:" + Name);
			System.out.println("age:" + age);
			System.out.println("Phone:" + Phone);
			System.out.println("address:" + address);
			System.out.println("sal:" + sal);
			System.out.println("Specialization:"+Specialization);
			System.out.println("Department:"+Department);

		}
	}

	class Manger extends Member1 {
		private static String address;
		String Specialization;
		String Department;

		Manger(String Name, int age, int phone, String address, int sal,String Specialization, String Department) {
			super(Name, age, phone,address,sal);
			this.Specialization = Specialization;
			this.Department = Department;
		}

		void display1() {
			System.out.println("Name:" + Name);
			System.out.println("age:" + age);
			System.out.println("Phone:" + Phone);
			System.out.println("address:" + address);
			System.out.println("sal:" + sal);
			System.out.println("Specialization:"+Specialization);
			System.out.println("Department:"+Department);

		}
	}

	}
public class ex4 {

	public static void main(String[] args) {
Employee1 obj=new Employee1();
}}
