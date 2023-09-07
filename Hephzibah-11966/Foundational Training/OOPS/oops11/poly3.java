package oops11;

//Method overloading

class leafs {
	void write() {
		System.out.println("\nAncient people used leaf to write");
	}
}

class slates {
	void write() {
		System.out.println("next genereation people used slates to write");
	}
}

class notebooks {
	void write() {
		System.out.println("next genereation people used notebooks to write");
	}
}

class laptops {
	void write() {
		System.out.println("next genereation people used laptops to write");
	}
}

class smartphones {
	void write() {
		System.out.println("next genereation people used smartphones to write");
	}
}

class student {
	public void takingnotes(leafs leaf) {
		leaf.write();
	}

	public void takingnotes(slates slate) {
		slate.write();
	}

	public void takingnotes(notebooks notebook) {
		notebook.write();
	}

	public void takingnotes(laptops laptop) {
		laptop.write();
	}

	public void takingnotes(smartphones smartphone) {
		smartphone.write();
	}

}

public class poly3 {

	public static void main(String[] args) {
		leafs leaf = new leafs();
		slates slate = new slates();
		notebooks notebook = new notebooks();
		laptops laptop = new laptops();
		smartphones smartphone = new smartphones();

		student obj1 = new student();
		obj1.takingnotes(leaf);

		student obj2 = new student();
		obj1.takingnotes(leaf);
		obj2.takingnotes(slate);

		student obj3 = new student();
		obj1.takingnotes(leaf);
		obj2.takingnotes(slate);
		obj3.takingnotes(notebook);

		student obj4 = new student();
		obj1.takingnotes(leaf);
		obj2.takingnotes(slate);
		obj3.takingnotes(notebook);
		obj4.takingnotes(laptop);

		student obj5 = new student();
		obj1.takingnotes(leaf);
		obj2.takingnotes(slate);
		obj3.takingnotes(notebook);
		obj4.takingnotes(laptop);
		obj5.takingnotes(smartphone);

	}

}
