package EHDay3;
import java.io.*; 
public class ex4 {
	public static void main(String[] args) throws IOException 
	    { 
		
		
	        File file = new File("D:/raj.txt"); 
	        FileInputStream fileInputStream = new FileInputStream(file); 
	        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); 
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
	        
	        String line;
	        int wordCount = 0; 
	        int characterCount = 0; 
	        int sentenceCount = 0; 
	        int VowelsCount=0;
	        String [] Vowels = {"a","e","i","o","u"};
	        
	        while ((line = bufferedReader.readLine()) != null) { 
	            if (line.equals("limitations")) { 
	            	VowelsCount+=1;
	            } 
	            else  { 
	                    characterCount += line.length(); 
	                    String words[] = line.split("\\s+"); 
	                    wordCount += words.length; 
	                    String sentence[] = line.split("[!?.:]+"); 
	                    sentenceCount += sentence.length; 
	            }
	                 }
	                if (characterCount ==2) { 
	                VowelsCount++; 
	            }
	        System.out.println("Total word count = "+ wordCount); 
	        System.out.println("Total number of sentences = "+ sentenceCount); 
	        System.out.println("Total number of characters = "+ characterCount); 
	        System.out.println("Number of Vowels= "+ VowelsCount); 
	    } 
}