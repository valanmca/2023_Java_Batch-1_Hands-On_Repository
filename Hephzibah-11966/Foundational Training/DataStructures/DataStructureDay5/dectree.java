package DataStructureDay5;
import java.util.Collections;
import java.util.TreeSet;

public class dectree {

	public static void main(String[] args) {
		TreeSet<Integer> tree1= new TreeSet<Integer>(Collections.reverseOrder());
		TreeSet<String> tree2 = new TreeSet<String>(Collections.reverseOrder());
		
		//integers in decending order
		tree1.add(40);
		tree1.add(10);
		tree1.add(60);
		tree1.add(100);
		tree1.add(99);
		tree1.add(84);
		tree1.add(7);
		System.out.println("Integers in Decending order :" +tree1);
		
		//string in decending order
		tree2.add("SEBASTIAN");
		tree2.add("SELVI");
		tree2.add("PRABHU");
		tree2.add("HEPHZIBAH");	
		tree2.add("EMIMA");		
		System.out.println("String in Decending order :" +tree2);		
	}
}
