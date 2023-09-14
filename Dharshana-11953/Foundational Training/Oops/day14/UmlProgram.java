package com.dharshu.day14;

interface TaxCalculator {
	public int tax_percent = 15;

	void yearlyIncomeTax();

	void yearlyIncomeWithoutTax();
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

	abstract void yearlySalary();

	abstract void yearlyIncome();

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

	public void yearlySalary() {

		System.out.println(getMnth_salary() * 12);
	}

	public void yearlyIncome() {
		System.out.println((getMnth_salary() * 12) + year_bonus);
	}

	public void yearlyIncomeTax() {
		System.out.println((getMnth_salary() * 12) + year_bonus);
	}

	public void yearlyIncomeWithoutTax() {
		System.out.println((getMnth_salary() * 12) + year_bonus);
	}

}

public class UmlProgram {
	public static void main(String[] args) {
		Faculty me = new Faculty(5, "g3", 20, "hai", 10, 10);
		me.yearlyIncome();
		me.yearlyIncomeTax();
		me.yearlySalary();
		me.yearlyIncomeWithoutTax();

	}

}