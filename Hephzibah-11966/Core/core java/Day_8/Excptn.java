package Day_8;

public class Excptn {

	public static void main(String[] args) {
		System.out.println("Before Exception");
//		int a=10/0;                        //ArithmeticException
//		int arr[]= {10,20,30};
//		System.out.println(arr[4]);       //ArrayIndexOutOfBoundsException
//		int a= Integer.parseInt("abc");    //NumberFormatException
//		int arr[]= new int[-5];            //NegativeArraySizeException
//		
//		Object o=new Exception();   //Dynamic Method disbatch  //default Object is a superclass
//		
		Excptn o= (Excptn) new Object();    //ClassCastException
		System.out.println("After Exception");  
	}

}
