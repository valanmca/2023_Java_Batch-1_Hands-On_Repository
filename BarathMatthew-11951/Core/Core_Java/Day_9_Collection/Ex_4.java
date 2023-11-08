package Day_9_Collection;
import java.util.LinkedList;
import java.util.Scanner;
class Employee_1{
	int id;
	String name;
	float salary;
	
	Employee_1(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		int my_style =0;
		String new_name="" ;
		for(int j=0;j<name.length();j++) {
			char q =name.charAt(j);
			char t ='_';
			if(my_style==1) {
				int as_chi = q-32;
				q=(char) as_chi;
				my_style=0;
			}
			if(q==t) {
				q=' ';
				my_style=1;
			}
			
			new_name+=q;
			}
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+new_name);
		System.out.println("Employee Salary : "+salary);
		System.out.println("--------------------------------");
	}
	
}

public class Ex_4 {

	public static void main(String[] args) {
		int id =0;
		String name="";
		float salary=0.0f;
		String msg ="";
		LinkedList <Employee_1> list = new LinkedList<Employee_1>();
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter 1.ADD Employee 2.Find Employee 3.Update Employee 4.Delete Employee 5.View All Employee 6.Exit");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter Employee Id,Name,Salary :");
			id = sc.nextInt();
			name = sc.next();
			salary = sc.nextFloat();
			
			Employee_1 emp = new Employee_1(id,name,salary);
			list.add(emp);
			System.out.println("Employee details added .");
			break;
			
		case 2:
			System.out.println("Enter the Employee id to find : ");
			id = sc.nextInt();
			boolean flag = false;
			
			for(Employee_1 e:list) {
				if(e.id == id) {
					flag =true;
					e.display();
					break;
				}
			}
			
			if(flag ==false) {
				System.out.println("Employee NOt Found");
			}
			break;
			
		case 3:
			System.out.println("Enter Employee Id,Name,Salary :");
			id = sc.nextInt();
			name = sc.next();
			salary = sc.nextFloat();
			int index =0;
			Employee_1 temp = new Employee_1(id,name,salary);
			for(Employee_1 e:list) {
				if(e.id == id) {
					flag =true;
					list.set(index, temp);
					System.out.println("Employee Details Updated");
				}
				index++;
			}
			break;
			
		case 4:
			System.out.println("Enter the Employee id to Delete : ");
			id = sc.nextInt();
			boolean flag1 = false;
			int index1 =0;
			for(Employee_1 e:list) {
				if(e.id == id) {
					flag1 =true;
					list.remove(index1);
					System.out.println("Employee details are removed.");
					break;
				}
				index1++;
			}
			
			if(flag1 ==false) {
				System.out.println("Employee NOt Found");
			}
			break;
			
		case 5:
			for(Employee_1 e:list) {
				e.display();
			}
			break;
			
		case 6:
			System.exit(0);
			break;
		}
		System.out.println("Do you want to continue [Yes|No]");
		msg = sc.next();
	}while (msg.equalsIgnoreCase("Yes"));
	}

}
