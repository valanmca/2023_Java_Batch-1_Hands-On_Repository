//Java - 17 Compact Constructor
record Trainee(int id, String name) {
	public Trainee {
		if (id < 100 || name.isEmpty()) {
			throw new IllegalArgumentException("Invalid Data");
		}
	}
}
public class Java_17_Example_3 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Trainee emp1 = new Trainee(101, "PravinKumar");
		System.out.println(emp1);
		Trainee emp2 = new Trainee(102, "Raja");
		System.out.println(emp2);
		Trainee emp3 = new Trainee(103, "Sahayam");
		System.out.println(emp3);
	}
}