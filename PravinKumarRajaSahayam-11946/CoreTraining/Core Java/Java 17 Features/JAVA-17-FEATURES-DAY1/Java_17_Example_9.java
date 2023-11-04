//Java - 17 Pattern Matching Method for the switch case
public class Java_17_Example_9 {
	public static void main(String[] args) {
		String day = "Monday";
		String result = "";
		result = switch (day) {
		case "Saturday", "Sunday" -> "Weekend";
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
		default -> "Invalid";
		};
		System.out.println(result);
	}
}