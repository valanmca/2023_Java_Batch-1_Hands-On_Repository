package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteString {

	public static void main(String[] args) {

		Path file1=Paths.get("D://","JavaPractice","File_01.txt");
		try {
			Files.writeString(file1,"\nHello from batch 1",StandardOpenOption.APPEND);
			System.out.println("String added successfully");
		}catch(IOException e) {
			
		}
	}

}
