package ExceptionHandling;
import java.io.*;

//Throws - It only through error we can't catch the exception.

// Checked Exception
public class Program4 {

	public static void main(String[] args) throws FileNotFoundException  {
		File file = new File("abc.txt");
		FileInputStream fs = new FileInputStream(file);
		
//		This last print statement will not get executed
		System.out.println("End of program");
	}

}
