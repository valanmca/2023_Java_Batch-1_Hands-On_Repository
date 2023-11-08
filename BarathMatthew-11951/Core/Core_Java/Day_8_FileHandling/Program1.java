package Day_8_FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Program1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\MyFile.txt");//open a file for reading purpose.
		FileWriter fw = new FileWriter("D:\\NewFile.txt");//create a new file for writing purpose.
		int ch =0;
		
		while((ch = fr.read() )!=-1) {
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
		System.out.println("File copied");
	}

}
