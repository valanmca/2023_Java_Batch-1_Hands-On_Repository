import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteString {

	public static void main(String[] args) {

		// Code to specify the file path
		Path file1 = Paths.get("D://", "Java11", "sample.txt");

		try {
			Files.writeString(file1, "\nHello from Batch 1", StandardOpenOption.APPEND);
			System.out.println("String Added Successfully!");

		} catch (IOException e) {

		}
	}
}

