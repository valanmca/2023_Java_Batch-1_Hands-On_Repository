package Java17;

record Trainee (int id, String name) {
	 public Trainee {
		if (id < 100 || name.isEmpty()) {
		 throw new IllegalArgumentException("Invalid data");
		}
	 } }

	public class Compact_Constructor {
	 public static void main(String[] args) {
	 Trainee emp1 = new Trainee(101, "Dom");
	 System.out.println(emp1);
	 Trainee emp2 = new Trainee(50, "Nic");
	 System.out.println(emp2);
	 } }
