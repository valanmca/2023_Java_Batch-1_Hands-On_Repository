package ExceptionHandling;

public class InvalidAmountEcxeption extends Exception {

	double amount;

	public String toString() {
		return "Your withdrawal amount is greater than the available amount  ";
	}
	
	InvalidAmountEcxeption(double amt){
		amount = amt;
		
	}
	
}
