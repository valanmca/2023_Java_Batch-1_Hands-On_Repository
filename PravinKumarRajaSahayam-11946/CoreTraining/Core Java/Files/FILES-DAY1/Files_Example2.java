//Files for read and write the text
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files_Example2 {
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
		FileReader frs = new FileReader("D:/MyFiles.txt"); // Open a Files for Reading Purposes
		FileWriter fws = new FileWriter("D:/NewFiles.txt"); //Create a new files for the Writing Purposes
		int ch = 0;
		while ((ch = frs.read()) != -1) {
		fws.write(ch);
		}
		frs.close();
		fws.close();
		System.out.println("File Copied");
	}

}