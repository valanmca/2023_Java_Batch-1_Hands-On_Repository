package EHDay3;

import java.io.File;

public class ex6 {
	
	public static void main(String[] args) {
        File my_file_dir = new File("D:/Angular_Workplace"); 
        
        if(my_file_dir.canWrite()) {
        	System.out.println(my_file_dir.getAbsolutePath()+" can write.\n");
        }
        else {
        	System.out.println(my_file_dir.getAbsolutePath()+" can write.\n");
        }
         if(my_file_dir.canRead()) {
         	System.out.println(my_file_dir.getAbsolutePath()+" can Read.\n"); 
         }else {
         	System.out.println(my_file_dir.getAbsolutePath()+" can Read.\n");
         }
	}
}
