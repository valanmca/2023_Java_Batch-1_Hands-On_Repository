package revision.oops;

abstract class Animal1{
	abstract void sound();
}

class Lion extends Animal1{
	void sound() {
		System.out.println("Lion Roar");
	}
}
class Tiger extends Animal1{
	void sound() {
		System.out.println("Tiger growl");
	}
}

public class Abstract {

	public static void main(String[] args) {
    Lion lion=new Lion();
    lion.sound();
    
    Tiger tiger=new Tiger();
    tiger.sound();
	}
}
