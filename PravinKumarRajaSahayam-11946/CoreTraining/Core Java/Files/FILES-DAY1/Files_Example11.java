//1. Write a Java program to get a list of all file/directory names in the given directory.
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

public class Files_Example11 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		File files = new File("/demo/");
		String[] filesList = files.list();
		for (String name : filesList) {
			System.out.println(name);
		}

	}

}
