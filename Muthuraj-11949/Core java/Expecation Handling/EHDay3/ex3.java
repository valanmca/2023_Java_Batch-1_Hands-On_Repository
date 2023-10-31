package EHDay3;

import java.io.FileReader;
import java.io.IOException;

public class ex3 {

	public static void main(String[] args) throws IOException {	
		FileReader fr=new FileReader("D:/muthu.txt");// Open a file for Reading purpose
		int ch=0;
		int char_count =0;
		int word_count=0;
		while((ch = fr.read()) !=-1) {
			char_count ++;
			word_count ++;
		}
		System.out.println("Total no of Characters : "+char_count);
		System.out.println("Total no of Words:"+word_count);
		fr.close();
		}
	}

