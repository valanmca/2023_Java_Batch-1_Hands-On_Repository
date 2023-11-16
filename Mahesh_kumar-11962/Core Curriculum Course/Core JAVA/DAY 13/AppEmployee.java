package com.mahesh.core_java_day_13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {
	int id;
	String name, role;
	float salary;
	boolean flag;

	Employee(int E_id, String E_name, String E_role, float E_salary) {
		this.id = E_id;
		this.name = E_name;
		this.role = E_role;
		this.salary = E_salary;
	}

	void print() {
		System.out.println("\n\t----*----");
		System.out.println("Employee id : " + id);
		System.out.println("Employee name : " + name);
		System.out.println("Employee role : " + role);
		System.out.println("Employee salary : " + salary);
		System.out.println("\n\t----*----");

	}
}

public class AppEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> lst = new LinkedList<String>();
		String input = "";
		TreeMap<Integer, Employee> tree = new TreeMap<Integer, Employee>();
		do {

			System.out.println(
					"\t|----------------|-----------------|-------------------|-------------------|-----------------|-------|");
			System.out.println(
					"\t+ 1.Add Employee + 2.View All Employee + 3.Update Employee + 4.Delete Employee + 5.Search Employee +6.exit +");
			System.out.println(
					"\t|----------------|-----------------|-------------------|-------------------|-----------------|-------|");

			System.out.print("\n Enter Ur choice > ");
			int choice = sc.nextInt();
			int key, id = 0;
			String name = "", role = "";
			float salary = 0.0f;

			switch (choice)

			{
			case 01:

				System.out.println("Enter employee id :");
				id = sc.nextInt();

				System.out.println("Enter employee name : ");
				name = sc.next();
				System.out.println("Enter employee role : ");
				role = sc.next();
				System.out.println("Enter employee salary : ");
				salary = sc.nextFloat();

				Employee object = new Employee(id, name, role, salary);

				tree.put(id, object);
				System.out.println("Employee details are added");
				break;

			case 2:
				for (Map.Entry<Integer, Employee> entry : tree.entrySet()) {
					key = entry.getKey();
					Employee e = entry.getValue();
					e.print();
				}
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Enter the Employee id to find");
				int f_id = sc.nextInt();

				Set<Integer> set = tree.keySet();
				Iterator<Integer> it = set.iterator();
				while (it.hasNext()) {
					key = it.next();
					Employee t1 = tree.get(key);
					t1.print();
					System.out.println();
				}
				break;
			}
			System.out.println("U want repeat again?[press yes] : ");
			input = sc.next();

		} while (input.equalsIgnoreCase("yes"));
	}

}
