package Core_Topic_Domnic_Day_11;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Assg_02_1 {

	public static void main(String[] args) throws FileNotFoundException {
    File file=new File("D:/FileHandling/");
    String[] files=file.list();
    for(int i=0;i<files.length;i++) {
    	System.out.println(files[i]);
      }
	}

}
