package Core_Topic_Domnic_Day_1;

public class calculator {

	static int n1;
	static int n2;


	
    calculator(int n1,int n2){
    	this.n1=n1;
    	this.n2=n2;
    }
    
     int addition() {
    	int sum =n1+n2;
    	return sum;
     }
     int substraction() {
    	 int sub=n1-n2;
    	 return sub;
     }
     static int multiplication() {
    	 int mul=n1*n2;
    	 return mul;
     }
     static float division() {
    	 int div=n1/n2;
    	 return div;
     }
     
	
	public static void main(String[] args) {
		calculator obj1=new calculator(10,6);
		System.out.println("Addition :"+obj1.addition());
		System.out.println("Substraction :"+obj1.substraction());
		System.out.println("Multiplication :"+calculator.multiplication());
		System.out.println("Division :"+calculator.division());		

	}

}
