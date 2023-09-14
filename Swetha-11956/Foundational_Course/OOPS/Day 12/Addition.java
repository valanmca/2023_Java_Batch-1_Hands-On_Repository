package Practice1;

public class Addition {
	void add(int x,int y) {
		System.out.println("The sum of int : "+ x+y);
	}
	void add(float x,float y) {
		System.out.println("The sum of float : "+ (x+y));
	}
	void add(double x,double y) {
		System.out.println("The sum of double : "+(x+y));
	}
	
	

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(3, 5);
		obj.add(3.0f,5.0f);
		obj.add(3.5, 4.5);

	}

}
