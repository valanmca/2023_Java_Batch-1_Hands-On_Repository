package com.tms.main;

import java.util.List;
import java.util.Scanner;

import com.tms.dao.TeacherDAO;
import com.tms.model.Teacher;

public class TMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {

		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.Find all 6.Exit");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		return choice;
	}

	public static Teacher insertTeacher() {
		System.out.println("Enter Teacher id, Teacher name, Teacher Email,Teacher Qualification,Teacher Location");
		return new Teacher(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next());
	}

	public static int deleteTeacher() {
		System.out.println("Enter Teacher id");
		return sc.nextInt();
	}

	public static Teacher updateTeacher() {
		System.out.println("Enter Teacher id, Teacher name, Teacher Email,Teacher Qualification,Teacher Location");
		return new Teacher(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next());
	}

	public static int findTeacher() {
		System.out.println("Enter Teacher id");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		TeacherDAO dao = new TeacherDAO();
		String msg = "";
		do {
			switch (displayMenu()) {
			case 1:

				if (dao.insertTeacher(insertTeacher()) == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;

			case 2:

				if (dao.deleteTeacher(deleteTeacher()) == 1)
					System.out.println("Record deleted");
				else
					System.out.println("Record Not deleted");
				break;

			case 3:

				if (dao.updateTeacher(updateTeacher()) == 1)
					System.out.println("Record Updated");
				else
					System.out.println("Record Not Updated");
				break;

			case 4:

				int id1 = findTeacher();
				Teacher bean = dao.findTeacher(id1);
				if (bean != null) {
					bean.display();
				} else {
					System.out.println("Record Not found");
				}
				break;

			case 5:

				List<Teacher> list = dao.findAllTeacher();
				for (Teacher e : list) {
					e.display();
				}
				break;
			}
			System.out.println("Do you want to continue [yes/no]:");
			msg = sc.next();
		} while (msg.equals("yes"));

	}

}
