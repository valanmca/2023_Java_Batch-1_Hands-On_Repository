//Files for read the text
import java.io.FileReader;
import java.io.IOException;

public class Files_Example1 {
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
		FileReader frs = new FileReader("D:/MyFiles.txt"); // Open a Files for Reading Purposes
		int ch = 0;
		while ((ch = frs.read()) != -1) {
			System.out.print((char)ch);
		}
		frs.close();
	}

}