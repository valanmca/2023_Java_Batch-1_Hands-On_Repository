package com.shaji.Day14;

interface TaxCollector {

	int Tax_Percent = 15;

	double yearlyIncomeTax();

	double yearlyIncomeWithoutTax();
}

abstract class Employee1 implements TaxCollector {
	private int id, Age;
	private String Name;

	Employee1(int id, String Name, int Age) {
		this.id = id;
		this.Name = Name;
		this.Age = Age;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	abstract int yearlySalary();

	abstract int yearlyIncome();

}

class Faculty extends Employee1 {
	Faculty(int id, String Name, int Age) {
		super(id, Name, Age);
	}

	public int yearlySalary() {
		System.out.println("Yearly Salary of the Employee :" + yearlySalary());
		return yearlySalary();
	}

	public int yearlyIncome() {
		System.out.println("Yearly Income of the Employee :" + yearlyIncome());
		return yearlyIncome();
	}

	public double yearlyIncomeTax() {
		System.out.println("Yearly IncomeTax : " + (Tax_Percent * (yearlySalary() / 100)));
		return yearlyIncomeTax();
	}

	public double yearlyIncomeWithoutTax() {
		System.out.println("Yearly Income Without Tax : " + yearlySalary());
		return yearlyIncomeWithoutTax();
	}
}

/*
 * abstract class Faculty implements TaxCollector { private String initial;
 * private int monthlySalary, yearlyBonus; }
 */
public class Interface6 {

	public static void main(String[] args) {
		Faculty obj = new Faculty(11952, "Shaji", 20);
		obj.yearlySalary();
		obj.yearlyIncome();
	}

}
