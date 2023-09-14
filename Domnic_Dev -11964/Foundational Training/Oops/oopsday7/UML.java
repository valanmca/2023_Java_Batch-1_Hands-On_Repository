package com.domnic.oopsday7;

interface TaxCalculator {
	int taxpercent = 15;

	double yearlyIncomeTax();

	double yearlyIncomeWithoutTax();

}

abstract class Employee4 implements TaxCalculator {
	private int id;
	private String name;
	private int age;

	public Employee4(int id, String name, int age) {
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

	public abstract double yearlyIncome();

}

class Faculty extends Employee4 {
	private String intial;
	private int monthlySalary;
	private int yearlyBonus;

	public Faculty(int id, String name, int age, String intial, int monthlySalary, int yearlyBonus) {
		super(id, name, age);
		this.intial = intial;
		this.monthlySalary = monthlySalary;
		this.yearlyBonus = yearlyBonus;
	}

	public String getIntial() {
		return intial;
	}

	public void setIntial(String intial) {
		this.intial = intial;
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

	@Override
	public int yearlySalary() {
		int yearlySalary = 12 * monthlySalary;

		return yearlySalary;
	}

	@Override
	public double yearlyIncome() {
		double yearlyIncome = yearlySalary() + yearlyBonus;
		return yearlyIncome;
	}

	@Override
	public double yearlyIncomeTax() {
		double yearlyIncomeTax = (yearlyIncome() - ((0.15) * yearlyIncome()));
		return yearlyIncomeTax;
	}

	@Override
	public double yearlyIncomeWithoutTax() {
		double yearlyIncomeWithoutTax = yearlyIncome();
		return yearlyIncomeWithoutTax;
	}

	@Override
	public String toString() {
		return "Faculty [intial=" + intial + ", monthlySalary=" + monthlySalary + ", yearlyBonus=" + yearlyBonus
				+ ", getIntial()=" + getIntial() + ", getMonthlySalary()=" + getMonthlySalary() + ", getYearlyBonus()="
				+ getYearlyBonus() + ", yearlyIncomeTax()=" + yearlyIncomeTax() + ", yearlyIncomeWithoutTax()="
				+ yearlyIncomeWithoutTax() + ", yearlySalary()=" + yearlySalary() + ", yearlyIncome()=" + yearlyIncome()
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

}

public class UML {

	public static void main(String[] args) {
		Faculty obj = new Faculty(11963, "Domnic", 21, "K", 14000, 1000);
		System.out.println(obj.toString());

	}

}
