package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteStrg {

	public static void main(String[] args) {
		Path file1 = Paths.get("D://Sample1.txt");

		try {
			Files.writeString(file1, "\n Domnic", StandardOpenOption.APPEND);
			System.out.println("String Added Sucessfully");
		} catch (IOException e) {

		}
	}

}
