//Interface using simple calculator initialize values
interface Onea {
	int a = 10; //public static final
}

interface Twoa extends Onea{
	int b = 50;
}

interface Threea extends Onea,Twoa { //Multiple Inheritance
	void sum();
}

class Calculatora implements Threea {
	public void sum() 
	{
		System.out.println(a + b);
	}
}

public class Abstract_Class_Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatora calculator = new Calculatora();
		calculator.sum();

	}

}