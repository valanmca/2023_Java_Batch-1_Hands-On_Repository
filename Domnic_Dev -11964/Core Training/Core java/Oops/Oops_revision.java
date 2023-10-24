package Core_Topic_Domnic_Day_1;
//import java.util.Scanner;

class Employee{
  String ename;
  int empid;
  float esal;
  
  Employee(String ename,int empid,float esal){
	  this.ename=ename;
	  this.empid=empid;
	  this.esal=esal;
  }
  void display() {
	  System.out.println("Name of the employee is "+ename);
	  System.out.println("Emp Id of the employee is "+empid);
	  System.out.println("Salary of the employee is "+esal);
  }
  
}

public class Oops_revision {
   
	public static void main(String[] args) {
	//	Scanner sc = new Scanner (System.in);
		Employee obj1=new Employee("Domnic",11964,3200.0f);
		Employee obj2=new Employee("Mahesh",11962,2200.0f);
		obj1.display();
		System.out.println();
		obj2.display();

	}

}
