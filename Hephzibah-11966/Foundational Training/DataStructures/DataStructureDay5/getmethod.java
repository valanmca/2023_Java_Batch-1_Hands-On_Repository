package DataStructureDay5;
import java.util.TreeMap;
	public class getmethod {

	public static void main(String[] args) {
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
		
		map.put('H', (int) 'H');
		map.put('E', (int) 'E');
		map.put('P', (int) 'P');
		map.put('R', (int) 'R');
		map.put('A', (int) 'A');
		map.put('B', (int) 'B');
		map.put('U', (int) 'U');
		map.put('X', (int) 'X');
		
		System.out.println(map);
		System.out.println("X-ASCII value : " +map.get('X'));
		
		map.remove('E');
		System.out.println(map);
		
	
		// TODO Auto-generated method stub

	}

}
