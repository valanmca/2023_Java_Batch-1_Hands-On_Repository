package com.shiva.core.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Staff {
	int id;
	String name;
	String subject;

	Staff(int id, String name, String subject) {
		this.id = id;
		this.name = name;
		this.subject = subject;

	}

	void display() {
		System.out.println("StaffId = " + id);
		System.out.println("Staff Name = " + name);
		System.out.println("Subject Incharge = " + subject);
	}

}

public class StaffManagement {

	public static void main(String[] args) throws IOException {

		int id = 0;
		String name = " ";
		String subject = " ";
		String msg = "";

		Scanner sc = new Scanner(System.in);

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		TreeMap<Integer, Staff> map = new TreeMap<Integer, Staff>();

		do {

			System.out.println(
					"1.Add Staff \n2.Find Staff \n3.Update Staff \n4.Delete Staff \n5.view All Staffs \n6.exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Staff Id = ");
				id = sc.nextInt();
				System.out.println("Enter Staff Name = ");
				name = input.readLine();
				System.out.println("Enter Subject taken by Staff = ");
				subject = input.readLine();
				Staff obj = new Staff(id, name, subject);

				map.put(id, obj);
				System.out.println("Staff details added ");
				break;

			case 2:

				System.out.println("Enter Staff id ");
				id = sc.nextInt();
				Set<Integer> set = map.keySet();
				Iterator<Integer> it = set.iterator();
				while (it.hasNext()) {
					int key = it.next();

					if (key == id) {

						Staff dr = map.get(key);

						System.out.println("key = " + key);
						dr.display();
						System.out.println("-----------");

					} else {
						System.out.println("Staff Id not found");
					}

				}
				break;

			case 3:
				System.out.println("Enter Staff Id = ");
				id = sc.nextInt();
				System.out.println("Enter Staff Name = ");
				name = input.readLine();
				System.out.println("Enter Subject taken by Staff = ");
				subject = input.readLine();

				Staff temp = new Staff(id, name, subject);
				map.put(id, temp);

				System.out.println("Details updated");
				break;

			case 4:

				System.out.println("Enter Staff id ");
				id = sc.nextInt();
				Set<Integer> set2 = map.keySet();
				Iterator<Integer> it2 = set2.iterator();

				while (it2.hasNext()) {
					int key = it2.next();

					if (key == id) {
						map.remove(key);
						System.out.println(" Details deleted");

					} else {
						System.out.println("Staff details deleted");
					}

				}
				break;

			case 5:

				Set<Integer> set1 = map.keySet();
				Iterator<Integer> it1 = set1.iterator();

				while (it1.hasNext()) {
					int key = it1.next();
					Staff dr = map.get(key);

					System.out.println("key = " + key);
					dr.display();

					System.out.println("-----------");
				}
				break;

			case 6:

				System.exit(0);
				break;
			}

			System.out.println("do you want to continue [yes]||[No]");
			msg = input.readLine();
		} while (msg.equalsIgnoreCase("yes"));

	}

}
