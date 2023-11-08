package Day_8_FileHandling;

//1. Write a Java program to get a list of all file/directory names in the given directory.
import java.io.File;;
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\MyGitRepo2");
		File coll[] = file.listFiles();
		for(File i : coll) {
			System.out.println(i.getName());
		}
	}

}
