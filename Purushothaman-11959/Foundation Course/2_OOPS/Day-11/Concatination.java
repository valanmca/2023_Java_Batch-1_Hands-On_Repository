package com.purushoth.day11;

class MyConcatination {
	public void concat(int a,int b){
      String s=Integer.toString(a);
      String s1=Integer.toString(b);
      String s2=s+s1;
      System.out.println("Concatination is: "+s2);
		
	}
	
	public void concat(float a,float b) {
		System.out.println("Concatination is: "+a+""+b);	
	}
	public void concat(String a,String b) {
		System.out.println("Concatination is: "+a+""+b);	
	}
}
public class Concatination {

	public static void main(String[] args) {
		MyConcatination obj=new MyConcatination();
		obj.concat(2, 4);
		obj.concat(45.0f, 56.0f);
		obj.concat("Magesh","Kumar");

	}

}//Concatination in method overriding.
