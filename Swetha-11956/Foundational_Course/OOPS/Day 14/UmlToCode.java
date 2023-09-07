package com.swetha.day14;
interface TaxCalculator{
	int taxPercent=15;
	double yearlyIncomeTax();
	double yearlyIncomeWithoutTax();
}

abstract class Employeee implements TaxCalculator {
	private int id;
	private String name;
	private int age;
	Employeee(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	//getter and setter methods
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
	
	abstract int YearlySalary();
	
	abstract int YearlyIncome();
}
class Faculty extends Employeee{
	private String initial;
	private int monthlySalary;
	private int yearlyBonus;
	
	public Faculty(int id,String name,int age,String initial,int monthlySalary,int yearlyBonus){
		
		super(id,name,age);
		
		this.initial=initial;
		this.monthlySalary=monthlySalary;
		this.yearlyBonus=yearlyBonus;
	}
	//getter and setter methods
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
				+ ", getYearlyBonus()=" + getYearlyBonus() + ", yearlyIncomeTax()=" + yearlyIncomeTax()
				+ ", yearlyIncomeWithoutTax()=" + yearlyIncomeWithoutTax() + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public double yearlyIncomeTax() {
		
		return monthlySalary*12*taxPercent/100.0;
	}
	@Override
	public double yearlyIncomeWithoutTax() {
		double yearlyIncomeTax=((monthlySalary*12)*taxPercent/100.0);
		return (monthlySalary*12+yearlyBonus)-yearlyIncomeTax;          //  (yearly income - yearly income tax)
		
	}
	@Override
	public int YearlySalary() {
		return (monthlySalary*12);		
	}
	@Override
	public int YearlyIncome() {
		
		return (monthlySalary*12)+yearlyBonus;
		
	}
	
}
public class UmlToCode {

	public static void main(String[] args) {
		Faculty obj=new Faculty(11956,"Swetha",21,"S",500,1000);
		
		System.out.println("Faculty Id : "+obj.getId());
		System.out.println("Faculty name : "+obj.getName());
		System.out.println("Age : "+obj.getAge());
		System.out.println("Faculty Initial : "+obj.getInitial());
		System.out.println("Faculty Monthly salary : "+obj.getMonthlySalary());
		System.out.println("Faculty yearly bonus : "+obj.getYearlyBonus());
		System.out.println("Faculty yearly Salary : "+obj.YearlySalary());
		System.out.println("Faculty yearly income : "+obj.YearlyIncome());
		System.out.println("Faculty yaerly Income tax : "+obj.yearlyIncomeTax());
		System.out.println("Faculty income without tax : "+obj.yearlyIncomeWithoutTax());

	}

}

