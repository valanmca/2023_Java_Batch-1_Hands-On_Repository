package Java17;

//import sun.misc.Unsafe;
//
//public class stronglyencapsulate {
//
//	public static void main(String[] args) {
//		Unsafe unsafe =Unsafe.getUnsafe();
//		long value=unsafe.allocateMemory(1024);
//		System.out.println(value);
//
//	}
//
//}

//The above program will show SecurityException which is Unsafe.


import java.nio.ByteBuffer;

public class stronglyencapsulate {
public static void main(String[] args) {
ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
long value = ((sun.nio.ch.DirectBuffer) buffer).address();
System.out.println(value);
}
}
//The above program will not run in our machines.This is updated code.
