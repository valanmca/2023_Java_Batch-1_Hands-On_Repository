package com.purushoth.day_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Doctor{
	String doctorName;
	String doctorSpecialization;
	
	Doctor(String doctorName,String doctorSpecialization){
		this.doctorName=doctorName;
		this.doctorSpecialization=doctorSpecialization;
	}
	
	void display(){
		System.out.println("Doctor Name: "+doctorName);
		System.out.println("Doctor Specialization: "+doctorSpecialization);
	}
}
public class DoctorManagementSystem {

	public static void main(String[] args) throws IOException {
		
	TreeMap<Integer,Doctor> map=new TreeMap<Integer,Doctor>();
	Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String msg;
	
	do {
	System.out.println("1.Add doctor details \n2.Delete doctor details \n3.Find doctor details "
			+ "\n4.Update doctor details \n5.View doctor details \n6.Exit");
	System.out.println("Enter the choice: ");
	int choice=sc.nextInt();
	
	switch(choice) {
	
	case 1:
		System.out.println("Enter the doctor id: ");
		int doctorId=sc.nextInt();
		System.out.println("Enter the doctor name: ");
		String doctorName=br.readLine();
		System.out.println("Enter the specialization: ");
		String doctorSpecialization=br.readLine();
		Doctor dr=new Doctor(doctorName,doctorSpecialization);
		map.put(doctorId, dr);
		System.out.println("Doctor details are added");
		break;
		
	case 2:
		System.out.println("Enter the doctor id: ");
		int doctorId1=sc.nextInt();
		map.remove(doctorId1);
		System.out.println("Doctor details successfully deleted");
		break;
		
	case 3:
		System.out.println("Enter the doctor id: ");
		int doctorId2=sc.nextInt();
		try {
		Doctor dr2=map.get(doctorId2);
		System.out.println("Doctor Id: "+doctorId2);
		dr2.display();
		}catch(NullPointerException e) {
		System.out.println("Doctor Details not found");
		}
		break;
		
	case 4:
		System.out.println("Enter the doctor id: ");
		int doctorId3=sc.nextInt();
		System.out.println("Enter the doctor name: ");
		String doctorName3=br.readLine();
		System.out.println("Enter the specialization: ");
		String doctorSpecialization3=br.readLine();
		Doctor dr3=new Doctor(doctorName3,doctorSpecialization3);
		map.put(doctorId3, dr3);
		System.out.println("Doctor details are updated");
		break;
		
	case 5:
		if(map.isEmpty()) {
			System.out.println("There is no Doctor details it is Empty");
		}
		else {
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			Doctor dr1=map.get(key);
			System.out.println("Doctor id: "+key);
			dr1.display();
		}
		}
		break;
		
	case 6:
		System.exit(0);
		break;
		
	default:
	{
		System.out.println("Please enter only 1-6");
	}
	}
	
	System.out.println("Do you want to continue [yes] or [no]");
	msg=sc.next();
	}while(msg.equalsIgnoreCase("yes"));

	}

}
