package oops_1;


abstract class Animal1{
	abstract void sound();
	 public void name() {
		 System.out.println("Hepzhi");
	 }
}
class Lion extends Animal1{
	void sound() {
		System.out.println("Lion sound");
	}
}
class Tiger extends Animal1{
	void sound() {
		System.out.println("Tiger sound");
	}
}
public class abstract_animal {
	public static void main(String[] args) {
		Animal1 obj=new Lion();
		obj.sound();
		obj.name();
		
		Animal1 obj1=new Tiger();
		obj1.sound();

	}

}
