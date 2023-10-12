/*Command Line Argument Addition*/
public class ClAddition{
   public static void main(String []args){
     System.out.println("Argument 1 " + args[0]);
     System.out.println("Argument 2 " + args[1]);

     int i = Integer.parseInt(args[0]);
     int j = Integer.parseInt(args[1]);

     System.out.println("Addition of Arguments :" +(i+j));
  }
}