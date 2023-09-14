package com.purushoth.day14;

interface TaxCalculator {
	int taxpercent=15;
	double yearlyIncomeTax();
	double yearlyIncomeWithoutTax();
}

abstract class Employee1 implements TaxCalculator {
	private int id;
	private String name;
	private int age;
	
	
	Employee1(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
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

class Faculty extends Employee1{
	String initial;
	int monthlySalary;
	int yearlyBonus;
	
	Faculty(int id,String name,int age,String initial,int monthlySalary,int yearlyBonus){
		super(id,name,age);
		this.initial=initial;
		this.monthlySalary=monthlySalary;
		this.yearlyBonus=yearlyBonus;	
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
		int yearlySalary=12*monthlySalary;
	    return yearlySalary;
	}
	
	public double yearlyIncome() {
		double yearlyIncome=yearlySalary() + yearlyBonus;
		return yearlyIncome;
	}
	
	public double yearlyIncomeTax() {
		double yearlyIncomeTax=(yearlyIncome()-((super.taxpercent/100)*yearlyIncome()));
		return yearlyIncomeTax;
	}
	
	public double yearlyIncomeWithoutTax() {
		double yearlyIncomeWithoutTax= yearlyIncome();
		return yearlyIncomeWithoutTax;
	}

	@Override
	public String toString() {
		return "Faculty [initial=" + initial + ", \nmonthlySalary=" + monthlySalary + ", \nyearlyBonus=" + yearlyBonus
				+ ", \ngetMonthlySalary()=" + getMonthlySalary() + ", \ngetYearlyBonus()=" + getYearlyBonus()
				+ ", \nyearlySalary()=" + yearlySalary() + ", \nyearlyIncome()=" + yearlyIncome() + ", \nyearlyIncomeTax()="
				+ yearlyIncomeTax() + ", \nyearlyIncomeWithoutTax()=" + yearlyIncomeWithoutTax() + ", \ngetId()=" + getId()
				+ ", \ngetName()=" + getName() + ", \ngetAge()=" + getAge() +  "]";
	}

		
	
	
	
}
public class UMLClassCreation {

	public static void main(String[] args) {
		Faculty obj=new Faculty(102,"sara",21,"S",12000,1000);
		System.out.println(obj.toString());
		

	}

}//Tax Calculator from UML Diagram.
