package com.jeyavel.coreDay5;

public class InheritanceOverloading {
void concat (int a,int b) {
	System.out.println(a+""+b);
}
void concat (String a,String b) {
	System.out.println(a+""+b);
}
void concat(float a,float b) {
	System.out.println(a+""+b);
}
	
	public static void main(String[] args) {
		InheritanceOverloading obj = new InheritanceOverloading();
		obj.concat("jeyavel", "Rajan");
		obj.concat(23, 7);

	}

}
