package Day_5;

public class ins_vs_static {
	int a=10;
	

	public static void main(String[] args) {
		ins_vs_static obj1=new ins_vs_static();
		ins_vs_static obj2=new ins_vs_static();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=20;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		

	}

}
