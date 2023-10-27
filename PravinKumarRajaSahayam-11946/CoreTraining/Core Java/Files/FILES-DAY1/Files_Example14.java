//4. Write a Java program to check if a file or directory has read and write permissions.
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

public class Files_Example14 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		File files = new File("/demo/import java.util.java");
		if(files.canWrite()) 
		{
			System.out.println(files.getAbsolutePath() + " can Write ");
		}
		else 
		{
			System.out.println(files.getAbsolutePath() + " can not Write ");
		}
		if(files.canRead()) 
		{
			System.out.println(files.getAbsolutePath() + " can Read ");
		}
		else 
		{
			System.out.println(files.getAbsolutePath() + " can not Read ");
		}
	}

}