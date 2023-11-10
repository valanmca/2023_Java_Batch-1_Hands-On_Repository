package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteString {

	public static void main(String[] args) {
		Path file1=Paths.get("D://","java11","sample.txt");
		
		try {
			Files.writeString(file1, "\nHello Idiot Madhan", StandardOpenOption.APPEND);//StandardOpenOption.APPEND
			String value=Files.readString(file1);
			System.out.println(value);
//			System.out.println("String Added Successfully");
			
		}catch(IOException e) {
			
		}

	}

}
