package Core_Topic_Domnic_Day_11;

import java.io.File;

public class Assg_02_5 {

	public static void main(String[] args) {
    File file=new File("D:/FileHandling/Dom1.txt");
    if(file.isDirectory()) {
    	System.out.println(file.getAbsolutePath()+" is a Directory");
    }
    else {
    	System.out.println(file.getAbsolutePath()+"is not a Directory");

    }
    if(file.isFile()) {
    	System.out.println(file.getAbsolutePath()+" is a file");
    }
    else {
    	System.out.println(file.getAbsolutePath()+" is not a file");

    }
    
    
	}

}
