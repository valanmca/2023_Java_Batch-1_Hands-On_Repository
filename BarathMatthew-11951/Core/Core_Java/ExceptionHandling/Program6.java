package ExceptionHandling;
import java.util.Scanner;

//try with resource
//we can use it in buffer reader, file, scanner

public class Program6 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		Resource leak: 'sc' is never closed
		
//		So we have to close the sc(object of scanner)
//		sc.close();
		
//		Or we can use try 
		
//		int i = sc.nextInt();
//		System.out.println(i);
		
		
		int i;
//		we have to close the scanner in try
		try (Scanner sc = new Scanner(System.in);){
			i = sc.nextInt();
		}
		
		System.out.println(i);
	

	}
}
