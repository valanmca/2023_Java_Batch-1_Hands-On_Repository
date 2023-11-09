package com.jeyavel.coreDay5;

class D{
	D(int a){
		super();
	}
}
class E extends D{
	E(){
		super(5);
	}
}

public class InheritanceExNo2 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		D obj = new E();

	}

}
