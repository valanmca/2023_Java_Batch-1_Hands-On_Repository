package Day_9_Collection;

import java.util.LinkedList;
import java.util.Scanner;

/*Create an application for "Vehicle Management System" using any of your favorite collection. 
 * And perform all the "CRUD" operations.*/

class Vehicle {
    int vId;
    String vName;
    String brandName;

    Vehicle(int vId, String vName, String brandName) {
        this.vId = vId;
        this.vName = vName;
        this.brandName = brandName;
    }

    void display() {
        System.out.println("Vehicle Id : " + vId);
        System.out.println("Vehicle Name : " + vName);
        System.out.println("Brandname of the Vehicle : " + brandName);
        System.out.println("----------------------------");
    }
}

public class Ex_5 {

    public static void main(String[] args) {

        int vId = 0;
        String vName = "";
        String brandName = "";
        boolean flag = false;
        String msg = "";
        int process = 1;
        int index = 0;

        LinkedList<Vehicle> list = new LinkedList<Vehicle>();

        Scanner sc = new Scanner(System.in);

        while (process == 1) {
            System.out.println(
                    "1.Add Vehicle 2.Find Vehicle 3.Update Vehicle 4.Delete Vehicle 5.View All Vehicles 6.Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the Vehicle ID,Name,BrandName : ");
                vId = sc.nextInt();
                vName = sc.next();
                brandName = sc.next();
                Vehicle vehicle = new Vehicle(vId, vName, brandName);
                list.add(vehicle);
                System.out.println("Vehicle is added...");
            } else if (choice == 2) {
                System.out.println("Enter the Vehicle ID to find : ");
                vId = sc.nextInt();
                flag = false;
                for (Vehicle v : list) {
                    if (v.vId == vId) {
                        flag = true;
                        v.display();
                    }
                }
                if (flag == false)
                    System.out.println("Vehicle not found...");
            } else if (choice == 3) {
                System.out.println("Enter the Vehicle ID,Name,BrandName : ");
                vId = sc.nextInt();
                vName = sc.next();
                brandName = sc.next();
                flag = false;
                Vehicle vec = new Vehicle(vId, vName, brandName);
                for (Vehicle v : list) {
                    if (v.vId == vId) {
                        flag = true;
                        list.set(index, vec);
                        System.out.println("Vehicle is updated...");
                    }
                    index++;
                }
                if (flag == false)
                    System.out.println("Employee not found...");
            } else if (choice == 4) {
                System.out.println("Enter the Vehicle ID : ");
                vId = sc.nextInt();
                for (Vehicle v : list) {
                    if (v.vId == vId) {
                        list.remove();
                        System.out.println("Vehicle is deleted...");
                    } else {
                        System.out.println("Vehicle is not found");
                    }
                    
                }
            } else if (choice == 5) {
                for (Vehicle v : list) {
                    if (list != null) {
                        v.display();
                    } else {
                        System.out.println("Vehicle is not found");
                    }
                }
            } else if (choice == 6) {
                process = 0;
                System.err.println("Process is truncated ...");
            }
            if (process != 0) {
                System.out.println("Do you want to continue (Yes or No)");
                msg = sc.next();

                if (msg.equalsIgnoreCase("Yes")) {
                    process = 1;
                } else if (msg.equalsIgnoreCase("No")) {
                    process = 0;
                }
            }

        }
    }
}