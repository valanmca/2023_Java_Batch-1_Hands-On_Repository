package Core_Topic_Domnic_Day_11;

//File reading 
import java.io.FileReader;
import java.io.IOException;
public class FileHandl {

	public static void main(String[] args) throws IOException {
     FileReader fr = new FileReader("D:\\FileHandling\\Dom1.txt");
     int ch=0;
     
     while((ch=fr.read())!=-1) {
    	 System.out.print((char)ch);
     }
     fr.close();
	}

}
