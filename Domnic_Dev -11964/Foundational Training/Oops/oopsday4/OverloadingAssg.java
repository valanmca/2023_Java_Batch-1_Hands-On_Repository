package com.domnic.oopsday4;

class MyConcatination {
	void concat(int a, int b) {
		System.out.println(a + "" + b);

	}

	void concat(float a, float b) {
		System.out.println(a + "" + b);
	}

	void concat(String a, String b) {
		System.out.println(a + b);
	}
}

public class OverloadingAssg {

	public static void main(String[] args) {
		MyConcatination obj = new MyConcatination();
		obj.concat(10, 20);
		obj.concat("Domnic", "Dev");
		obj.concat(33.0f, 44.0f);
		
	}

}
