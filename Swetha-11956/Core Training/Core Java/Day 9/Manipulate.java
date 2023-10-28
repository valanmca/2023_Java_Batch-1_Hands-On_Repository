package JavaCollect9;
import java.util.Scanner;
import java.util.LinkedList;

class Employee{ 
	int id;
    String name;
    float salary;

  Employee(int id,String name,float salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
  }
  void display() {
		System.out.println("Employee id : "+ id);
		System.out.println("Employee name : "+ name);
		System.out.println("Employee salary : "+ salary);
		System.out.println("------------------------");
	}
}
public class Manipulate {

	public static void main(String[] args) {

		int id=0;
		String name="";
		float salary=0.0f;
		boolean flag=false;
		
		//to store employee object into the collection
		LinkedList<Employee>list=new LinkedList<Employee>();
		
		Scanner sc=new Scanner(System.in);
		String msg="";
		do {
		
		System.out.println("1.Add Employee 2.Find Employee 3.Update Employee 4.Delete Employee 5.View all Employee 6.Exit");
		System.out.println("Enter your choice");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter employee id, name, salary");
			id=sc.nextInt();
			name=sc.next();
			salary=sc.nextFloat();
			
			Employee emp=new Employee(id,name,salary);
			list.add(emp);
			System.out.println("Employee deatilas are added");
			break;
			
		case 2:
			System.out.println("Enter employee Id to find");
			id=sc.nextInt();
			
			//Iterate the collection to find the emp id from list
			
			for(Employee e:list) {
				if(e.id == id) {
					flag=true;
					e.display();
					break;
				}
			}
			if(flag == false) {
				System.out.println("Employee not found");
			}
			break;
			
		case 3:
			System.out.println("Enter employee id, name, salary to update");
			id=sc.nextInt();
			name=sc.next();
			salary=sc.nextFloat();
			
			Employee temp=new Employee(id,name,salary); //getting the details and storing it in temp obj.
			
			int index=0;
			
			for(Employee e: list) {
				if(e.id==id) { //update only if the id is present
					flag=true;
					list.set(index, temp); //update through index
					System.out.println("Employee details updated");
					break;
				}
				index++;
			}
			break;
			
		case 4:
			System.out.println("Enter the employee ID to delete");
			id=sc.nextInt();
			
			int index1=0; // remove only through index value , so variable index is declared to count the index.
			for(Employee e:list) {
				if(e.id == id) {
					flag=true;
					list.remove(index1);  // Remove with index
					System.out.println("Employee details removed");
					break;
				}
				index1++;
			}
			if(flag == false) {
				System.out.println("Employee not found");
			}
			
			break;
			
		case 5:
			for(Employee e: list) {
				e.display();
			}
			break;
		case 6:
			System.exit(0);
			break;
			
		}
		System.out.println("Do you want to continue [Yes | No ]");
		msg= sc.next();
	}
	while(msg.equalsIgnoreCase("Yes"));

}
}
