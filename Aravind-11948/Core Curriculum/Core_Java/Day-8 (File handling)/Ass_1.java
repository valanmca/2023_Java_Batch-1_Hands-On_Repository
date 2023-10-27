package com.core.day_08;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// CHARACTER COUNT 
// VOWEL COUNT 

public class Ass_1 {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		FileInputStream obj=new FileInputStream("D:/File handling/Ass.txt");
		
		File obj1=new File ("D:/File handling/Ass.txt");
//		System.out.println(obj1.length());
		
		
		int line =1;
		int count=0;
		int vowelcount=0;
		int word=1;
		
		int ch=0;
		
		
		
		while ((ch=obj.read())!=-1)
			
		{ 
			// chararcter count 
			
			count ++;
			
			
			
			 //line count
			 
			 if ( ch==10)
			 {
				 line++;
			 }
			 
			 
			// word count 
			 
			 if ( ch==' ' ||ch==10)
				{
					word++;
				}
			 
			 // vowel count 
			 
			 int  ch1=(char) ch;
			
			if (ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
			{
				vowelcount++;
			}
			
			}
		obj.close();
		System.out.println( "count of characer ="+count);
		System.out.println( " Vowel count  ="+vowelcount);
		
		if (obj1.length()==0)
		{
			word=0;
			line=0;
		}
		System.out.println( " Word count  ="+ (word));
		System.out.println( " Line count  ="+ (line));
		
		
		

	}

}
