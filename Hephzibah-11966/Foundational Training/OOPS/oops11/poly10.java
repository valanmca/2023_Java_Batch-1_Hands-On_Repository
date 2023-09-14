package oops11;
class SuperClass{
	int a, b;
	SuperClass(int a, int b){
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println("Value of A :" +a);
		System.out.println("Value of B :" +b);
	}
}
class SubClass extends SuperClass{
	SubClass(){
		super(10,20);
		super.display();
		System.out.println("Value of A and B:" +super.a +super.b);
	}
}

public class poly10 {

	public static void main(String[] args) {
		SubClass obj=new SubClass();

	}

}
