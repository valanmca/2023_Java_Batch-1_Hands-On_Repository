//2. Write a Java program to get specific files with extensions from a specified folder.
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

public class Files_Example12 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		File files = new File("/demo/");
		String[] List = files.list(new FilenameFilter() {
			public boolean accept(File directory, String name) {
				if (name.toLowerCase().endsWith(".java")) {
					return true;
				} else {
					return false;
				}
			}

		});
		for (String f : List) {
			System.out.println(f);
		}

	}

}
