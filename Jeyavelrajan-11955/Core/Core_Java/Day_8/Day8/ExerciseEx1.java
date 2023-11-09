package com.jeyavel.core.Day8;

import java.io.FileReader;
import java.io.IOException;

public class ExerciseEx1 {

	public static void main(String[] args) throws IOException {
		FileReader fw = new FileReader("D:\\examples.txt");
	    int ch = 0;
	    int Wcount = 1;
	    int Lcount = 0;
	    int Licount = 1;
	    int Vcount = 0;
	    int collections[] = {97,101,105,111,117,65,69,73,79,85};
	    while ((ch=fw.read())!=-1) {
	    	if(ch==32||ch==10) {
	    		Wcount++;
	    	}
	    	else {
	    		Lcount++;
	    	}
	    	if(ch==10){
	    		Licount++;
	    	}else {
	    		for (int i:collections) {
	    			if(ch==i) {
	    				Vcount++;
	    			}
	    		}
	    	}
	    	
	    }
	    

	    System.out.println("No of Words:"+Wcount);
	    System.out.println("No of Letters:"+Lcount);
	    System.out.println("No of Lines:"+Licount);
	    System.out.println("No of Vowels:"+Vcount);
               
	}

}
