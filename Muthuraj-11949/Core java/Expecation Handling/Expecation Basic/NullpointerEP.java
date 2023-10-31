package EH;

public class NullpointerEP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String s=null;
		}
		catch(NullPointerException  e) {
			System.out.println(e);
			
		}
		System.out.println("It is String");

	}

}
