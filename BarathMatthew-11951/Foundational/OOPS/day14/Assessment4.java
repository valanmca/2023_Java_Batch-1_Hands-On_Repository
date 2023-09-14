package com.matthew.day14;

interface TaxCalculator{
	int TaxPercent = 15;
	
	double yearlyIncomeTax();
	double yearlyIncomeWithoutTax();
}
//------------------
abstract class Employ implements TaxCalculator{
	
	private int id;
	private String name;
	private int age;
	
	public Employ(int id, String name, int age) {
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
	abstract public int yearlySalary();
	abstract public int yearlyIncome();
}

//---------------------------

class Faculty extends Employ{
	private String initial;
	private int monthlySalary;
	private int yearlyBonus;
	
	
	public Faculty(int id, String name, int age, String initial, int monthlySalary, int yearlyBonus) {
		super(id, name, age);
		this.initial = initial;
		this.monthlySalary = monthlySalary;
		this.yearlyBonus = yearlyBonus;
	}
	
	public int yearlySalary(){
		return (this.monthlySalary*12);
	}
	
	public double yearlyIncomeWithoutTax() {
		return ((this.monthlySalary*12)+this.yearlyBonus);
	}
	
	public double yearlyIncomeTax() {
		return (((this.monthlySalary*12)+this.yearlyBonus)*(TaxCalculator.TaxPercent)/100);
	}
	
	public int yearlyIncome() {
		return (((this.monthlySalary*12)+this.yearlyBonus)-(((this.monthlySalary*12)+this.yearlyBonus)*(TaxCalculator.TaxPercent)/100));
	}
	//getter setter
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
				+ ", yearlySalary()=" + yearlySalary() + ", yearlyIncomeWithoutTax()=" + yearlyIncomeWithoutTax()
				+ ", yearlyIncomeTax()=" + yearlyIncomeTax() + ", yearlyIncome()=" + yearlyIncome() + ", getInitial()="
				+ getInitial() + ", getMonthlySalary()=" + getMonthlySalary() + ", getYearlyBonus()=" + getYearlyBonus()
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

 
	
}
public class Assessment4 {

	public static void main(String[] args) {
		Faculty obj = new Faculty(11951,"Matthew",21,"j",20000,2500);
		System.out.println("name :"+obj.getName());
		System.out.println("age :"+obj.getAge());
		System.out.println("Initial :"+obj.getInitial());
		System.out.println("Yearly Bonus :"+obj.getYearlyBonus());
		System.out.println("Yearly Salary :"+obj.yearlySalary());
		System.out.println("Yearly income without tax :"+obj.yearlyIncomeWithoutTax());
		System.out.println("Tax :"+obj.yearlyIncomeTax());
		System.out.println("Yearly Income :"+obj.yearlyIncome());
		System.out.println(obj.toString());
		
	}

}
