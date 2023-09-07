//Using the Over Loading (we use inside the class and calling the values with the help of the Parameter and or the Arguments)
package com.pravinkumar.day13;
//Over Loading Method
class Addition {
	void add(int x, int y) {
		System.out.println("The addition is : " + x + y);
	}

	void add(float x, float y) {
		System.out.println("The Addition is : " + x + y);
	}

	void add(double x, double y) {
		System.out.println("The Addition is : " + x + y);
	}
}

public class OOPS_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		obj.add(2, 5);
		obj.add(10.0, 50.0);
		obj.add(1.0f, 5.0f);
	}

}
