package oops14;
interface TaxCalculator{
	int TaxPercent=15;
	double yearlyIncomeTax();
	double yearlyIncomeWithoutTax();
}
abstract class Employeee implements TaxCalculator{
	int id, age;
	String name;
	Employeee(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Employee Id"+id);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract void yearlySalary();
	abstract void yearlyIncome();
	
}
class Faculty extends Employeee{
	String initial;
	int monthlySalary;
	int yearlyBonus;
	Faculty(int id, String name, int age, String initial, int monthlySalary, int yearlyBonus){
			super(id,name,age);
		
		this.initial=initial;
		this.monthlySalary=monthlySalary;
		this.yearlyBonus=yearlyBonus;
	
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

	
	public double yearlyIncomeTax() {
		int a=30000;
		System.out.println("yearly income tax :" +a);
		System.out.println();
		return 0;
	}

	
	public double yearlyIncomeWithoutTax() {
		System.out.println("yearly income withouttax: 300000");
		return 0;
	}
	void display() {
		System.out.println("employee id :" +id);
		System.out.println("employee name :" +name);
		System.out.println("employee age :" +age);
		System.out.println("employee initial :" +initial);
		System.out.println("employee monthlysalary :" +monthlySalary);
		System.out.println("employee yearlybonus :" +yearlyBonus);
		
		
	}

	
	void yearlySalary() {
	System.out.println("yearlysalary:"+(monthlySalary*12));	
		
	}

	
	void yearlyIncome() {
		System.out.println("yearlyincome : 200000");
		
	}
	
	
	}

public class _9UmlToCode {

	public static void main(String[] args) {
		Faculty obj=new Faculty(11966, "hephzi",23,"wdhrb",111,222) ;
		obj.display();
		obj.yearlySalary();
		obj.yearlyIncomeTax();
		
		
		

	

	}}
