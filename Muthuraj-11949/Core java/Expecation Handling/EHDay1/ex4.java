package EHDay1;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ex4 {
	
	
	void m1() throws ArithmeticException,FileNotFoundException{
		int a=10/0;
		
		FileReader fr=new FileReader("Abc.txt");
	}
   void m2(){
		try {
			 m1();			
		}  catch (ArithmeticException e){	
		}
		  catch (FileNotFoundException e){		
	}
}
     	public static void main(String[] args) throws FileNotFoundException {		
		FileReader fr=new  FileReader("Demo.text"); //Checked Exception
	 }
 }
