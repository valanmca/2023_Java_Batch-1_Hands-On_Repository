package com.jeban.Assignment;

class Employee{
	int Id;
	String Firstname;
	String Lastname;
	int Salary;
	Employee(int Id,String Firstname,String Lastname,int Salary){
		this.Id=Id;
		this.Firstname=Firstname;
		this.Lastname=Lastname;
		this.Salary=Salary;
	}
	public int getId() {
		return Id;
	}
//	public void setId(int id) {
//		Id = id;
//	}
	public String getFirstname() {
		return Firstname;
	}
//	public void setFirstname(String firstname) {
//		Firstname = firstname;
//	}
	public String getLastname() {
		return Lastname;
	}
//	public void setLastname(String lastname) {
//		Lastname = lastname;
//	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getAnnualSalary() {
		int AnnualSalary=Salary*12;
		return AnnualSalary;
		}
	public String getName() {
		String Name=(Firstname+Lastname);
		return Name;
	}
	public double RaiseSalary(int percent) {
//		int percent=(percent*Salary)/100;
		double RaiseSalary=(((percent*Salary)/100)+Salary);
		return RaiseSalary;
		}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Salary=" + Salary
				+ ", getId()=" + getId() + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
				+ ", getSalary()=" + getSalary() + ", getAnnualSalary()=" + getAnnualSalary() + ", getName()="
				+ getName() + "]";
	}
	
	
}

public class Problem2 {

	public static void main(String[] args) {
		Employee obj=new Employee(101,"Jeban","Ignesh",12000);
		System.out.println(obj.RaiseSalary(5));
		System.out.print(obj.toString());
		

	}

}
