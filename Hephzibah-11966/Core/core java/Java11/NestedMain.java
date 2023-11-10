package Java11;

public class NestedMain {
	private void display() {
		System.out.println("hello from private method");
	}
	class NstdMain{
		void msg() {
			display();
		}
	}


	public static void main(String[] args) {
		NestedMain m=new NestedMain();
		NestedMain.NstdMain n=m.new NstdMain();
		n.msg();
		

	}

}
