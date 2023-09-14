package oops11;
class MyConcatination{
	
	void concat(int a, int b) {
		System.out.println("Concatination of integer :"+a+b);	}
	
	void concat(float a, float b) {
		System.out.println("Concatination of float :"+a+b);	}
	
	void concat(String a, String b) {
		System.out.println("Concatination of string :" +a+b);	}
	
}

public class poly7 {

	public static void main(String[] args) {
		MyConcatination obj=new MyConcatination();
		obj.concat(10,20);
		obj.concat(5.0f,2.0f);
		obj.concat("Mrs.","Prabhu");		
	}
}
