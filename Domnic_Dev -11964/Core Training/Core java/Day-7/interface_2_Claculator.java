package Core_Topic_Domnic_Day_7;

interface One{
	void addition(int a,int b);
}

interface Two extends One{
	void substraction(int a,int b);
}
class Calculator implements Two{
	public void addition(int a,int b) {
		System.out.println("Addition : "+(a+b));
	}
	public void substraction(int a,int b) {
		System.out.println("Addition : "+(a-b));
	}
}

public class interface_2_Claculator {

	public static void main(String[] args) {
    Calculator obj=new Calculator();
    obj.addition(23, 34);
    obj.substraction(43, 12);
	}

}
