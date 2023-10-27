//Write a Java Programs to read a data from the files and perform the below: - 1. Count the total no of characters 2. Count the total no of words 3. Count the total no of Lines 4. Count the total no of Vowels. 
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Files_Example8 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
// TODO Auto-generated method stub
//Serialization 
		FileReader obj = new FileReader("D:/texts.txt");
		String line;
		int count = 0;
		BufferedReader br = new BufferedReader(obj);
		while ((line = br.readLine()) != null) {
			String words[] = line.split("");
			count = count + words.length;

		}
		br.close();

		System.out.println("The count of the words is : " + count);
	}

}
