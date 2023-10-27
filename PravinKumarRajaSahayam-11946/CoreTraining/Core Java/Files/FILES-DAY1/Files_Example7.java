//Write a Java Programs to read a data from the files and perform the below: - 1. Count the total no of characters 2. Count the total no of words 3. Count the total no of Lines 4. Count the total no of Vowels. 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Files_Example7 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
// TODO Auto-generated method stub
//Serialization
		char[] array = new char[1000];
		FileReader obj = new FileReader("D:/texts.txt");
		int count = 0;
		int ch = 0;
		String s = Integer.toString(ch);
		while ((ch = obj.read()) != -1) {
			System.out.print((char) ch);
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != ' ') {
					count++;
				}
			}
		}

		System.out.println("\nThe count of the characters is : " + count);
	}

}