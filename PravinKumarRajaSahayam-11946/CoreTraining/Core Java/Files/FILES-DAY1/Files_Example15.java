//5. Write a Java program to check if the given pathname is a directory or a file.
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

public class Files_Example15 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		File files = new File("/demo/import java.util.java");
		if (files.isDirectory()) {
			System.out.println(files.getAbsolutePath() + " is a Directory ");
		} else {
			System.out.println(files.getAbsolutePath() + " is not a Directory ");
		}
		if (files.isFile()) {
			System.out.println(files.getAbsolutePath() + " is a file");
		} else {
			System.out.println(files.getAbsolutePath() + " is not a file");
		}
	}

}