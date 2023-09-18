package com.pravinkumar.day5;
abstract class MyAbstractClass{
abstract void myMehtod1();
abstract void myMethod2();
}
class NormalClass extends MyAbstractClass{ //Line-1
 void myMethod1() {
System.out.println("A");
}
}
public class Myclass {
public static void main(String[] args) {
NormalClass obj = new NormalClass();
obj.myMehtod1();
}
}