//Java - 17 Records Class
record Person(int id, String name) {

}
public class Java_17_Example_2 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Person p1 = new Person(16, "PravinKumar");
		System.out.println("Age" + " " + p1.id());
		System.out.println("Name" + " " + p1.name());
		System.out.println(p1.toString());
		System.out.println("HashCode for the First Object:" + " " + p1.hashCode());
		Person p2 = new Person(10, "RajaSahayam");
		System.out.println("Age" + " " + p2.id());
		System.out.println("Name" + " " + p2.name());
		System.out.println(p2.toString());
		System.out.println("HashCode for the Second Object:" + " " + p2.hashCode());
		Person p3 = new Person(9, "Surya");
		System.out.println("Age" + " " + p3.id());
		System.out.println("Name" + " " + p3.name());
		System.out.println(p3.toString());
		System.out.println("HashCode for the Second Object:" + " " + p3.hashCode());
		System.out.println("p1,p2,p3 is Equal:" + " " + p1.equals(p2));
	}
}