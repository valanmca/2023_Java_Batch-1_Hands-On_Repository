//Java - 17 Stronly Encapsulation JGK Internal
import sun.misc.Unsafe;
public class Java_17_Example_6 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		//It will show the security exceptions
		Unsafe unsafe = Unsafe.getUnsafe();
		long values = unsafe.allocateMemory(102360785);
		System.out.println(values);
	}
}