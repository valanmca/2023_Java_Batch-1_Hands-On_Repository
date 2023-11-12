package Java11;

public class NestedBAC {
	private void display() {
		System.out.println("Hello from private method");
	}
	class NestedMain{
		void msg() {
			display();
		}
	}

	public static void main(String[] args) {

		NestedBAC m = new NestedBAC();
		NestedBAC.NestedMain n = m.new NestedMain();
		n.msg();

		
	}

}
