package Day6;
import java.util.Scanner;
public class mark {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the StdId");
		int StdId =sc. nextInt();

		
		System.out.println("Enter the StdName");
		String StdName =sc.next();
		
		System.out.println("Enter the CollegeName");
		String Collegename=sc.next();
		
		System.out.println("Enter the Mark");	
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int sum=m1+m2+m3+m4+m5;
		
	    int mark=sum/5;
		  
		    System.out.println("Enter the  StdId:"+StdId);
		    System.out.println("Enter the Collegename:"+Collegename);
		    System.out.println("Enter the m1:"+m1);
		    System.out.println("Enter the m2:"+m2);
		    System.out.println("Enter the m3:"+m3);
		    System.out.println("Enter the m4:"+m4);
		    System.out.println("Enter the m5:"+m5);
		    System.out.println("Enter the sum:"+sum);
		
		
		
		if(mark>=90) {
			System.out.println("Grade A");
		}
		else if(mark>=80) {
			System.out.println("Grade B");
		}
		else if(mark>=70) {
			System.out.println("Grade C");
			
		}
		else if(mark>=60) {
			System.out.println("Grade D");
		}
		else if(mark>=50){
			System.out.println("Grade E");
		}
		else if(mark>=40) {
			System.out.println("Grade F");
		}
		else{
			System.out.println("fail");
		}
	}

}
