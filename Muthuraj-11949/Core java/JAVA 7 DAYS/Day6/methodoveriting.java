package Day6;
class g{
	void display() {
		System.out.println("g");	
	}
}
class h extends g {
	void display() {
		super.display();
		System.out.println("h");
	}
}
public class methodoveriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		g obj= new h();
		obj.display();

	}

}
