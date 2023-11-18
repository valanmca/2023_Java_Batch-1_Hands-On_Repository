package Core_Topic_Domnic_Day_6;

public class overloading_1 {
	void concat(int a,int b) {
		System.out.println(a+" "+b);
		}
	void concat(String a,String b) {
		System.out.println(a+" "+b);
	}
	void concat(float a,float b) {
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		overloading_1 obj=new overloading_1();
		obj.concat("Domnic", "Dev");
		obj.concat(13.45f, 12.23f);
		obj.concat(10, 20);
	}

}
