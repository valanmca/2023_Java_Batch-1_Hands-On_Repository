package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadWrite {

	public static void main(String[] args) {
		Path file1 = Paths.get("D://Sample1.txt");

		try {
			Files.writeString(file1, "\n I am Domnic Dev", StandardOpenOption.WRITE);
			String value=Files.readString(file1);
			System.out.println(value);
		} catch (IOException e) {

		}
	}

}
