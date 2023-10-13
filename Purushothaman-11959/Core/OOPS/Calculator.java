package revision.oops;

public class Calculator {
	static int n1;
	static int n2;


Calculator (int n1,int n2){
	this.n1=n1;
	this.n2=n2;
}

int add(){
	int sum = n1+n2;
	return sum;
	
}

int sub() {
	int sub=n1-n2;
	return sub;
}

static int mul() {
	int mul=n1*n2;
	return mul;
	
}

static float div() {
	float div=n1/n2;
	return div;
}

void display() {
	System.out.println("Addition: "+add());
	System.out.println("Subtraction: "+sub());
	System.out.println("Multiplication: "+mul());
	System.out.println("Division: "+div());	
}


	
	

	public static void main(String[] args) {
     Calculator obj=new Calculator(10,5);
     System.out.println("Addition: "+obj.add());
 	 System.out.println("Subtraction: "+obj.sub());
 	 System.out.println("Multiplication: "+Calculator.mul());
 	 System.out.println("Division: "+Calculator.div());	
     //obj.display();
	}


}
