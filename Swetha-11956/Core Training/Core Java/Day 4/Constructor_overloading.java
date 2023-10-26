package JavaOops4;

public class Constructor_overloading {
	
	Constructor_overloading(){
		this(10);
		System.out.println("A");
	}
	Constructor_overloading(int a){
		System.out.println("B");
		
	}
	

	public static void main(String[] args) {
		Constructor_overloading obj=new Constructor_overloading();
		

	}

}
