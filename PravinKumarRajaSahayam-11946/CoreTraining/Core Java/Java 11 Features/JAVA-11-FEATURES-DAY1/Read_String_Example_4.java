//Java - 11 ReadString and the Write String
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Read_String_Example_4 {
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
		Path files = Paths.get("D://", "MyFile01", "MyFiles04.txt");
		try {
			Files.writeString(files, "Hello everyones , Welcome to the  Java 11", StandardOpenOption.WRITE);
			String values = Files.readString(files);
			System.out.println(values);
		} catch (IOException e) {

		}
	}

}



