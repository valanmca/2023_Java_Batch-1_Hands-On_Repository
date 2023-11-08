package Day_8_FileHandling;

import java.io.FileReader;
import java.io.IOException;
public class count {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\SampleCount.txt");
		int ch =0;
		int Wcount =1;
		int Lcount =0;
		int Licount =1;
		int Vcount=0;
		int coll[] = {97,101,105,111,117,65,69,73,79,85};
		while((ch = fr.read() )!=-1) {
			if (ch==32 || ch==10) {
				Wcount++;
			}
			else {
				Lcount++;
			}
			if (ch==10) {
				Licount++;
			}
			else {
				for(int i:coll) {
					if(ch==i) {
						Vcount++;
					}
				
				}
			}
		}
		System.out.println("No Of Words : "+Wcount);
		System.out.println("No Of Letters : "+Lcount);
		System.out.println("No Of Lines : "+Licount);
		System.out.println("No Of Vowels : "+Vcount);
		fr.close();		
	}
	
}
