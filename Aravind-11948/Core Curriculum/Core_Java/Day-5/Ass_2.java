package com.core.day_05;

class Employee{
	
	int  display_Salary(int a)
	{
		return a;
		
	}
	
	
}

class Manager extends Employee
{
	int bonus=2000;
	int  display_Salary(int a)
	
	{
		return a+bonus;
		//super.display_Salary(20000);
	
	}
}

class Programmer extends Employee{
	int bonus=1000;
	int  display_Salary(int a)
	{
		return a+bonus;
	}
}
public class Ass_2 {

	public static void main(String[] args) {
		Manager obj=new Manager();
		System.out.println("Salary of manager = "+obj.display_Salary(20000)+" Bonus ammount = "+obj.bonus);
		
		
		Programmer obj2=new Programmer();
				System.out.println("Salary of Programmer = "+obj2.display_Salary(20000)+" Bonus ammount = "+obj2.bonus);
		

	}

}
