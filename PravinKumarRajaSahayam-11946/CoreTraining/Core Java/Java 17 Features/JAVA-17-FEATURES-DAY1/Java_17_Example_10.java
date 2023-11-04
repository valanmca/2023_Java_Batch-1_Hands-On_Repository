//Java - 17 Pattern Matching Method for the switch case
import java.util.Scanner;
public class Java_17_Example_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = sc.next();
		String result = "";
		result = switch (day) {
		case "Saturday", "Sunday" -> "Weekend";
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
		default -> "Invalid";
		};
		System.out.println(result);
	}
}