package EHDay3;

import java.io.File;

public class ex7 {

	public static void main(String[] args) {

        File my_file_dir = new File("D:/Angular_Workplace"); 
        
        if(my_file_dir.isDirectory()) {
        	System.out.println(my_file_dir.getAbsolutePath()+" is a directory.\n");
        }
        else {
        	System.out.println(my_file_dir.getAbsolutePath()+"is a not directory.\n");
        }
         if(my_file_dir.isFile()) {
         	System.out.println(my_file_dir.getAbsolutePath()+" is a directory.\n"); 
         }else {
         	System.out.println(my_file_dir.getAbsolutePath()+" is a not directory.\n");
         }
	}
}

