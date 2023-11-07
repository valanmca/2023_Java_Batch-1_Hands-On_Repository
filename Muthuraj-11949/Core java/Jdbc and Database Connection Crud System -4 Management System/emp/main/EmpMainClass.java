package com.emp.main;
import java.util.List;
import java.util.Scanner;
import com.emp.bean.Employee;
import com.emp.dao.EmployeeDAO;
public class EmpMainClass{
	static Scanner sc = new Scanner(System.in);
    public static int displayMenu() {
        System.out.println(" 1.Employee Insert \n 2.Employee Delete \n 3.Employee Update \n 4.Employee Find \n 5.Employee FindAll \n 6.Exit ");
        System.out.println("Enter Your Choice : ");
        return sc.nextInt();
    }
    public static Employee insertEmployee() {
        System.out.println("Enter Employee Details ID,NAME,Salary,Address,Position : ");
        return new Employee(sc.nextInt(), sc.next(), sc.nextFloat(),sc.next(), sc.next());
    }
        public static int deleteEmployee() {
        System.out.println("Enter the Employee ID : ");
        return sc.nextInt();
    }
        public static Employee updateEmployee() {
        System.out.println("Enter the Employee ID,NAME,Salary,Address,Position : ");
        return new Employee(sc.nextInt(), sc.next(),sc.nextFloat(), sc.next(),sc.next());
    }
    public static int findEmployee() {
        System.out.println("Enter the Employee ID : ");
        return sc.nextInt();
    }
    public static void findAllStudent() {	
    }
    public static void main(String[] args) {
    	EmployeeDAO dao = new EmployeeDAO();
        String msg = "";
        do {
        	switch (displayMenu()) {

            case 1:
//                Student stu = insertStduent();
//                int n = dao.insertStudent(stu);
                if (dao.insertEmployee(insertEmployee()) == 1) {
                    System.out.println("Record Inserted");
                } else {
                    System.out.println("Record Not Inserted");
                }
                break;

            case 2:

                if (dao.deleteEmployee(deleteEmployee()) == 1) {
                    System.out.println("Record Deleted");
                } else {
                    System.out.println("Record not found");
                }
                break;

            case 3:
                if (dao.updateEmployee(updateEmployee()) == 1) {
                    System.out.println("Record Updated");
                } else {
                    System.out.println("Record Not Updated");
                }
                break;

            case 4:
                int id = findEmployee();
                Employee bean = dao.findEmployee(id);
                if (bean != null) {
                    bean.displayemployee();
                } else {
                    System.out.println("Record Not Found");
                }
                break;
            case 5:
                List<Employee> list = dao.findAllEmployee();
                for (Employee e : list)
                    e.displayemployee();
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