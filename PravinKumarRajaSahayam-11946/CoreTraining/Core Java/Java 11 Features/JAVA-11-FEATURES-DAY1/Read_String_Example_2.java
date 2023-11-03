//Java - 11 Write String
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Read_String_Example_2 {
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
		Path files1 = Paths.get("D://", "MyFile01", "MyFiles04.txt");
		try {
			Files.writeString(files1, "\nHello Hia Hii for from the Batch - 1 ", StandardOpenOption.APPEND);
			System.out.println("String Added Successfully");
		} catch (IOException e) {

		}
	}

}




