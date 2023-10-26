package JavaOops4;

public class InstanceStatic {

	int a=10;
	
	public static void main(String[] args) {


		InstanceStatic obj1=new InstanceStatic();
		InstanceStatic obj2=new InstanceStatic();
		
		System.out.println(obj1.a); //10
		System.out.println(obj2.a); //10
		
		obj1.a=20;
		System.out.println(obj1.a); //20
		System.out.println(obj2.a); //10
		
		
	}

}
