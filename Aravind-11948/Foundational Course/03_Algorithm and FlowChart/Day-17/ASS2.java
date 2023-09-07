package com.aravind.day17ass;
class Employee
{
	private int  id;
	private  String firstName;
	private  String lastName;
	private int salary;
	
	Employee(int id,String firstName,String lastName,int salary)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String  getName( )
	{
	    String  name =getFirstName()+" "+getLastName();
		return  name;
	}
	
	public int getAnnualSalary()
	{
		int annualsalary= getSalary()*12;
		return annualsalary;
	}
	public double raiseSalary(int percent)
	{
		double raisedsalary=((getSalary()*(percent*0.01))+getSalary());
		return raisedsalary;
	}
	public String toString()
	{
		String detail="Empid = "+getId()+" , firstName=  "+getFirstName()+" , LastName = "+getLastName()+" , Salary =  "+getSalary();
	return detail;
	}
}

public class ASS2 {

	public static void main(String[] args) {
		
		Employee obj=new Employee(59,"Aravind","S",20000);
		System.out.println("ID             =  "+obj.getId());
		System.out.println("FIRST NAME     =  "+obj.getFirstName());
		System.out.println("LAST NAME      =  "+obj.getLastName());
		System.out.println("FULL NAME      =  "+obj.getName());
		System.out.println("SALARY         =  "+obj.getSalary());
		System.out.println("ANNUAL SALARY  =  "+obj.getAnnualSalary());
		System.out.println("RAISED SALARY  =  "+obj.raiseSalary(15));
		System.out.println(obj.toString());
		
	}

}
