package com.jeyavel.OOPS.day12;

class Additions {
	int num_res;
	float float_res;
	double doub_res;
	int a1;
	int b1;
	float a2;
	float b2;
	double a3;
	double b3;
	
	int Add(int a1, int b1) {
		this.a1 = a1;
		this.b1 = b1;
		this.num_res=a1+b1;
		return num_res;
		
	}

	float Add(float a2, float b2) {
		this.a2 = a2;
		this.b2 = b2;
		this.float_res= a2 + b2;
		return float_res;
		
		

	}

	double Add(double a3, double b3) {
		this.a3 = a3;
		this.b3 = b3;
		this.doub_res = a3 + b3;
		return doub_res;
	
	}
	void display() {
		
//		if (this.num_res != 0){
//			System.out.println("number="+this.num_res);
//		}
//		else if (this.float_res != 0){
//			System.out.println("float="+this.float_res);
//		}
//		else if (this.doub_res != 0){
//			System.out.println("double="+this.doub_res);
//		}
		
			System.out.println("number="+this.num_res);
		
		
			System.out.println("float="+this.float_res);
		
		
			System.out.println("double="+this.doub_res);
		
		
	}
	
	


}

public class MethodOverloading {

	public static void main(String[] args) {
		Additions add = new Additions();
	    add.Add(12,90);
	    add.Add(23.01f, 32.02f);
	    add.Add(90.23d, 34.09d);
		add.display();

	}

}
