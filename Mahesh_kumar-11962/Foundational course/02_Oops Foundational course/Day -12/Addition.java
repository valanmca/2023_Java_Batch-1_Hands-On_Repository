package com.mahesh.Oops_day12;

class Subract {
	int x_var, y_var;
	float F_var,F1_var;
	double D_var1,D_var2;
	Subract(int x, int y) {
		this.x_var = x;
		this.y_var = y;

	}
	Subract(float f,float f1) {
		this.F_var = f;
		this.F1_var = f1;

	}
	Subract(double d, double d1) {
		this.D_var1 = d;
		this.D_var2 = d1;

	}

}

public class Addition {
	// method overloading

	void add(int val_01, int val_02) {
		System.out.println("Add :" + (val_01 + val_02));
	}

	void add(float variable_1, int variable_2) {
		System.out.println("Add  :" + (variable_1 + variable_2));
	}

	void add(double val_03, double val_04) {
		System.out.println("Add  :" + (val_03 + val_04));
	}

	public static void main(String[] args) {

		Addition plus = new Addition();
		plus.add(10, 20);
		plus.add(2.0f, 3.0f);
		plus.add(4.0d, 5.0d);

	}

}
