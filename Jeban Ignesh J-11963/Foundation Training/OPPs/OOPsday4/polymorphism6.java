package com.jeban.OOPsday4;//Concatination overloading

class MyConcatination{
	void concat(int a,int b){
		System.out.println("Concatination: "+a+""+b);
		
		}
	void concat(float a,float b) {
		System.out.println("Concatination: "+a+""+b);
	}
	void concat(String a,String b) {
		System.out.println("Concatination: "+a+""+b);
	}
}

public class polymorphism6 {

	public static void main(String[] args) {
		MyConcatination obj=new MyConcatination();
		obj.concat(12, 10);
		obj.concat(20.0f,23.0f);
		obj.concat("🐍", "jeyanthan");

	}

}
