package DataStructureDay5;

import java.util.TreeSet;

public class duplicate {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		TreeSet<String> tree1 = new TreeSet<String>();
		
		tree.add(80);
		tree.add(10);
		tree.add(30);
		tree.add(30);
		System.out.println(tree);
		
		tree1.add("F");//it never takes duplicate value. simply ignore it
		tree1.add("F");
		tree1.add("F");
		tree1.add("F");
		System.out.println(tree1);


	}

}
