//Command Line Argument

class MyClass{
   public static void main(String [] args){
   System.out.println("Number 1 : "+ args[0]);
   System.out.println("Number 2 : "+ args[1]);
   int a = Integer.parseInt(args[0]);
   int b = Integer.parseInt(args[1]);
   System.out.println("Total No of Integer: "+(a+b));
 }
}

