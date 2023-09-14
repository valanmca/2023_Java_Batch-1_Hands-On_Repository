/****** Converting the UML Diagram into code... *****/
package com.sara.day14;

interface TaxCalculator {

	double yearlyIncomeTax();

	double yearlyIncomeWithoutTax();
}

abstract class Worker implements TaxCalculator {
	private int id;
	private String name;
	private int age;

	public Worker(int id, String name, int age) {
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

	public abstract int yearlySalary();

	public abstract int yearlyIncome();

}

class Faculty extends Worker {

	private char initial;
	private int monthlySalary;
	private int yearlyBonus;

	public Faculty(int id, String name, int age, char c, int monthlySalary, int yearlyBonus) {
		super(id, name, age);
		this.initial = c;
		this.monthlySalary = monthlySalary;
		this.yearlyBonus = yearlyBonus;
	}

	public char getInitial() {
		return initial;
	}

	public void setInitial(char initial) {
		this.initial = initial;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(int yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	public int yearlySalary() {
		return this.monthlySalary * 12;
	}

	public int yearlyIncome() {
		return this.yearlySalary() + this.yearlyBonus;
	}

	public double yearlyIncomeTax() {
		return this.yearlyIncome() * 0.15;
	}

	public double yearlyIncomeWithoutTax() {
		return this.yearlyIncome();
	}

	public String toString() {
		return "Faculty [ \nInitial=" + initial + ", \nName=" + getName() + ", \nId=" + getId() + ", \nAge=" + getAge()
				+ ", \nmonthlySalary=" + monthlySalary + ", \nyearlyBonus=" + yearlyBonus + ", \nYearlySalary="
				+ yearlySalary() + ", \nyearlyIncome()=" + yearlyIncome() + ", \nYearlyIncomeTax=" + yearlyIncomeTax()
				+ ", \nYearlyIncomeWithoutTax=" + yearlyIncomeWithoutTax() + "]";
	}

}

public class UML_Code {

	public static void main(String[] args) {

		Faculty obj = new Faculty(101, "Sara", 21, 'A', 10000, 20000);
		System.out.println(obj.toString());
	}

}
