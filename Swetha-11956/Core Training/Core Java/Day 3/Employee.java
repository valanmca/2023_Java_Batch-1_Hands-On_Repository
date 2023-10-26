//Creating array object
package JavaBasics3;

public class Employee {
	int eid;
	String ename;
	float esalary;
	
	//Constructor
	Employee(int eid,String ename,float esalary){
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	void display() {
		System.out.println("Employee ID : "+ eid);
		System.out.println("Employee name : "+ ename);
		System.out.println("Employee salary : "+ esalary);
		System.out.println("");
	}

	public static void main(String[] args) {

//		Employee emp1=new Employee(101,"Swetha",30000);
//		emp1.display();
//		
//		Employee emp2=new Employee(102,"Arun",40000);
//		emp2.display();
		
		Employee emp1=new Employee(101,"Swetha",30000);
		Employee emp2=new Employee(102,"Arun",40000);
		
		//Creating array object Employee ....Creating array ( int arr[]= new int[5] )
		Employee emp[]=new Employee[2];
		
		emp[0]=emp1; //if these two objects are not assigned to emp[0] and emp[1], it will show null pointer exception,because the array is empty and it has 'null' as default
		emp[1]=emp2;
		
		for(int i=0;i<emp.length;i++) {
			emp[i].display();
		}
	}

}
