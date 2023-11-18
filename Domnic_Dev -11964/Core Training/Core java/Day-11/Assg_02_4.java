package Core_Topic_Domnic_Day_11;

import java.io.File;

public class Assg_02_4 {

	public static void main(String[] args) {
    File file=new File("D:/FileHandling/Dom1.txt");
    if(file.canWrite()) {
    	System.out.println(file.getAbsolutePath()+" can write");
    }
    else {
    	System.out.println(file.getAbsolutePath()+" can't write");

    }
    if(file.canRead()) {
    	System.out.println(file.getAbsolutePath()+" can Read");
    }
    else {
    	System.out.println(file.getAbsolutePath()+" can't Read");

    }
    
    
	}

}
