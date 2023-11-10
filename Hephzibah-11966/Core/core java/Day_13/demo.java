package Day_13;

interface Myinterfacee{
	public static void cals() {
		System.out.println("This is static method in interface");
	}	
}
class calci {
	static void display()
	{
		System.out.println("This is class");
	}
}
public class demo {

	public static void main(String[] args) {
		calci.display();
		Myinterfacee.cals();
	}
}
