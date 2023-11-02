//Java - 8 Base - 64 
import java.util.Base64;
public class Lambda_Example8 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		String obj = "Pravin kumar Raja Sahayams";
		System.out.println("Encode Out Put:" + " " + "\n" + obj);
		String BasicBase64Format = Base64.getEncoder().encodeToString(obj.getBytes());
		System.out.println("Encoded String is" + " " + BasicBase64Format);
	}

}
