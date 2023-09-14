package DataStructureDay7;

import java.util.LinkedList;

public class linkedsort {
	public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	{
	list.add(50);
	list.add(15);
	list.add(30);
	list.add(35);
	System.out.println(list);
	int temp;
	for(int i=0; i<list.size(); i++) {
		for(int j=i+1; j<list.size(); j++) {
			if(list.get(i)<list.get(j)) {
				temp=list.get(i);
				list.set(i,list.get(j));
				list.set(j,temp);
			}
		}
		
	}
	System.out.println(list);
		
	}}}

