package com.jenish.day14;

interface TaxCalculator {
    int Tax_Percent = 15;

    void yearlyIncomeTax();

    void yearlyIncomeWithoutTax();
}

abstract class Employee1 implements TaxCalculator {

    private int id;
    private String name;
    private int age;

    public Employee1(int id, String name, int age) {
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

    public abstract void yearlyIncomeTax();

    public abstract void yearlyIncomeWithoutTax();

    public abstract void yearlySalary();

    public abstract void yearlyIncome();
}

class Faculty extends Employee1 {

    private String initial;
    private int monthlySalary;
    private int yearlyBonus;
    int yearlySalary;

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

    public void yearlyIncome() {
        System.out.println("Yearly Income : "+(yearlySalary+yearlyBonus));
    }
    public void yearlySalary() {
        yearlySalary = 12* monthlySalary;
       System.out.println("Yearly Salary: "+yearlySalary);
   }

   
   public void yearlyIncomeTax() {
       System.out.println("YearlyIncome with Tax: "+(yearlySalary/15)*100);
   }
   public void yearlyIncomeWithoutTax() {
       System.out.println("Yearly Income with out Tax: "+yearlySalary);
   }
}
public class Interface_InheritanceUsing_UML_Ex8 {

	public static void main(String[] args) {
		 Faculty obj = new Faculty(961, "jenish", 23, "j", 5000, 2000);
         obj.yearlySalary();
         obj.yearlyIncome();
         obj.yearlyIncomeTax();
         obj.yearlyIncomeWithoutTax();

	}

}
