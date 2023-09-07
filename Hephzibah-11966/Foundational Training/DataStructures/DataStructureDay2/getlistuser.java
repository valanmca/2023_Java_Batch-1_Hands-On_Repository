package DataStructureDay2;
import java.util.LinkedList;
import java.util.Scanner;


public class getlistuser {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer> ();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=10; i++)
		{
			int n = sc.nextInt();
			list.add(n);	
		}
		System.out.println(list);
		
	

	}

}
