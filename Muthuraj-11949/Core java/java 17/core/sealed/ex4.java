package com.core.sealed;
import sun.misc.Unsafe;
public class ex4 {
	public static void main(String[] args) {
		   Unsafe unsafe=Unsafe.getUnsafe();
		  long value =unsafe.allocateMemory(1024);
		System.out.println(value);
	}
}
  