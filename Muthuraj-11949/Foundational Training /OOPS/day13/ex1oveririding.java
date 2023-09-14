package com.muthu.day13;
class Animal{
	String s=getValue();
	Animal(){}
	String getValue() {
		return "A";
	}
}
class dog extends Animal
{
	dog(){
}
	String getValue() {
		return "B";
	}
}
public class ex1oveririding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     dog dog=new dog();
     System.out.println(dog.s);	}

}
