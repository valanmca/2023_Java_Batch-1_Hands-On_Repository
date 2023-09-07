package com.jeyavel.OOPS.day12;


class Addition{
	Addition(int x,int y){
		System.out.println(x+y);
	}
	Addition(float x,float y){
		System.out.println(x+y);
	}
	Addition(double x,double y){
		System.out.println(x+y);
	}
	
	
	public Addition() {
		// TODO Auto-generated constructor stub
	}
	void Display() {
		
	}
}
public class ConstructorOverLoading {

	public static void main(String[] args) {
		Addition add =new Addition(67, 12);
		Addition flo = new Addition(12.0f,67.9f);
		Addition Dou =new Addition (34.90d,56.12d);
	

	}

}
