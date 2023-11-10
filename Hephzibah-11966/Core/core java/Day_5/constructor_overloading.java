package Day_5;
//incomplete
public class constructor_overloading {
	constructor_overloading(){
		this(10);
		System.out.println("A");
	}
    constructor_overloading(int a){
		System.out.println("B");
	}

	public static void main(String[] args) {
		constructor_overloading obj=new constructor_overloading();
	
		

	}

}
