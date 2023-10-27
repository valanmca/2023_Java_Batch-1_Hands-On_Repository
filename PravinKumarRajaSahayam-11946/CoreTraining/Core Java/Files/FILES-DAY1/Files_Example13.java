//3. Write a Java program to check if a file or directory specified by pathname exists or not.
import java.io.File;
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
import java.io.FilenameFilter;

public class Files_Example13 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		File files = new File("/demo/file.txt");
		if (files.exists()) {
			System.out.println("The directory or the files are exists");
		} else {
			System.out.println("The directory or the files are not exists");
		}
	}

}