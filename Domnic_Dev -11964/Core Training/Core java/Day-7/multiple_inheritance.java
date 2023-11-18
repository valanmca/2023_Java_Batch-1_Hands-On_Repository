package Core_Topic_Domnic_Day_7;

interface One1{
	
	int a=10;  //public static final
}

interface Two1 extends One1{
	int a=10;
}

interface Three1 extends One1,Two1{    //Multiple inheritance
	void sum();
}
class Calculator1 implements Three1{
	public void sum() {
	System.out.println(One1.a+" + "+Two1.a+" = "+(One1.a+Two1.a));
	}
}
public class multiple_inheritance {

	public static void main(String[] args) {
     Calculator1 calc=new Calculator1();
     calc.sum();
	}

}
