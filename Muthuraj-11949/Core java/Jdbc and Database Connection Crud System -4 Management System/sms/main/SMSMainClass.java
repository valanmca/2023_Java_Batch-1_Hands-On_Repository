package com.sms.main;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.sms.bean.employee1;
import com.sms.dao.EmployeeDAO;

public class SMSMainClass {

	static Scanner sc = new Scanner(System.in);
	private static int empid;

	public static int displayMenu() {

		System.out.println("1.Insert 2.Delete 3. Update 4.Find 5.Find ALL 6.Exit");

		System.out.println("Enter your Choice:");
		// int choice =sc.nextInt();

		return sc.nextInt();

	}
	public static employee1 insertEmployee() {
		System.out.println("Enter employee empid,empname,empSalary");
		return new employee1(sc.nextInt(), sc.next(), sc.nextFloat());

	}
	public static int deleteEmployee() {
		System.out.println("Enter the employtee empid to Delete:");
		return sc.nextInt();
	}

	public static employee1 updateEmployee() {
		System.out.println("Enter employee empid,empname,empSalary");
		return new employee1 (sc.nextInt(), sc.next(), sc.nextFloat());


	}
	public static employee1 FindEmployee() {
		System.out.println("Enter employee empid,empname,empSalary");
		return new employee1 (sc.nextInt(), sc.next(), sc.nextFloat());
	}
	public static employee1 FindAllEmployee() {
		System.out.println("Enter employee empid,empname,empSalary");
		return new employee1 (sc.nextInt(), sc.next(), sc.nextFloat());
	}
	public static <Employee> void main(String[] args ) {
		  EmployeeDAO dao = new EmployeeDAO();

		String msg = "";
		do {
			switch (displayMenu()) {
			///Insert
			case 1:
				//Employee emp=insertEmployee();
				int n1=dao.insertEmployee(  msg, null);
				if (n1== 1) 
					System.out.println("Record Inserted");
				else
					System.out.println("not recorded");
				break;
				//Delete
			    case 2:
				int empid =deleteEmployee();
				int n2=dao.deleteEmployee(empid);
                if(n2==1)
	            System.out.println("Record inserted");
                else
	            System.out.println("Record not Deleted");
			    break;
			    //Update
			case 3:
			   employee1 emp= updateEmployee();
			   int n3=dao.updateEmployee(emp);
			   if(n3==1)
				   System.out.println("Record Updated");
			   else
				   System.out.println("Record Not Updated"); 
			   break;
			   //Findemployee
     	      case 4:   
     	    	  int id1=findEmployee();
     	    	  employee1 bean=dao.FindEmployee(id1);
    			   if(bean !=null) {
    				   bean.display();
    			   }
    	       else
    		 System.out.println("Record not found"); 
    			   break;
    			   //FindAllemployee
     	      case 5:
     	    	  List<employee1> list=dao.findAllEmployee();
     	    	  for(employee1 e:list);
     	    	  break; 
			}
			System.out.println("Do you Want [yes | no]");
			msg = sc.next();
		}while(msg.equals("yes"));
	}
	private static int findEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}
}