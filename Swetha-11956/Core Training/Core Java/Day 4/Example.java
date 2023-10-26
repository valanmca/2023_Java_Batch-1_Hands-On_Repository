package JavaOops4;


public class Example {
	void concat(int a ,int b) {
		System.out.println(a+" "+b);
		}
	void concat(String a,String b) {
		System.out.println(a+" "+b);
	}
	void concat(float a,float b) {
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		Example obj=new Example();
		obj.concat(10,20);
		obj.concat("Swetha", "Swetha");
		obj.concat(18.2f, 17.3f);

	}

}
