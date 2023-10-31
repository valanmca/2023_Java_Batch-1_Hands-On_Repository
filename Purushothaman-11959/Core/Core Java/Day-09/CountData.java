package com.purushoth.day_09;

import java.io.FileReader;
import java.io.IOException;


public class CountData {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:/Count.txt");

		int ch=0;
		int count=0;
		int word=0;
		int vowel=0;
		int lcount=0;
		
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
			count++;
			if(ch==' ' | ch==10) {  //ASCII for Linefeed (10)
				word++;
			}
			if(ch==10) {
				lcount++;
			}
			if(ch=='a' | ch=='e' | ch=='i' | ch=='o' | ch=='u') {
				vowel++;
			}
		}
		System.out.println("");
		System.out.println("Characters: "+count);
		System.out.println("Words: "+(word+1));
		System.out.println("Vowel: "+vowel);
		System.out.println("LineCount: "+(lcount+1));
		
	}

}//To Count Characters,Words,Vowel,LineCount.
