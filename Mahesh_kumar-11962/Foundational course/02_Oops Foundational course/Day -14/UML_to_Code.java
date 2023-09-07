package com.mahesh.Oops_day14;
interface TaxCalculator
{
	int TAX_PERCENT =15;
	double yearlyIncomeTax();
	double yearlyIncomeWithoutTax();
}

abstract class Employ implements TaxCalculator
{
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

public abstract int yearlySalary();
public abstract int yearlyIncome();
}
class Faculty extends Employ
{
	
	private String initial;
	private int monthlySalary;
	private int yearlyBonus;
	
	
	public Faculty(int id, String name, int age, String initial, int monthlySalary, int yearlyBonus) {
		super(id, name, age);
		this.initial = initial;
		this.monthlySalary = monthlySalary;
		this.yearlyBonus = yearlyBonus;
	}
	


	//int AnnualSalary ;//= this.monthlySalary *12;
	public int yearlySalary()
	{	// = 
		return this.monthlySalary *12;	
	}
	
	//int AnnualIncome ;//=AnnualSalary+this.yearlyBonus;
	public int yearlyIncome()
	{	
		return this.yearlySalary()+this.yearlyBonus;
		
	}
	
	public double yearlyIncomeTax()
	{
		//double AnnualIncomeTax =AnnualIncome*(this.TAX_PERCENT/100);
		return (((this.monthlySalary*12)+this.yearlyBonus)*(0.15/10));
		
	}
	public double yearlyIncomeWithoutTax()
	{
		return ((this.monthlySalary *12)+this.yearlyBonus);
		
	}

	@Override
	public String toString() {
		return "\n\nFaculty => \ninitial=" + initial + ",\nId=" + getId() + ", \nName="
				+ getName() + ", \nAge=" + getAge() +",\nmonthlySalary=" + monthlySalary + ", \nyearlyBonus=" + yearlyBonus
				+ " \nyearlySalary=" + yearlySalary() + ",\nyearlyIncome=" + yearlyIncome() + ", \nyearlyIncomeTax=" + yearlyIncomeTax()
				+ ", \nyearlyIncomeWithoutTax=" + yearlyIncomeWithoutTax() + ", \ntoString()=" + super.toString() + "]";
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

	
	
}
public class UML_to_Code {

	public static void main(String[] args) {
		
		Faculty member_01 = new Faculty(101,"Mahesh kumar",23,"A.",20000,4000);
	/*	f.toString();
		System.out.println("Faculty Name :"+f.getName());
		System.out.println("Faculty Id :"+f.getId());
		System.out.println("Faculty Age :"+f.getAge());
		System.out.println("Faculty MonthlySalary :"+f.getMonthlySalary());
		System.out.println("Faculty YearlyBonus :"+f.getYearlyBonus());
		System.out.println("Faculty YearlyIncomeTax :"+f.yearlyIncomeTax());
		System.out.println("Faculty YearlyIncomeWithoutTax :"+f.yearlyIncomeWithoutTax());*/
		
		System.out.println("By Using toString Method :\n "+member_01.toString());
		
		Faculty member_02 = new Faculty(102,"Siva",22,"k.",21000,4200);
		System.out.println(member_02.toString());
		
		
	}

}