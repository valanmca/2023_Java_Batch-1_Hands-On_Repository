package oops9;

public class instDstat {
	int a=10;

	public static void main(String[] args) {
		instDstat obj1=new instDstat();
		instDstat obj2=new instDstat();
      
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=20;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
	}

}
