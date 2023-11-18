package Java17;

import sun.misc.Unsafe;

public class Internals {
	public static void main(String[] args) {
		Unsafe unsafe = Unsafe.getUnsafe();
		long value = unsafe.allocateMemory(1024);
		System.out.println(value);
	}
}
