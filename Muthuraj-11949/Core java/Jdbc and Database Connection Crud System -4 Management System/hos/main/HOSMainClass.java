package com.hos.main;
import java.util.List;
import java.util.Scanner;
import com.hos.bean.hospital;
import com.hos.dao.HospitalDAO;
public class HOSMainClass{
		static Scanner sc = new Scanner(System.in);
	    public static int displayMenu() {
	        System.out.println(" 1.Patient Insert \n 2.Patient Delete \n 3.Patient Update \n 4.Patient Find \n 5.Patient FindAll \n 6.Exit ");
	        System.out.println("Enter Your Choice : ");
	        return sc.nextInt();
	    }
	    public static hospital insertosptial() {
	        System.out.println("Enter Patient ID and Patient Name and Patinet Address: ");
	        return new hospital(sc.nextInt(), sc.next(),sc.next());
	    }
	    public static int deletepatient() {
	        System.out.println("Enter the Student ID : ");
	        return sc.nextInt();
	    }
	    public static hospital updatepatient() {
	        System.out.println("Enter the Patient ID and Patient Name and Patient Address : ");
	        return new hospital(sc.nextInt(), sc.next(),sc.next());
	    }
	    public static int findpatient() {
	        System.out.println("Enter the Patient ID : ");
	        return sc.nextInt();
	    }
	    public static void findAllpatient() {
	    }

	    public static void main(String[] args) {
	    	HospitalDAO dao = new HospitalDAO();
	        String msg = "";

	        do {

	            switch (displayMenu()) {

	            case 1:
//	                Student stu = insertStduent();
//	                int n = dao.insertStudent(stu);
	                if (dao.inserthospital(insertHospital()) == 1) {
	                    System.out.println("Record Inserted");
	                } else {
	                    System.out.println("Record Not Inserted");
	                }
	                break;

	            case 2:

	                if (dao.deletehospital(deletepatient()) == 1) {
	                    System.out.println("Record Deleted");
	                } else {
	                    System.out.println("Record not found");
	                }
	                break;

	            case 3:
	                if (dao.updatehospital(updatepatient()) == 1) {
	                    System.out.println("Record Updated");
	                } else {
	                    System.out.println("Record Not Updated");
	                }
	                break;

	            case 4:

	                int id = findpatient();
	               hospital bean = dao.findpatient(id);
	                if (bean != null) {
	                    bean.displayhospital();
	                } else {
	                    System.out.println("Record Not Found");
	                }
	                break;

	            case 5:
	                List<hospital> list = dao.findAllpatient();
	                for (hospital e : list)
	                    e.displayhospital();
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
		private static hospital insertHospital() {
			// TODO Auto-generated method stub
			return null;
		}}