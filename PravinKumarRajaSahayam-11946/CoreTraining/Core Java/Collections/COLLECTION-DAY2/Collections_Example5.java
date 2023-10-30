//Collections Map for the TreeMap iterate ways
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class Collections_Example5 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "PravinKumar");
		map.put(20, "RajaSahayam");
		map.put(30, "Surya");
		System.out.println(map);
		map.put(10, "Suryas");
		System.out.println(map);
		map.put(1, "Surya1");
		System.out.println(map);
		System.out.println(map.get(10)); //Suryas
		map.remove(10);
		System.out.println(map);

		//Way - 1 
		Set<Integer> set = map.keySet();
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) 
		{
				Integer key = it.next();
				System.out.println(key + " => " + map.get(key));
		}
		
		
		//Way - 2 
		Set<Entry<Integer , String >> set1 = map.entrySet();
		System.out.println(set1);
		Iterator<Entry<Integer,String>> it1 = set1.iterator();
		while(it1.hasNext()) 
		{
			Entry<Integer,String> e = it1.next();
			System.out.println(e.getKey() + " => " + e.getValue());
		}
	}

}