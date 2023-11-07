package com.stu.main;
import java.util.List;
import java.util.Scanner;
import com.stu.bean.student;
import com.stu.dao.StudentDAO;
public class STUMainClass {
		static Scanner sc = new Scanner(System.in);
	    public static int displayMenu() {
	        System.out.println(" 1.Student Insert \n 2.Student Delete \n 3.Student Update \n 4.Studnet Find \n 5.Student FindAll \n 6.Exit ");
	        System.out.println("Enter Your Choice : ");
	        return sc.nextInt();
	    }
	    public static student insertStudent() {
	        System.out.println("Enter Studnet ID and Student Name : ");
	        return new student(sc.nextInt(), sc.next());
	    }
            public static int deleteStudent() {
	        System.out.println("Enter the Student ID : ");
	        return sc.nextInt();
	    }
            public static student updateStudent() {
	        System.out.println("Enter the Student ID and Student Name : ");
	        return new student(sc.nextInt(), sc.next());
	    }

	    public static int findStudent() {
	        System.out.println("Enter the Student ID : ");
	        return sc.nextInt();
	    }

	    public static void findAllStudent() {

	    }

	    public static void main(String[] args) {
	    	StudentDAO dao = new StudentDAO();
	        String msg = "";

	        do {

	            switch (displayMenu()) {

	            case 1:
//	                Student stu = insertStduent();
//	                int n = dao.insertStudent(stu);
	                if (dao.insertStudent(insertStudent()) == 1) {
	                    System.out.println("Record Inserted");
	                } else {
	                    System.out.println("Record Not Inserted");
	                }
	                break;

	            case 2:

	                if (dao.deleteStudent(deleteStudent()) == 1) {
	                    System.out.println("Record Deleted");
	                } else {
	                    System.out.println("Record not found");
	                }
	                break;

	            case 3:
	                if (dao.updateStudent(updateStudent()) == 1) {
	                    System.out.println("Record Updated");
	                } else {
	                    System.out.println("Record Not Updated");
	                }
	                break;

	            case 4:
	                int id = findStudent();
	                student bean = dao.findStudent(id);
	                if (bean != null) {
	                    bean.displaystudent();
	                } else {
	                    System.out.println("Record Not Found");
	                }
	                break;
	            case 5:
	                List<student> list = dao.findAllStudent1();
	                for (student e : list)
	                    e.displaystudent();
	                break;

	            case 6:
	                System.exit(0);
	                break;

	            default:
	                System.err.println("Enter Valid Choice !!!");
	                System.exit(0);
	                break;
	            }

	            System.out.println("Do you want to continue [Yes || No ] : ");
	            msg = sc.next();
	        } while (msg.equalsIgnoreCase("Yes"));

	    }

	}
