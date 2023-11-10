package Day_10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereaderr {

	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("D:/MyFile.txt");
		FileWriter fw=new FileWriter("D:/NewFile.txt");
		int ch=0;
		
		while((ch=fr.read())!=-1) 
		{
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File Copied");

	}

}
