package Core_Topic_Domnic_Day_5;

public class methods {

	methods(){
		this(10);
		System.out.println("A");
	}
	
	methods(int a){
		System.out.println("B");
	}
	
	public static void main(String[] args) {
       methods obj1=new methods(10);
       methods obj2=new methods();

	}

}
