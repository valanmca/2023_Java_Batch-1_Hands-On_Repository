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
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Files_Example9 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
// TODO Auto-generated method stub
//Serialization 
		FileInputStream stream = new FileInputStream("/D:/texts.txt");
		byte[] buffer = new byte[8192];
		int count = 0;
		int n;
		while ((n = stream.read(buffer)) > 0) {
			for (int i = 0; i < n; i++) {
				if (buffer[i] == '\n')
					count++;
			}
		}
		stream.close();
		System.out.println("The count of the lines is : " + count);
	}

}
