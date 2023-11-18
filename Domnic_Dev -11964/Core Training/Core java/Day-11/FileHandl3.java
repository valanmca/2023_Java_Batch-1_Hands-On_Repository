package Core_Topic_Domnic_Day_11;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandl3 {

	public static void main(String[] args) throws IOException {
     FileInputStream fr=new FileInputStream("D:\\FileHandling\\Trevor.jpg"); 
     FileWriter fw=new FileWriter("D:\\FileHandling\\CopyOfTrevor.jpg");
     
     int ch=0;
     
     while((ch=fr.read())!=-1) {
    	 fw.write(ch);
     }
     
     fr.close();
     
     fw.close();
     System.out.println("Image Copied");
	}

}
