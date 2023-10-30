//Collections Map for the HashMap get,delete, and,display
import java.util.HashMap;
public class Collections_Example2 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "PravinKumar");
		map.put(20, "RajaSahayam");
		map.put(30, "Surya");
		System.out.println(map);
		map.put(10, "Suryas");
		System.out.println(map);
		map.put(null, "Surya1");
		System.out.println(map);
		System.out.println(map.get(10)); //Suryas
		map.remove(10);
		System.out.println(map);

	}

}