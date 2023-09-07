package com.jeyavel.OOPS.day14;

interface TaxCalculator {
	int TAX_PERCENT = 15;

	public double yearlyIncomeIax();

	public double yearlyWithoutTax();
}

//---------------------------------------------------

abstract class Employee1 implements TaxCalculator {
	private int id;
	private String name;
	private int age;

	Employee1(int id, String name, int age) {

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

	abstract public int yearlySalary(int a);

	abstract public int yearlyIncome(int a);

}

//-----------------------------------------------------------------------

class Faculty extends Employee1 {
	private String initial;
	private int monthlySalary;
	private int yearlyBonus;

	Faculty(int id, String name, int age, String initial, int monthlySalary, int yearlyBonus) {
		super(id, name, age);
		this.initial = initial;
		this.monthlySalary = monthlySalary;
		this.yearlyBonus = yearlyBonus;
	}

	

	public int yearlySalary(int year) {
		return(this.monthlySalary * 12);

	}
	public int yearlyIncome() {
		return((this.monthlySalary*12)+this.yearlyBonus)-((this.monthlySalary*12)+this.yearlyBonus*(TaxCalculator.TAX_PERCENT/100));
	}
	public double yearlyIncomeTax() {
		return((this.monthlySalary*12+this.yearlyBonus)*(TaxCalculator.TAX_PERCENT/100));
	}
	public double yearlyIncomeWithoutTax() {
		return(((this.monthlySalary*12)+this.yearlyBonus));
	}
	
	public double yearlyWithoutTax() {
		 return(((this.monthlySalary*12)+this.yearlyBonus));
		
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
	public int yearlyIncome(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double yearlyIncomeIax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Faculty [initial=" + initial + ", monthlySalary=" + monthlySalary + ", yearlyBonus=" + yearlyBonus
				+ ", yearlyIncomeIax()=" + yearlyIncomeIax() + ", getInitial()=" + getInitial()
				+ ", getMonthlySalary()=" + getMonthlySalary() + ", getYearlyBonus()=" + getYearlyBonus()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

public class XMLExerciseNO1 {

	public static void main(String[] args) {
        Faculty fal= new Faculty(12, "jeyavel", 23, "S", 66000, 9000);
        System.out.println("ID   :    "+fal.getId());
         System.out.println("Name :   "+fal.getName());
         System.out.println("Age  :   "+fal.getAge());
         System.out.println("Initial: "+fal.getInitial());
         System.out.println("MonthlySalary:"+fal.getMonthlySalary());
         System.out.println("YearlyBonus    :"+fal.getYearlyBonus());
         System.out.println("yearlyIncomeTax:"+fal.yearlyIncome());
         
         
	
	}



}
