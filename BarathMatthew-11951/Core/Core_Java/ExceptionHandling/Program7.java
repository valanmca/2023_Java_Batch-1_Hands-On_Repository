package ExceptionHandling;

//throw - custom exception.

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bal =200,with =400;
		try {
		if(with>bal) {
			throw new InsufficientFundException(with-bal);
		}
		}
		
		catch(InsufficientFundException e) {
			System.out.println("Not enough money");
		}

	}

}
