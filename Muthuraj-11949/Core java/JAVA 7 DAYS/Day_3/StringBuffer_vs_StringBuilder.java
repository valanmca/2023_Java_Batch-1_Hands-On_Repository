package Day_3;

public class StringBuffer_vs_StringBuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("Java");
		String s2=new String("World");
		
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1 == s2);//false
		
		
		String s3="java";
		String s4="java";
		
		System.out.println(s3.equals(s4));//true
		System.out.println(s3 == s4);//true
		
		System.out.println(s1.equals(s3));//true
		System.out.println(s1 == s3);//false
		
}
}