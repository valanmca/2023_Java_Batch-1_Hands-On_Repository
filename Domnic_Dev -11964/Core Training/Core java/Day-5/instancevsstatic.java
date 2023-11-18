package Core_Topic_Domnic_Day_5;

public class instancevsstatic {
     static int a=10;
	public static void main(String[] args) {
		instancevsstatic obj1=new instancevsstatic();
		instancevsstatic obj2=new instancevsstatic();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=20;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);

	}

}
