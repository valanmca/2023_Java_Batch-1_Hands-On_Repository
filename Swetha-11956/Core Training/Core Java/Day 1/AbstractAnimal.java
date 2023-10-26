package oopsDay1_Day2;
abstract class Animal1{
	abstract void sound();
}
class lion extends Animal1 {
	void sound() {
			System.out.println("lion");
		}
}
class tiger extends Animal1{
	void sound() {
		System.out.println("tiger");
	}
		
}

public class AbstractAnimal {

	public static void main(String[] args) {
		Animal1 obj=new lion();
		Animal1 obj1=new tiger();
		
		obj.sound();
		obj1.sound();
	}

}
