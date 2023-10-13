//String Buffer are mutable Objects in Java
public class Array_Example6 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" World ");
		System.out.println(sb); // Java World
		System.out.println("capacity of the sb is : " + sb.capacity());
	}
}
