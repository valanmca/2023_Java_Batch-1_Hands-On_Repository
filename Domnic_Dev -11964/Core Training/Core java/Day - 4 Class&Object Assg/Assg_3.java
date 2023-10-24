package Core_Topic_Domnic_Day_4;

import java.util.ArrayList;
import java.util.Scanner;

class Restaurant {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> menu_items = new ArrayList<String>();
	ArrayList<Double> prices = new ArrayList<Double>();
	ArrayList<Float> rating = new ArrayList<Float>();

	void additems() {
		System.out.println("Enter the item to be added : ");
		menu_items.add(sc.next());
		System.out.println("Enter the price of entered item");
		prices.add(sc.nextDouble());
		System.out.println("Rating for added item ");
		rating.add(sc.nextFloat());

	}

	void removeitems() {
		System.out.println("Enter the item to be removed ");
		int item = sc.nextInt();

		menu_items.remove(menu_items.get(item));
	}

		
	void avgrating() {
		float avgrating=0.0f;
		int count=0;
		for(int i=0;i<rating.size();i++) {
			count++;
			avgrating=(rating.get(i)+avgrating)/count;
		}
		System.out.println(avgrating);
	}
	
	void display() {
		if (menu_items != null) {
			for (int i = 0; i < menu_items.size(); i++) {
				System.out.println(menu_items.get(i)+": $ "+prices.get(i)+": rating - "+rating);
			}
		} else {
			System.out.println(menu_items);
		}

	}


}

public class Assg_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		Restaurant obj = new Restaurant();

		do {
			System.out.println("1.Add items to Menu\n2.Remove items from menu\n3.View Items\n4.AvgRating");
			int input = sc.nextInt();
			if (input == 1) {
				obj.additems();
			} else if (input == 2) {
				obj.removeitems();
			} else if (input == 3) {
				obj.display();
			} else if(input==4) {
				obj.avgrating();
			} 
			
			
			
			else {
				System.out.println("press 1 to 4");
			}

			System.out.println("To continue enter s");
			choice = sc.next().charAt(0);
		} while (choice == 's');
	}

}
