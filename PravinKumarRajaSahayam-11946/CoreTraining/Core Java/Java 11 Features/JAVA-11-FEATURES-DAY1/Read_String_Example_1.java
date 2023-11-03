//Java - 11 Read String
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Read_String_Example_1 {
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
		try {
			Path paths = Paths.get("D://MyFile01//MyFiles04.txt");
			String data = Files.readString(paths);
			System.out.println(data);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
