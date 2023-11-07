import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadWrite {

	public static void main(String[] args) {

		// Code to specify the file path
		Path file1 = Paths.get("D://", "Java11", "sample.txt");

		try {
			Files.writeString(file1, "\nHello everyone, Welcome to JAVA 11", StandardOpenOption.WRITE);

			String value = Files.readString(file1);

			System.out.println(value);
		} catch (IOException e) {

		}
	}

}
