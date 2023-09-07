package oops9;
class Fruits{
	String color;
	float price;
	
	//Constructor
	Fruits(String color, float price){
		this.color=color;
		this.price=price;
	}
	
	//Method{
	void display() {
		System.out.println("Color :" +color);
		System.out.println("price :" +price);
	}
}
public class encap {

	public static void main(String[] args) {
		Fruits apple=new Fruits("red", 20);
		apple.display();
		
		Fruits mango=new Fruits("yellow", 30);
		mango.display();
	}

}
