package Core_Topic_Domnic_Day_1;

class animal_sound{
	 void makesound() {
		System.out.println("Every animal makes sound");
	}
}
class cat extends animal_sound {
	void makesound() {
		System.out.println("Cat sounds meow");
	}
}
class dog extends animal_sound{
	void makesound() {
		System.out.println("Dog barks");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		animal_sound obj=new cat();  //DMD
		obj.makesound();
		
		cat obj1=new cat();  //Normal Object creation
		obj1.makesound();
		
		dog obj2=new dog();
		obj2.makesound();    //Normal Object creation

	}

}
