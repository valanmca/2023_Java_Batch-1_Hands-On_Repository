import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteString {

	public static void main(String[] args) {
		Path file1 =Paths.get("D://","eclipse","Read.txt");
		
		try {
			Files.writeString(file1, "\nHello Madhan", StandardOpenOption.APPEND);
			String value=Files.readString(file1);
			System.out.println(value);
		}catch(IOException e)
		{
			
		}
	}

}
