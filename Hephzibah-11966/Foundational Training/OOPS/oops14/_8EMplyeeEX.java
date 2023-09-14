package oops14;
interface SalaryPlan{
	void Payment();
	void PaymentType();
}
abstract class Employee implements SalaryPlan{
	public void Payment() {
		System.out.println("I will get the payment");
	}
	public abstract void PaymentType();
}
class FullTimeEmployee extends Employee{
	public void PaymentType(){
		System.out.println("Monthly wise");
	}	
}
class FreelanceEmployee extends Employee{
	public void PaymentType() {
		System.out.println("Day wise");
	}
}
public class _8EMplyeeEX {

	public static void main(String[] args) {
		FullTimeEmployee fte=new FullTimeEmployee();
		fte.PaymentType();
		
		FreelanceEmployee fle=new FreelanceEmployee();
		fle.PaymentType();

	}

}
