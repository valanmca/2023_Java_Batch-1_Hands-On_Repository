package Day5;
import java.util.Scanner;
public class Marks {
      public static int Sum(int a, int b,int c,int d,int e){
    	  int Sum1=a+b+c+d+e;
 	     int Average=Sum1/5;
    		 System.out.println(Sum1+"+"+Average);
        	 return Sum1; 
        	 }  
      public static float Sum(float a, float b,float c,float d,float e){
    	  float Sum1=a+b+c+d+e;
 	     float Average=Sum1/5;
    		 System.out.println(Sum1+"+"+Average);
        	 return Sum1; 
        	 }
	public static double Sum(double a,double b, double c, double d,double e) {
		double Sum1=a+b+c+d+e;
		double Average=Sum1/5;
		System.out.println(Sum1+"+"+Average);
		return Sum1;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum(7.0d,8.0d,4.6d,8.9d,4.0d);		
		
		
		
	/*	Marks obj=new Marks();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student SId");
		int SId=sc.nextInt();
		System.out.println("Enter the Student name");
		String name=sc.next();
		System.out.println("Enter the College name");
		String Cname=sc.next();
		System .out.println("Enter the Five marks");
		
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		
       int Sum=m1+m2+m3+m4+m5;
       int mark=Sum/5;
       
       System.out.println("Enter the SId:"+SId);
	    System.out.println("Enter the name:"+name);
	    System.out.println("Enter the m1:"+m1);
	    System.out.println("Enter the m2:"+m2);
	    System.out.println("Enter the m3:"+m3);
	    System.out.println("Enter the m4:"+m4);
	    System.out.println("Enter the m5:"+m5);
	    System.out.println("Enter the Sum:"+Sum);
	    System.out.println("Enter the Average:"+mark);

		
		
		if(mark>= 90) {
			System.out.println("Grade A");
		}
		else if(mark>=80) {
			System.out.println("Grade B");
		}
		else if(mark>=70) {
			System.out.println("Grade C Pass");
		}
		else if(mark>=60){
			System.out.println("Grade D");
		}
		else{
			System.out.println("fail");
		} */
	}
	
	}


