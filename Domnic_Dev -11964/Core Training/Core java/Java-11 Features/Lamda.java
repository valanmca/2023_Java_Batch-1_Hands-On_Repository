package Java11;

interface StringOper{
	String concat(String left,String right);
}
public class Lamda {
 
	public static void main(String[] args) {
   StringOper s=(var left,var right)->left+right;
   String op=s.concat("Helo", "World"); 
   System.out.println(op);
	}

}
