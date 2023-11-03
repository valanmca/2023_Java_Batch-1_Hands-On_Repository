package com.naveen.day_10;

import java.util.HashMap;
import java.util.Scanner;

class Vehicle {
    int vid;
    String vtype;
    String vbrand;
    String ownerName;

    Vehicle(int vid, String vtype, String vbrand, String ownerName) {
        this.vid = vid;
        this.vtype = vtype;
        this.vbrand = vbrand;
        this.ownerName = ownerName;
    }

    void display() {
        System.out.println("Vehicle Id : " + vid);
        System.out.println("Vehicle Type : " + vtype);
        System.out.println("Vehicle Brand : " + vbrand);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("----------------------------");
    }
}

public class Ex04_VMS {

    public static void main(String[] args) {
        int vid = 0;
        String vtype = "";
        String vbrand = "";
        String ownerName = "";

        boolean flag = false;

        HashMap<Integer, Vehicle> vehicleMap = new HashMap<Integer, Vehicle>();
        Scanner sc = new Scanner(System.in);

        String msg = "";
        do {
            System.out.println("1.Add Vehicle 2.Find Vehicle 3.Update Vehicle 4.Delete Vehicle 5.Display all Vehicles 6.Exit");
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Vehicle Id : ");
                    vid = sc.nextInt();
                    System.out.println("Enter Vehicle Type :");
                    vtype = sc.next();
                    System.out.println("Enter Vehicle Brand :");
                    vbrand = sc.next();
                    System.out.println("Enter Owner Name :");
                    ownerName = sc.next();

                    Vehicle vec = new Vehicle(vid, vtype, vbrand, ownerName);
                    vehicleMap.put(vid, vec);
                    System.out.println("Vehicle details are added successfully.");
                    break;

                case 2:
                    System.out.println("Enter Vehicle Id :");
                    vid = sc.nextInt();
                    Vehicle foundVehicle = vehicleMap.get(vid);
                    if (foundVehicle != null) {
                        foundVehicle.display();
                    } else {
                        System.out.println("Vehicle not found!");
                    }
                    break;

                case 3:
                    System.out.println("Enter Vehicle Id : ");
                    vid = sc.nextInt();
                    System.out.println("Enter Vehicle Type :");
                    vtype = sc.next();
                    System.out.println("Enter Vehicle Brand :");
                    vbrand = sc.next();
                    System.out.println("Enter Owner Name :");
                    ownerName = sc.next();

                    Vehicle updatedVehicle = new Vehicle(vid, vtype, vbrand, ownerName);
                    if (vehicleMap.containsKey(vid)) {
                        vehicleMap.put(vid, updatedVehicle);
                        System.out.println("Vehicle id : " + vid + " updated successfully");
                    } else {
                        System.out.println("Record not found!");
                    }
                    break;

                case 4:
                    System.out.println("Enter Vehicle Id to be deleted :");
                    vid = sc.nextInt();
                    if (vehicleMap.containsKey(vid)) {
                        vehicleMap.remove(vid);
                        System.out.println("Vehicle id : " + vid + " deleted successfully");
                    } else {
                        System.out.println("Vehicle not found!");
                    }
                    break;

                case 5:
                    for (Vehicle v : vehicleMap.values()) {
                        v.display();
                    }
                    break;

                case 6:
                    System.exit(0);
                    break;
            }

            System.out.println("Do you want to continue [yes | no]");
            msg = sc.next();
        } while (msg.equalsIgnoreCase("yes"));
    }
}

