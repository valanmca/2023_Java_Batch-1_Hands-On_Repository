package EHDay3;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//// File handling
///Stream in, out,err
///Binary-It 8 bit 1 Byte 
// Character -It 16 bit Unicode 
public class ex1 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:/file.txt");// Open a file for Reading purpose
		FileWriter fw=new FileWriter("D:/NewFile.txt");//Open create new file for writing purpose.
		
		int ch=0;
		while((ch = fr.read()) !=-1) {/// this - 1 not equal condition method with in java
			System.out.println((char)ch);
		}
              fr.close();  
              fw.close();
              System.out.println("File Copied");
	}
}
