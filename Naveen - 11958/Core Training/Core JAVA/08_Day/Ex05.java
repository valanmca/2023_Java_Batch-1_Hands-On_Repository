package com.naveen.day8;
/*Write a Java program to read a data from the file and perform the below:
1. Count the total no of characters
2. Count the total no of words.
3. Count the total no of Lines.
4. Count the total no of Vowels*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		FileInputStream obj=new FileInputStream("D:/NewFile.txt");
		File obj1=new File("D:/NewFile.txt");
		int ch=0;
		int count=0;
		int vowel=0;
		int line=1;
		int word=1;
		
		//Count the total no.of Character
		while ((ch=obj.read()) != -1 ) {
			count++;
			
			//Lines
			if(ch==10) {
				line++;
		}
			//Words
			if((char)ch==' '||ch==10) {
				word++;
			}
			
			//Vowels
			int let=(char)ch;
			if(let=='a' || let=='e' || let=='i' || let=='o' || let=='u' || let=='A' || let=='E' || let=='I' || let=='O' || let=='U') {
				vowel++;
			
			}
		}
		obj.close();
		System.out.println("Total no.of Character:"+count);
		System.out.println("Vowels:"+vowel);
		if(obj1.length()==0) {
			word=0;
			line=0;
		}
		System.out.println("Total no.of Lines:"+line);
		System.out.println("Total no.of Words:"+word);
	}
	

}

