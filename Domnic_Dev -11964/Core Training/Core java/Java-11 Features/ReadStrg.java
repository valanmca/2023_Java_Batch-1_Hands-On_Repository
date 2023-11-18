package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadStrg {

	public static void main(String[] args) {
   try {
	   Path path=Paths.get("D://Sample.txt");
	   
	   String data=Files.readString(path);
	   System.out.println(data);
   }catch(IOException e) {
	   System.out.println(e.getMessage());
   }
	}

}
