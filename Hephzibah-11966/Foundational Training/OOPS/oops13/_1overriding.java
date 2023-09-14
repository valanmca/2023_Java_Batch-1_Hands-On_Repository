package oops13;
/*class Animal{
	public void eat() {
		System.out.println("All animals eat");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eat chicken");
	}
	
}
public class _1overriding {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		Animal animal=new Dog();      //Dynamic Method Dispatch [DMP]
		animal.eat();
		

	}

}*         //Method can be override
            //overriding is everything is same so Method can be override but constructor may not be override, because of different class name
           //Method and constructor can overload
            //super class and sub class have the same name
            


/*class Animal{
	int a=10;
	public void eat() {
		
		System.out.println("All animals eat");
	}
}
class Dog extends Animal{
	int a=20;
	public void eat() {
		
		System.out.println("Dog eat chicken");
	}
	
}
public class _1overriding {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		
		Animal animal=new Dog();
		animal.eat();
		System.out.println(animal.a);  //10
		

	}

}*/

/*class Animal {
	String s = getValue();

	String getValue() {

		return "A";
	}
}

class Dog extends Animal {
	String getValue() {

		return "B";
	}
}

public class _1overriding {

	public static void main(String[] args) {
		Dog dog = new Dog();

		System.out.println(dog.s); // 10

	}

}*/

class Animal {
	String s = getValue();

	String getValue() {

		return "A";
	}
}

class Dog extends Animal {
	String getValue() {

		return "B";
	}
}

public class _1overriding {// final variable canont be change it act as constant

	public static void main(String[] args) {
		final int a=0; //if we mention final, the variable cannot be change
		a=20; //ERROR        //cannot overwrite the final method
		              // if mention class as final it cannot be override
		Dog dog = new Dog();
        System.out.println(dog.s);  

	}

}

/*public class MyClass{
	MyClass(){
		super();} //By default , each and every class is a child of object class.(eg.simple inheritance)
	}
}*/
