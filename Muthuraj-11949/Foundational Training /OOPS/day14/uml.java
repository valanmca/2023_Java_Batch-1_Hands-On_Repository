package com.muthu.day14;

// Converting UML to Program
interface TaxCalculator {
 int TAX_PERCENT = 15;

 double yearlyIncomeTax();

double yearlyIncomeWithoutTax();
}

abstract class Employee2 implements TaxCalculator {

	private int id;
	private String name;
	private int age;

	public Employee2(int id, String name, int age) {
 this.id = id;
this.name = name;
this.age =age;
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
    this.name = name;}

	public int getAge() {
 return age;
 }

	public void setAge(int age) {
 this.age = age;
 }

	public abstract int yearlySalary();

	public abstract int yearlyIncome();
}

class Faculty extends Employee2 {
	private String initial;
	private int monthlySalary;
	private int yearlyBonus;

	public Faculty(int id, String name, int age, String initial, int monthlySalary, int yearlyBonus) {
 super(id, name, age);
 this.initial = initial;
 this.monthlySalary = monthlySalary;
 this.yearlyBonus = yearlyBonus;
 }

public String getInitial() {
 return initial;
 }

	public void setInitial(String initial) {
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

	@Override
 public String toString() {
 return "Faculty [initial=" + initial + ", monthlySalary=" + monthlySalary + ", yearlyBonus=" + yearlyBonus
 + ", getInitial()=" + getInitial() + ", getMonthlySalary()=" + getMonthlySalary()
 + ", getYearlyBonus()=" + getYearlyBonus() + ", getId()=" + getId() + ", getName()=" + getName()
 + ", getAge()=" + getAge() + ", yearlySalary()=" + yearlySalary() + ", yearlyIncome()=" + yearlyIncome()
 + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
 + "]";
 }

public int yearlySalary() {
return monthlySalary * 12;
}
public int yearlyIncome() {
return (monthlySalary * 12 + yearlyBonus);
}

public double yearlyIncomeTax() {
 return ((monthlySalary * 12) * TAX_PERCENT / 100.0);
 }

public double yearlyIncomeWithoutTax() {
 double yearlyIncomeTax = ((monthlySalary * 12) * TAX_PERCENT / 100.0);
 return (monthlySalary * 12 + yearlyBonus) - yearlyIncomeTax();
 }
}

public class uml {

public static void main(String[] args) {
 Faculty faculty = new Faculty(101, "muthu", 21, "K", 30000, 40000);

 System.out.println("Faculty Name : " + faculty.getName());
 System.out.println("Age : " + faculty.getAge());
 System.out.println("Faculty Initial : " + faculty.getInitial());
 System.out.println("Faculty monthly salary : " + faculty.getMonthlySalary());
 System.out.println("Faculty Yearly Salary : " + faculty.yearlySalary());
System.out.println("Faculty Yearly Bonus : " + faculty.getYearlyBonus());
 System.out.println("Faculty Yearly Income Tax : " + faculty.yearlyIncomeTax());
System.out.println("Faculty Yearly Income without Tax : " + faculty.yearlyIncomeWithoutTax());
}

}