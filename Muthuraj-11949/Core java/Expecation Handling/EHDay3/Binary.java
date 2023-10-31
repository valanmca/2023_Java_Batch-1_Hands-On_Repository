package EHDay3;
//// Used Binary Condition-Image Video.
//InputStream
///OutputStraem
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binary {

	public static void main(String[] args) throws IOException {
		FileInputStream fr=new FileInputStream("D:/car.jpg");// Open a file for Reading purpose
		FileOutputStream fw=new FileOutputStream("D:/NewImage.jpg");//Open create new file for writing purpose.
		
		int ch=0;
		while((ch = fr.read()) !=-1) {
			/// this - 1 not equal condition method with in java
			fw.write(ch);
		}
              fr.close();      
              fw.close();
              System.out.println("Image Copied");
	}
}
