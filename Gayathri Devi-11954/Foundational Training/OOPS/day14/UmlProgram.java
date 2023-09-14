package com.gayathri.day14;
//not result

interface TaxCalculator {
	public int tax_percent = 15;

	double yearlyIncomeTax();

	double yearlyIncomeWithoutTax();
}

abstract class Empcls {
	private int id;
	private String name;
	private int age;

	public Empcls(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	abstract int yearlySalary();

	abstract int yearlyIncome();

}

class Faculty extends Empcls implements TaxCalculator {
	String initial;
	int mnth_salary;
	int year_bonus;

	public Faculty(int id, String name, int age, String initial, int mnth_salary, int year_bonus) {
		super(id, name, age);
		this.initial = initial;
		this.mnth_salary = mnth_salary;
		this.year_bonus = year_bonus;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public int getMnth_salary() {
		return mnth_salary;
	}

	public void setMnth_salary(int mnth_salary) {
		this.mnth_salary = mnth_salary;
	}

	public int getYear_bonus() {
		return year_bonus;
	}

	public void setYear_bonus(int year_bonus) {
		this.year_bonus = year_bonus;
	}

	@Override
	public String toString() {
		return "Faculty [initial=" + initial + ", mnth_salary=" + mnth_salary + ", year_bonus=" + year_bonus
				+ ", getInitial()=" + getInitial() + ", getMnth_salary()=" + getMnth_salary() + ", getYear_bonus()="
				+ getYear_bonus() + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int yearlySalary() {
		
		return mnth_salary * 12;
	}

	public int yearlyIncome() {
		return (mnth_salary * 12) + year_bonus;
	}

	public double yearlyIncomeTax() {
		return mnth_salary * 12 *tax_percent /100.0;
	}

	public double yearlyIncomeWithoutTax() {
		double yearlyIncomeTax = ((mnth_salary * 12) * tax_percent / 100.0);
		return (mnth_salary * 12 + year_bonus) - yearlyIncomeTax;
	}

}

public class UmlProgram {

	public static void main(String[] args) {
		Faculty faculty = new Faculty(5, "Gayathri", 20, "K", 16000, 100);
		System.out.println("ID : " + faculty.getId());
		System.out.println("Name : " + faculty.getName());
		System.out.println("Age : " + faculty.getAge());
		System.out.println("Initial : " + faculty.getInitial());
		System.out.println("Monthly salary : " + faculty.getMnth_salary());
		System.out.println("Yearly Salary : " + faculty.yearlySalary());
		System.out.println("Yearly Bonus : " + faculty.getYear_bonus());
		System.out.println("Yearly Income Tax : " + faculty.yearlyIncomeTax());
		System.out.println("Yearly Income without Tax : " + faculty.yearlyIncomeWithoutTax());
		
		

	}

}
