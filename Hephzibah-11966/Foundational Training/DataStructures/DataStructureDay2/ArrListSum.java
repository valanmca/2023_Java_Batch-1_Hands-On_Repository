package DataStructureDay2;

import java.util.ArrayList;

public class ArrListSum {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);//1
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("List is:" +list);
		
		int sum=list.get(2)+list.get(3);//2
		System.out.println("adding the elements of index 2 and 3 :"+ sum);
		
		list.add(0, sum);//3
		System.out.println("after update :" +list);//4
		
		list.set(list.size()-1,100);//5
		System.out.println("after replacing the last element as 100 :" +list);//6
		
		list.remove(0);//7
		System.out.println("Removing the First element :" +list);//8
		int add=0;
		for(int i=0;i<list.size();i++) {
			add=add+list.get(i);
		}System.out.println(add);
	}

}
