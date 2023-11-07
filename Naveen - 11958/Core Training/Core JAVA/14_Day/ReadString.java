import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadString {

	public static void main(String[] args) throws IOException {
		try {
			Path path = Paths.get("D://Java11//sample.txt");

			String data = Files.readString(path);

			System.out.println(data);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

