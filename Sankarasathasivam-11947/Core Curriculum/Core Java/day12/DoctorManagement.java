package com.shiva.core.day12;

import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Doctor {
	int doc_id;
	String name;
	String specialization;

	Doctor(int doc_id, String name, String specialization) {
		this.doc_id = doc_id;
		this.name = name;
		this.specialization = specialization;
	}

	void display() {
		System.out.println();
		System.out.println("Doctor Id : " + doc_id);
		System.out.println("Doctor Name : " + name);
		System.out.println("Doctor Specialization : " + specialization);
		System.out.println();
	}
}

public class DoctorManagement {

	public static void main(String[] args) {

		int doc_id = 0;
		String name = "";
		String specialization = "";
		String msg = "";

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		TreeMap<Integer, Doctor> map = new TreeMap<Integer, Doctor>();
		do {
			System.out.println("1. Add Doctor \n2. Update Doctor \n3. Find Doctor \n4. Delete Doctor");
			System.out.println();
			System.out.println("Enter your Choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the Doctor Id :");
				doc_id = sc.nextInt();
				System.out.println("Enter the Doctor Name : ");
				name = sc.next();
				System.out.println("Enter the Specialization : ");
				specialization = sc.next();

				Doctor doc = new Doctor(doc_id, name, specialization);
				map.put(doc_id, doc);
				System.out.println("Added Successfully");
				doc.display();
			}
		} while (msg.equalsIgnoreCase("yes"));
	}

}
