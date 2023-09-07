package oops9;

public class types {
	
	void Mymethod1() {
		System.out.println("Instance variable");	
	}
	
	static void Mymethod2() {
		System.out.println("Static variable");
	}

	public static void main(String[] args) {
		types obj=new types(); //calling instance void by object name
		obj.Mymethod1();
		
		types.Mymethod2();  //calling static void by class name

	}

}
