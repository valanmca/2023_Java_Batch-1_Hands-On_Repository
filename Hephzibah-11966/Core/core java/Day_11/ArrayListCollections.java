package Day_11;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollections {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(20);
		list.add(90);
		list.add(10);
		
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list);
		
		//Way1
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//Way2
		for(Integer o:list) {
			System.out.println(o);
		}
		
		//Way3
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		

	}

}
