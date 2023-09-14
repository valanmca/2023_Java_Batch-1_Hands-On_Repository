


package com.muthu.day12;
class addition{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(float a,float b) {
		System.out.println(a+b);
	}
	void add(double a,double b) {
		System.out.println(a+b);
	}
}



public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       addition obj=new addition();
       obj.add(10, 20);
       obj.add(2.0f,30.0f);
       obj.add(55.04, 43.55);
       
	}

}
