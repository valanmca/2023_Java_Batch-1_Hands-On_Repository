package DataStructureDay5;
import java.util.TreeMap;
import java.util.Collections;
public class tremap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap <Integer,String>(Collections.reverseOrder());
		
		//arrange in asscending order by Integer value
		map.put(10, "java");
		map.put(20, "C");
		map.put(5, "C++");
		map.put(15, "Python");
		map.put(7, ".Net");
		System.out.println(map);
		
		map.put(10, "PHP");
		map.put(30, "C");
		System.out.println(map);//duplicate value
	}

}
