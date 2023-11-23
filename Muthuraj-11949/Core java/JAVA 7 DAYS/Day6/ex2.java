package Day6;
/// Object is reference Concert method 
class E{
	
	String msg= mymethod();
	String mymethod() {
		return "E";
		}
	
}
class F extends E{

	String mymethod() {
		return "F";
		}
	
}
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  E obj= new F();
  System.out.println(obj.msg);
	}

}
