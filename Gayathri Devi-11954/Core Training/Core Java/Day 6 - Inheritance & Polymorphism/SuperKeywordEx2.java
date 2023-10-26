package com.gayathri.day5;

class AA{
	void display() {
		System.out.println("A");
	}
}
class BB extends AA{
	void display() {
		System.out.println("B");
	}
}
public class SuperKeywordEx2 {

	public static void main(String[] args) {
		BB obj = new BB();
		obj.display();//method override
		//over ride based on object
		

	}

}
