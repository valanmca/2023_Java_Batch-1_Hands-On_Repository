package Core_Topic_Domnic_Day_10;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandl {

	public static void main(String[] args)  {
    
//		try {
//			File obj=new File("D:\\FileHandling\\Dom1.txt");
//		    
//		    if(obj.createNewFile()) {
//		    	System.out.println(obj.getName()+" has been created ");
//		    }
//		    else {
//		    	System.out.println(obj.getName()+" is already exists");
//		    }
//		}catch(IOException e) {
//			System.out.println("Error Occured");
//		}
		
		try {
			FileWriter obj=new FileWriter("D:\\FileHandling\\Dom1.txt");
		    obj.write("Hi This is Domnic");
			obj.close();
			System.out.println("Edited Successfully");
		}catch(IOException e) {
			System.out.println("Error Occured");
		}
	
	}

}
