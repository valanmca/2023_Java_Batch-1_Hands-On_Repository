package com.jeyavel.coreDay1;

class employee{
	int eid;
	String name;
	float salary;

	employee(int eid,String name,float salary){
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("Hi"+name);
	    System.out.println("Employee Id "+eid);
	    System.out.println("Salary "+salary);
	}
}

public class CoreEx {
	public static void main(String [] args) {
		employee obj = new employee(101," jeyavel",200000.0f);
		//obj.display();
		
		employee obj2 = new employee(101," jeyavel",200000.0f);
		//obj.display();
		
		
		//Array Example
		employee emp[] = new employee[2];  //array of objects // int arr[] = new int[2]
		emp[0]= obj;
		emp[1]= obj2;
		
		for(int i=0;i<emp.length;i++) {
			emp[i].display();
		}
	}

}
