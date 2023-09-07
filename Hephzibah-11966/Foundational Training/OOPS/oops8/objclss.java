package oops8;
class Mobile{
	String brandname;
	float price;
	
	Mobile(String brandname, float price){
		this.brandname=brandname;
		this.price=price;
	}
	void display() {
		System.out.println("brandname :"+brandname);
		System.out.println("Price of the mobile :"+price);
	}
}

public class objclss {

	public static void main(String[] args) {
		Mobile realme=new Mobile("realme", 25000); //inside the braket is argument
		realme.display();
		
		Mobile oneplus=new Mobile("oneplus", 35000); 
		oneplus.display();
			}
}
