package EHDay1;
import java.util.Scanner;
class  InvalidAgeException extends Exception{
	    public String toString(){
		return "Invalid Age for Vote";	
	}	
}
public class ex5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=sc.next();
		
		System.out.println("Enter the Age:");
	
	   int age=sc.nextInt();
       
       if(age>18) {
    	   System.out.println("Welcome to Vote");
      }
        else {
    	   try {
    		   throw new InvalidAgeException();
    	   } catch (InvalidAgeException e) {
    		   System.out.println(e);   
    	   }
       }
	}
}