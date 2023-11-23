package Day7;

interface One{
	void Addition(int a,int b);
}
interface Two extends One{
	void Subtraction(int a, int b);
}
class Calculator implements Two{
	public void Addition(int a, int b){
		System.out.println("Addition:" +(a+b));
		
	}
	public void Subtraction(int a,int b) {
	System.out.println("Subtraction:"+(a-b));
}
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj=new Calculator();
		obj.Addition(5, 10);
		obj.Subtraction(10,20);
	
	}
  }
}
