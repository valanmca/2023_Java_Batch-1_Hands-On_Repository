package com.ems.main;

import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

public class EMSMainClass {
	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println("1.Insert" + " 2.Update" + " 3.Delete" + " 4.Find" + " 5.View All" + " 6.Terminate");
		System.out.print("\n Select your choice : "); 
		return sc.nextInt();
	}

	public static Employee insert() {
		System.out.println("Enter employee id,name,dept,salary : ");
		return new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
	}
	public static Employee update() {
		System.out.println("Enter employee id,name,dept,salary for update : ");
		return new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextFloat());
	}
	public static int delete() {
		System.out.println("Enter employee id for delete : ");
		return sc.nextInt();
	}
	public static int find() {
		System.out.println("Enter employee id for find : ");
		return sc.nextInt();
	}

	public static void main(String[] args)  {
		EmployeeDAO daoObj = new EmployeeDAO() ;
		char msg;
		do {
			switch(displayMenu()) {
			case 1://insert
				if(daoObj.insert(insert())==1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;
			case 2://update
				if(daoObj.update(update())==1)
					System.out.println("Record Updated");
				else
					System.out.println("Record not updated");
				break;
			case 3://delete
				if(daoObj.delete(delete())==1)
					System.out.println("Record deleted");
				else
					System.out.println("Record not deleted");
				break;
			case 4://find
				int id = find();
				Employee emp = daoObj.find(id);				
				if(emp==null)
					System.out.println("Record not Found");
				else
					System.out.println("Record found");
				break;
			case 5://viewall
				List <Employee> list = daoObj.view();
				for(Employee e:list)
					e.display();
				break;
			case 6://exit
				System.out.println("\n*****Program Terminated*****");
				System.exit(0);
				break;
			
			}
			System.out.println("Do you want to continue? [s|n] : ");
			msg = sc.next().charAt(0);
		}while(msg=='s' || msg=='S');
	}

}
