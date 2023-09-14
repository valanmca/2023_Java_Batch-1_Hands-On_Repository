package com.swetha.day8;
class Employee{
	int eId;                  //Instance variables
	String eName;
	float eSalary;

    //Constructor
   Employee(int eId,String eName,float eSalary){
	   this.eId=eId;            //left side: Instance var,  right side:loCAL VARIABLE
	   this.eName=eName;
	   this.eSalary=eSalary;   //  'this' key used to avoid the name conflict...instance and local variables name are same.
		
   }
   //Method
   void display()           //Instance method
   {
	   System.out.println("Employee Id :"+eId);
	   System.out.println("Employee name :"+eName);
	   System.out.println("Employee salary :"+eSalary);
   }
}
public class ClassAndObject {

	public static void main(String[] args) {
		
		//Object creation and calling the constructor
		
		Employee valan=new Employee(101,"Valan",200.0f);
		//Method Calling
		valan.display();
		
		Employee swetha=new Employee(12,"Arun",2000.0f);
		swetha.display();

	}

}

