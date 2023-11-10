package Day_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class imagereadwrite {

	public static void main(String[] args) throws IOException {
		{
			FileInputStream fr=new FileInputStream("D:/image.jpeg");
			FileOutputStream fw=new FileOutputStream("D:/Newimage.jpeg");
			int ch=0;
			
			while((ch=fr.read())!=-1) 
			{
				fw.write(ch);
			}
			fr.close();
			fw.close();
			System.out.println("image Copied");

		}	

	}

}
