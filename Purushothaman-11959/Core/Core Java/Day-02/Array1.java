package com.purushoth.day_02;

public class Array1 {

	int emp_Id;
    String emp_Name;
    float emp_Salary;
    
Array1 (int emp_Id,String emp_Name,float emp_Salary){
	this.emp_Id=emp_Id;
	this.emp_Name=emp_Name;
	this.emp_Salary=emp_Salary;
}

void display() {
	System.out.println("Id of the employee:"+emp_Id);
	System.out.println("Name of the employee:"+emp_Name);
	System.out.println("Salary of the employee:"+emp_Salary);
	System.out.println(" ");
}
	
	
	public static void main(String[] args) {
		Array1 Dom=new Array1(102,"Domnic",32000.0f);
		Array1 Shiva=new Array1(103,"Shiva",30000.0f);
		
		
		
		Array1 emp[]=new Array1[2];
		emp[0]=Dom;
		emp[1]=Shiva;
		
		for(int i=0;i<emp.length;i++) {
			emp[i].display();
		}

	}

}// Create array for object.
