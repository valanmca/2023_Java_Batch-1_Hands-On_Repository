package EHDay3;
import java.io.File;
import java.util.Date;
public class ex5 {
	public static void main(String[] args) {
        File file = new File("D:/Angular_Workplace"); 
        
        String[] fileList=file.list();
        for(String name:fileList) {
        	System.out.println(name);
        }
	}
}
