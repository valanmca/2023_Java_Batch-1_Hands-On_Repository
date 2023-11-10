import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadString {

	public static void main(String[] args) throws IOException {
		try
		{
			Path p=Paths.get("D://eclipse//Read.txt");
			String data=Files.readString(p);
			System.out.println(data);
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
