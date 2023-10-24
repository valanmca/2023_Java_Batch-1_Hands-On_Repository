package Core_Topic_Domnic_Day_3;

public class String_3_stringis_immutable {

	public static void main(String[] args) {
		String s1 = "Domnic";

		s1.concat("Dev");
		System.out.println(s1); // Domnic

		s1 = s1.concat("Dev");
		System.out.println(s1); // DomnicDev //String is immutable object
								             // we need to reinitialize it
		s1.toUpperCase();
		System.out.println(s1); // domnicdev

		s1 = s1.toUpperCase();
		System.out.println(s1); // DOMNICDEV

	}

}
