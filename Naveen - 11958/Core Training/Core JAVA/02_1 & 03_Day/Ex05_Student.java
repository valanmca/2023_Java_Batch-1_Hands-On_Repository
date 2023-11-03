package com.naveen.day2_1;

/*
 * 5. Write a Java program to create a class called "School" with attributes for students, teachers, and classes, 
 * and methods to add and remove students and teachers, and to create classes.

 */

import java.util.LinkedList;
import java.util.Scanner;

class School {

    String student, teacher, classes;
    String rmstudent, rmteacher, rmclasses;
    Scanner sc = new Scanner(System.in);

    LinkedList<String> studentList = new LinkedList<String>();
    LinkedList<String> teacherList = new LinkedList<String>();
    LinkedList<String> classList = new LinkedList<String>();

    public void removeDetails() {
        System.out.println("\nEnter student name to be remove : ");
        rmstudent = sc.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            rmstudent.equals(studentList.get(i));
        }
        studentList.remove(rmstudent);
        System.out.println("Enter teacher name to be remove : ");
        rmteacher = sc.nextLine();
        for (int j = 0; j < teacherList.size(); j++) {
            rmteacher.equals(teacherList.get(j));
        }
        teacherList.remove(rmteacher);
        System.out.print("\nEnter class name to be remove : ");
        rmclasses = sc.nextLine();
        for (int k = 0; k < classList.size(); k++) {
            rmclasses.equals(classList.get(k));
        }
        studentList.remove(rmstudent);
        teacherList.remove(rmteacher);
        classList.remove(rmclasses);

        System.out.print("\n Record was removed Successfully.");
    }

    public void addDetails() {
        System.out.print("\nEnter student name : ");
        student = sc.nextLine();
        studentList.add(student);
        System.out.print("\nEnter Teacher name : ");
        teacher = sc.nextLine();
        teacherList.add(teacher);
        System.out.print("\nEnter classes : ");
        classes = sc.nextLine();
        classList.add(classes);
        System.out.print("\n Record was added Successfully.");
    }

    public void display() {
        System.out.println("\nStudent Name : " + studentList);
        System.out.println("Teacher Name : " + teacherList);
        System.out.println("Class Name : " + classList);
    }
}

public class Ex05_Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s;
        int option;
        School obj = new School();
        do {

            System.out.println("\n 1. Add Student Name, Teacher Name & Class name"
                    + "\n 2. Remove Student Name, Teacher Name & Class Name" + "\n 3. Display");
            System.out.print("\nSelect any one option : ");
            option = sc.nextInt();
            switch (option) {
            case 1:
                obj.addDetails();
                break;
            case 2:
                obj.removeDetails();
                break;
            case 3:
                obj.display();
                break;
            }

            System.out.print("\n Do you want to continue? (Press s or S) : ");
            s = sc.next().charAt(0);
        } while (s == 's' || s == 'S');
    }
}