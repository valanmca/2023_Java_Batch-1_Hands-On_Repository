package Core_Topic_Domnic_Day_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Teacher {
	int id;
	String name;
	float salary;

	Teacher(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);

	}
}

public class EmpMng {

	public static void main(String[] args) throws IOException {
		int id = 0;
		String name = "";
		float salary = 0.0f;
		String msg = "";
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<Integer, Teacher> map = new TreeMap<Integer, Teacher>();

		do {
			System.out.println(
					"1) Add Teacher \n2) Find Teacher \n3) Update Teacher \n4) Delete Teacher \n5) View all Teacher \n6) Exit");
			System.out.println("Enter your choice ");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter Teacher ID ");
				id=sc.nextInt();
				System.out.println("Enter Teacher Name ");
				name=br.readLine();
				System.out.println("Enter Teacher Salary ");
                salary=sc.nextFloat();
                Teacher tr=new Teacher(id,name,salary);
                map.put(id, tr);
                System.out.println("Teaher Added Succesfully");
                break;
			
			case 2:
                
				System.out.println("Enter the Teacher ID ");
				id=sc.nextInt();
				
				 Set<Integer> set1=map.keySet();
				    Iterator<Integer> it1=set1.iterator();
				    
				    while(it1.hasNext()){
				    	int key=it1.next();
				    	if(key==id) {
				    		Teacher t1=map.get(key);
							t1.display();
							break;
				    	}
				    	else {
				    		System.out.println("Entered Id is not available");
				    	}
				    }
				
				
				
			case 5:
				
				 Set<Integer> set=map.keySet();
				    Iterator<Integer> it=set.iterator();
				    while(it.hasNext()){
				    	int key=it.next();
						Teacher t1=map.get(key);
						t1.display();
						System.out.println();
				    }
				    break;
				    
//				for(Map.Entry<Integer, Teacher>entry:map.entrySet()) {
//					int key=entry.getKey();
//					Teacher t1=entry.getValue();
//					t1.display()
//					;
//					System.out.println();
//				}
//			    

			}
			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("yes"));

	}

}
