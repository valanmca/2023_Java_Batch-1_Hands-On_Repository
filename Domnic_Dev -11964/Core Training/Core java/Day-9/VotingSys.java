package Core_Topic_Domnic_Day_9;
import java.util.Scanner;
class InvalidAgeException extends Exception{

	@Override
	public String toString() {
		return "Invalid Age";
	}
	
}

public class VotingSys {

	public static void main(String[] args) {
		System.out.println("Enter your age");
      int age=new Scanner(System.in).nextInt();
      if(age>18) {
      System.out.println("Eligible to vote");
      }else {
    	  try {
    	  throw new InvalidAgeException();
    	  }catch(InvalidAgeException e) {
    		  System.out.println(e);
    	  }
      }
	}

}
