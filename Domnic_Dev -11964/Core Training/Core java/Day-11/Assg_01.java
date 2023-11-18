package Core_Topic_Domnic_Day_11;

import java.io.FileReader;
import java.io.IOException;

public class Assg_01 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/FileHandling/Dom1.txt");
		int ch = 0;
		int charac = 0;
		int vowel = 0;
        int line=0;
        int words=0;
		while ((ch = fr.read()) != -1) {
			charac++;
			if ((char) ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u') {
				vowel++;

			}
			
			if(ch==10) {
				line++;
			}
			if(ch==10|ch==' ') {
				words++;
			}
			System.out.print((char)ch);
		}
		
		System.out.println("Number of Characters : " + charac);
		System.out.println("Number of vowels : " + vowel);
		System.out.println("Number of Lines : " + line);
		System.out.println("Number of Words : " + words);

		fr.close();

	}

}
