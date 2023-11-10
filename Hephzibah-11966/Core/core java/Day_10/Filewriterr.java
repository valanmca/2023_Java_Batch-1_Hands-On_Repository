package Day_10;

import java.io.FileReader;

import java.io.IOException;

public class Filewriterr {

	
		public static void main(String[] args) throws IOException 
		{
			FileReader fr=new FileReader("D:/MyFile.txt");
			
			int ch=0;
			
			while((ch=fr.read())!=-1) {
				System.out.println((char)ch);
				
			}
			fr.close();
		}
	}


