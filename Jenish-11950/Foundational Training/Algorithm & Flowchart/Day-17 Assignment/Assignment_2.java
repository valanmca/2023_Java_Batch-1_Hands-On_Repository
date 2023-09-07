package com.jenish.assignment;

class Employee {
	private int eid;
	private String firstName;
	private String lastName;
	private int Salary;
	public int hikePercent;
	public Employee(int eid,String fristName,String lastName,int Salary) {
		super();
		this.eid = eid;
		this.firstName= firstName;
		this.lastName=lastName;
		this.Salary= Salary;
	}

	public int getEid() {
		return eid;
		}
	public String getFirstName() {
		return firstName;
		}
	public String getLastName() {
		return lastName;
		}
	/*public String getName() {
		return firstName+""+lastName;
		}*/
	public int getSalary() {
		return Salary=1000;
		}
	public void setSalary(int salary) {
		this.Salary = Salary;
		}
	public int getAnnualSalary() {
		return Salary;
		}
	public int hikeSalary(int percent) {
		double increaseAmount=(Salary*percent/100);
		Salary +=(int)increaseAmount;
		return Salary;
		}
	public String toString() {
		return ("Employee[eid="+eid+",name="+getFirstName()+",name="+getLastName()+",Salary="+Salary+"]");
		}

	}

public class Assignment_2 {

	public static void main(String[] args) {
		Employee employee=new Employee(11950,"Jenish","J",15000);
		System.out.println("Original Salary:"+employee.getSalary());
		System.out.println("Annual Salary:"+employee.getAnnualSalary());
		int hikePercent = (12);
		int newSalary = employee.hikeSalary(hikePercent);
		System.out.println("New Salary after"+hikePercent+"%Hike:"+newSalary);
		System.out.println( employee.toString());     

	}

}
