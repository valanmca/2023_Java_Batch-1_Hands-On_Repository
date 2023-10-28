//Collections for the sortedset
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

class Employee {
	int Id;
	String Name;
	float Salary;

	Employee(int Id, String Name, float Salary) {
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
	}

	void display() {
		System.out.println(" Employee Id is : " + Id);
		System.out.println(" Employee Name is : " + Name);
		System.out.println(" Employee Salary is : " + Salary);
		System.out.println(" -------------------------- ");
	}
}

public class Collections_Example5 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		int Id = 0;
		String Name = "";
		float Salary = 0.0f;
		boolean flag = false;
		int index = 0;
		LinkedList<Employee> list = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		String msg = "";
		do {
			System.out.println(
					" 1.Add Employee \n 2.Find Employee \n 3.Update Employee \n 4.Delete Employee \n 5.View All Employee \n 6.Exist");
			System.out.println(" Enter Your Choice : ");
			int Choice = sc.nextInt();
			switch (Choice) {
			case 1:
				System.out.println(" Enter employee Id,Name,and,Salary");
				Id = sc.nextInt();
				Name = sc.next();
				Salary = sc.nextFloat();
				Employee emp = new Employee(Id, Name, Salary);
				list.add(emp);
				System.out.println(" Employee details are added ");
				break;
			case 2:
				System.out.println(" Enter the Employee Id to find ");
				Id = sc.nextInt();
				flag = false;
				for (Employee e : list) {
					if (e.Id == Id) {
						flag = true;
						e.display();
						break;
					}
				}
				if (flag == false)
					System.out.println(" Employee Not Found ");
				break;
			case 3:
				System.out.println(" Enter the Employee Id,Name,and,Salary to Update");
				Id = sc.nextInt();
				Name = sc.next();
				Salary = sc.nextFloat();
				Employee temp = new Employee(Id, Name, Salary);
				index = 0;
				flag = false;
				for (Employee e : list) {
					if (e.Id == Id) {
						flag = true;
						list.set(index, temp);
						System.out.println(" Employee Detials are Updated ");
						break;
					}
				}
				if (flag == false)
					System.out.println(" Employee Not Found ");
				break;
			case 4:
				System.out.println(" Enter the Employee to delete ");
				Id = sc.nextInt();
				flag = false;
				index = 0;
				for (Employee e : list) {
					if (e.Id == Id) {
						flag = true;
						// Remove
						list.remove(index);
						System.out.println(" Employee details are Removed for the given Id ");
						break;
					}
					index++;
				}
				if (flag == false)
					System.out.println(" Employee Not Found ");
				break;
			case 5:
				for (Employee e : list) {
					e.display();
				}
				break;
			case 6:
				System.exit(0);
				break;
			}
			System.out.println(" Do you want to continue [Yes | No] ");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("yes"));

	}

}