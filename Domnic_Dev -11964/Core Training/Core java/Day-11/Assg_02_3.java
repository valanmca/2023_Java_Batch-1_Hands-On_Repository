package Core_Topic_Domnic_Day_11;

import java.io.File;

public class Assg_02_3 {

	public static void main(String[] args) {
    File file=new File("D:/FileHandling/Dom1.txt");
    if(file.exists()) {
    	System.out.println("Given file is present here");
    }
    else {
    	System.out.println("Given file is not present here");

    }
    
	}

}
