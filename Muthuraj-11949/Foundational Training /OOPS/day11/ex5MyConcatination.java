package com.muthu.day11;
class MyConcatination{
	void concat(String a,String b) {
		System.out.println(a+b)	;
}
	void concat(int a,int b) {
		System.out.println(a+b);
	}
	void concat(float a,float b) {
		System.out.println(a+""+b);
	}
}

public class ex5MyConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConcatination obj=new MyConcatination();
		
	obj.concat("muthu", "raj");
	obj.concat(10, 20);
	obj.concat(30.0f, 10.9f);
	

	}
}

