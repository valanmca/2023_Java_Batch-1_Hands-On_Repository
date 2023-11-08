package ExceptionHandling;
import java.io.*;

//Checked Exceptions - Found in Compile time
public class Program3 {

	public static void main(String[] args) {
		
		File file = new File("abc.txt");
		
//		Unhandled exception type FileNotFoundException
		
		try {
			FileInputStream fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			printStackTrace will print all the error in detailed way. 
			e.printStackTrace();
		}
		System.out.println("End of Program");
		
	}

}
