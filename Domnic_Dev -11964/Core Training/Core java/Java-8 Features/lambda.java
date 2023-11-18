package Java8;

//labda method 

@FunctionalInterface // annotation for functional intrfaace it throws error if method is 2
interface MyInterface {
 int  calc(int a,int b);
}
////normal approach
//class NormalClass implements MyInterface {
// public  int calc(int a,int b)
// {
//     return a+b;
// }
//}
//
//
//class NormalClass1 implements MyInterface {
// public  int calc(int a,int b)
// {
//     return a-b;
// }
//}

public class lambda {

 public static void main(String[] args) {
     
//     NormalClass obj=new NormalClass();
//     obj.calc(10,20 );
     
     // labda expression 
     
     MyInterface sum=(a,b)->a+b;
     
     System.out.println("Addition:"+sum.calc(10,20));
     
 }

}