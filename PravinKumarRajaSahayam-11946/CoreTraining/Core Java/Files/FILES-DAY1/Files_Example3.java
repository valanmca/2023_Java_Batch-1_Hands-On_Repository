//Files for images read and write the text
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files_Example3 {
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
		FileInputStream frs = new FileInputStream("D:/p.jpg"); // Open a Images for Reading Purposes
		FileOutputStream fws = new FileOutputStream("D:/NewImages.jpg"); //Create a new Images for the Writing Purposes
		int ch = 0;
		while ((ch = frs.read()) != -1) {
		fws.write(ch);
		}
		frs.close();
		fws.close();
		System.out.println("Images Copied");
	}

}


