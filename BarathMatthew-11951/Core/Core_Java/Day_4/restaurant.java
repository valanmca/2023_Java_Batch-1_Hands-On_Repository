package Day_4;
import java.util.ArrayList;
import java.util.Scanner;

public class restaurant {

    
        ArrayList<String> menu_item = new ArrayList<String>();
     ArrayList<Integer> item_price = new ArrayList<Integer>();
     ArrayList<Float> item_rate = new ArrayList<Float>();
     static Scanner sc = new Scanner(System.in);
     String food_item;
     int food_price;
     float food_rate;

     void add_menu() {
     System.out.println("Enter the Menu item name : ");
     menu_item.add(food_item = sc.next());
     System.out.println("Enter the Menu item price : ");
     item_price.add(food_price = sc.nextInt());
     System.out.println("Enter the Menu item rating : ");
     item_rate.add(food_rate = sc.nextFloat());
     }

     void remove_menu() {
     System.out.println("Enter the Menu item you want to delete (index) : ");
     int index = sc.nextInt();

     menu_item.remove(menu_item.get(index));

     item_price.remove(item_price.get(index));

     item_rate.remove(item_rate.get(index));

     System.out.println("Menu Delete Sucessfully");

     }

     void avg_rating() {
     float avg_rating = 0.0f;
     int count =0;
     for (float obj : item_rate) {
     count++;
     avg_rating = obj + avg_rating/count;

     }
     System.out.println("Menu item's Average rating : " + avg_rating);

     }

     void show_menu() {
     System.out.println("Enter the Menu items name : " + menu_item);
     System.out.println("Enter the Menu items price : " + item_price);
     System.out.println("Enter the Menu items rating : " + item_rate);

     }
    public static void main(String[] args) {
        restaurant menu = new restaurant();
         char choice;
         menu.add_menu();
         do {
         System.out.println("\t----ADD/REMOVE REVIEW----");
         System.out.println(
         "ADD FOOD (press 1) / DELETE FOOD (press 2) / VIEW DETAILS (press 3)/ VIEW AVG RATINGS (press 4)");

         int input = sc.nextInt();

         if (input == 1) {

         menu.add_menu();
         } else if (input == 2) {
         menu.remove_menu();
         }

         else if (input == 3) {
         menu.show_menu();

         } else if (input == 4) {
         menu.avg_rating();

         }

         else {
         System.out.println("Plz choose 1 to 4");
         }
         System.out.println("Do you want to repeat ?(press s)");
         choice = sc.next().charAt(0);
         } while (choice == 's' || choice == 'S');
            }


    }