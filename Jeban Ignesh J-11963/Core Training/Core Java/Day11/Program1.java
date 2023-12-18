package com.jeban.Day11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Teacher {
	int Id;
	String Name;
	String Subject;

	Teacher(int Id, String Name, String Subject) {
		this.Id = Id;
		this.Name = Name;
		this.Subject = Subject;
	}

	void display() {
		System.out.println("Teacher Id:" + Id);
		System.out.println("Teacher Name:" + Name);
		System.out.println("Teacher subject:" + Subject);
	}
}

public class Program1 {

	private static final String key = null;

	public static void main(String[] args) {
		int Id = 0;
		String Name = "";
		String Subject = "";
		boolean flag = false;
		int index = 0;
		String msg = "";
		TreeMap<Integer, Teacher> map = new TreeMap<Integer, Teacher>();
//		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println(
					"1.Add Teacher,2.Find Teacher,3.Update Teacher Details,4.Delete Teacher,5.View Teacher,6.Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter teacher id,name and subject:");
				Id = sc.nextInt();
				Name = sc.next();
				Subject = sc.next();
				Teacher tea = new Teacher(Id, Name, Subject);
//			list.add(Name);
//			list.add(Subject);
				map.put(Id, tea);
				System.out.println("Teacher details are Added");
				System.out.println(map);
				tea.display();
				break;
			case 2:
				System.out.println("Enter Teacher Id:");
				Id = sc.nextInt();
				Set<Integer> set = map.keySet();
				Iterator<Integer> it = set.iterator();
				while (it.hasNext()) {
					int key = it.next();
					if (key == Id) {

						Teacher dr = map.get(key);

						System.out.println("key = " + key);
						dr.display();

						System.out.println("-----------");
					} else {
						System.out.println("Teacher not found");
					}

				}

				break;

			case 3:
				System.out.println("Enter id,name,and subject: ");
				Id = sc.nextInt();
				Name = sc.next();
				Subject = sc.next();
				Teacher temp = new Teacher(Id, Name, Subject);
				map.put(Id, temp);
				temp.display();
				System.out.println("Details Successfully Updated");

				break;
			case 4:
				System.out.println("Enter Teacher Id:");
				Id=sc.nextInt();
			    Set<Integer> set2=map.keySet();
			    Iterator<Integer> it2=set2.iterator();
			    while(it2.hasNext()) {
			    	int key=it2.next();
			    	if(key==Id) {
			    		map.remove(key);
			    		System.out.println("Details deleted");
			    	}
			    	else {
			    		System.out.println("Details not deleted");
			    	}
			    }
			    	
			    
				break;
			case 5:
				for (Map.Entry<Integer, Teacher> entry : map.entrySet()) {
					int key = entry.getKey();
					Teacher obj1 = entry.getValue();
//				System.out.println("Key:"+key);
					obj1.display();

				}

				break;
			case 6:
				System.out.println("System Exit");
				System.exit(0);

				break;
				
			}
			System.out.println("Do you want to continue[Yes|No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
