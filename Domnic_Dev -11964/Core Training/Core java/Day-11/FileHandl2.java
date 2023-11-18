package Core_Topic_Domnic_Day_11;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandl2 {

	public static void main(String[] args) throws IOException {
     FileReader fr=new FileReader("D:\\FileHandling\\Dom1.txt"); 
     FileWriter fw=new FileWriter("D:\\FileHandling\\CopyOfDom1.txt");
     
     int ch=0;
     
     while((ch=fr.read())!=-1) {
    	 fw.write(ch);
     }
     
     fr.close();
     fw.close();
     System.out.println("File Copied");
	}

}
