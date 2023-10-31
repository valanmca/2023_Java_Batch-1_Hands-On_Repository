package EHDay3;
import java.io.File;
public class ex8 {

	public static void main(String[] args) {
		 File my_file_dir = new File("D:/Angular_Workplace"); 
	        
	        if(my_file_dir.exists()) {
	        	System.out.println("The directory ot file exists .\n");
	        }
	        else {
	        	System.out.println("The directory or file does not exist.\n");
	        }
		

	}

}
