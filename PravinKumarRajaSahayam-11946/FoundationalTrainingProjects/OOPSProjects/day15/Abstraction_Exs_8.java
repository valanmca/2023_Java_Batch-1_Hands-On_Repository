 //Using Abstraction Interfaces
package com.pravinkumar.day15;

//Interfaces
interface TaxCalculator {
	int TAX_PERCENT = 15;

	void yearlyIncomeTax();
	
	void yearlyIncomeWithoutTax();
}

abstract class Empl implements TaxCalculator {
	int Id;
	String Name;
	int Age;

	Empl(int Id, String Name, int Age) {
		this.Id = Id;
		this.Name = Name;
		this.Age = Age;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public abstract int yearlySalary();

	public abstract int yearlyIncome();
}

class Faculty extends Empl {

	public static int yearlyIncome;
	public static int YearlySalary;
	public static double yearlyIncomeTax;
	public static double yearlyIncomeWithoutTax;
	String Initial;
	public int MonthlySalary;
	public int YearlyBonus;
	public int yearlySalary;
	Faculty(int Id, String Name, int Age, String Initial, int MonthlySalary, int YearlyBonus) {
		super(101, "PravinKumar", 50);
		this.Initial = Initial;
		this.MonthlySalary = MonthlySalary;
		this.YearlyBonus = YearlyBonus;
	}

	public String getInitial() {
		return Initial;
	}

	public void setInitial(String initial) {
		Initial = initial;
	}

	public int getMonthlySalary() {
		return MonthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		MonthlySalary = monthlySalary;
	}

	public int getYearlyBonus() {
		return YearlyBonus;
	}

	public void setYearlyBonus(int yearlyBonus) {
		YearlyBonus = yearlyBonus;

	}

	public int yearlySalary() {
		yearlySalary = MonthlySalary * 12;
		return yearlySalary;

	}

	public int yearlyIncome() {
		yearlyIncome = yearlySalary + YearlyBonus;
		return yearlyIncome;

	}

	@Override
	public String toString() {
		return "Faculty [Initial=" + Initial + ", MonthlySalary=" + MonthlySalary + ", YearlyBonus=" + YearlyBonus
				+ ", Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", yearlySalary=" + yearlySalary()
				+ ", yearlyIncome=" + yearlyIncome() + " , YearlyIncomeWithTax = " + YearlyIncomeTax(15) + "]";
	}

	public String toString1() {
		return "Faculty [Initial=" + Initial + ", MonthlySalary=" + MonthlySalary + ", YearlyBonus=" + YearlyBonus
				+ ", Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", yearlySalary=" + yearlySalary()
				+ ", yearlyIncome=" + yearlyIncome() + " , YearlyIncomeWithOutTax = " + YearlyIncomeWithoutTax() + "]";
	}

	public double YearlyIncomeTax(int TAX_PERCENT) {
		yearlyIncomeTax = yearlyIncome * TAX_PERCENT;
		return yearlyIncomeTax;
	}

	public double YearlyIncomeWithoutTax() {
		yearlyIncomeWithoutTax = yearlyIncome;
		return yearlyIncomeWithoutTax;
	}

	public void yearlyIncomeTax() {
		System.out.println("The YearlyIncomeWithTax : " + toString());
	}

	public void yearlyIncomeWithoutTax() {
		System.out.println("The YearlyIncomeWithoutTax : " + toString1());
	}
}

public class Abstraction_Exs_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator obj = new Faculty(101, "PravinKumar", 50, "R", 15000, 50);
		obj.yearlyIncomeTax();
		obj.yearlyIncomeWithoutTax();

	}

}
