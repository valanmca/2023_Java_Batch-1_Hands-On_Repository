public class NestedMain
{
	private void display()
	{
		System.out.println("I am private method");
	}
	
	class NstedMin
	{
		void msg()
		{
			display();
		}
	}
	public static void main(String[] args) {
		NestedMain m=new NestedMain();
		NestedMain.NstedMin n=m.new NstedMin();
		n.msg();
	}

}
