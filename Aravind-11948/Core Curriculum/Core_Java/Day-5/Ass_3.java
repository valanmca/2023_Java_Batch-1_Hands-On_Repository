package com.core.day_05;

class Sports {
	void display() {
		System.out.println("Sports");
	}

}

class Football extends Sports {
	void display() {
		System.out.println("Play football");
	}
}

class Basketball extends Sports {
	void display() {
		System.out.println("Play basketball");
	}
}

class Ruby extends Sports {
	void display() {
		System.out.println("Play ruby");
	}
}

public class Ass_3 {

	public static void main(String[] args) {
		Football obj = new Football();
		obj.display();

		Basketball obj1 = new Basketball();
		obj1.display();

		Ruby obj2 = new Ruby();
		obj2.display();

	}

}
