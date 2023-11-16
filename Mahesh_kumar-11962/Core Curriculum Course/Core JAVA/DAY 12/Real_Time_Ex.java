package com.mahesh.core_java_day_12;

import java.util.LinkedList;
import java.util.Scanner;

class Emp {
	int id;
	String name;
	Float salary;
	boolean flag;

	Emp(int E_id, String E_name, Float E_salary) {
		this.id = E_id;
		this.name = E_name;
		this.salary = E_salary;
	}

	void dis() {

		System.out.println("Employee id : " + id);
		System.out.println("Employee name : " + name);
		System.out.println("Employee salary : " + salary);
		System.out.println("----*----");

	}
}

public class Real_Time_Ex {

	public static void main(String[] args) {
		int id = 0;
		int index;

		String name = "", msg;
		float salary = 0.0f;
		Scanner sc_obj = new Scanner(System.in);

		LinkedList<Emp> lst = new LinkedList<Emp>();

		do {
			System.out.println("\t|----------------|-----------------|-------------------|-------------------|-----------------|-------|");
			System.out.println("\t+ 1.Add Employee + 2.Find Employee + 3.Update Employee + 4.Delete Employee + 5.View Employee +6.exit +");
			System.out.println("\t|----------------|-----------------|-------------------|-------------------|-----------------|-------|");

			System.out.print("\n Enter Ur choice > ");
			int choice = sc_obj.nextInt();

			System.out.println();
			switch (choice) {

			case 1:
				System.out.println("Enter employee id :");
				id = sc_obj.nextInt();
				System.out.println("Enter employee name : ");
				name = sc_obj.next();
				System.out.println("Enter employee salary : ");
				salary = sc_obj.nextFloat();
				Emp employee_object = new Emp(id, name, salary);
				lst.add(employee_object);
				System.out.println("Employee details are added");
				break;

			case 2:
				System.out.println("Enter the employee id to find");
				int f_id = sc_obj.nextInt();
				boolean flag = false;
				for (Emp ob : lst) {
					if (ob.id == f_id) {
						flag = true;
						ob.dis();
						break;
					}

				}
				if (flag == false) {
					System.out.println("Employee not found");
				}
				break;

			case 3:
				index = 0;
				System.out.println("Enter employee id :");
				id = sc_obj.nextInt();
				System.out.println("Enter Updated employee name : ");
				name = sc_obj.next();
				System.out.println("Enter Updated employee salary : ");
				salary = sc_obj.nextFloat();
				Emp temp = new Emp(id, name, salary);
				for (Emp ob : lst) {
					if (ob.id == id) {
						flag = true;
						lst.set(index, temp);
						System.out.println("Employee Details Updated");
						break;
					}
					index++;

				}

				break;
			case 4:

				System.out.println("enter the employee id to delete");
				f_id = sc_obj.nextInt();
				flag = false;
				index = 0;
				for (Emp ob : lst) {
					if (ob.id == f_id) {
						flag = true;
						lst.remove(index);
						System.out.println("Employee Detaile are deleted successfully");
						break;
					}

					index++;
				}
				break;
			case 5:
				if (lst.isEmpty()) {
					System.out.println("Employee list is empty ");
				} else {
					for (Emp e : lst) {
						e.dis();
					}
				}
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Select 1 - 6 options only");
				break;
			}

			System.out.print("\n U want Repeat? [ YES ] or [ NO ] : ");
			msg = sc_obj.next();
		} while (msg.equalsIgnoreCase("yes"));
	}

}
