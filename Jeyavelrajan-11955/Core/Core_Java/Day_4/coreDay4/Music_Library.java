package com.jeyavel.coreDay4;

import java.util.ArrayList;
import java.util.Scanner;

class music{
 
 ArrayList<String> music=new ArrayList <String>();
 Scanner sc=new Scanner(System.in);
 
 
 void addSongs() {
 System.out.println("Enter a number ");
 int n=sc.nextInt();
 
 System.out.println("Enter a song : ");
 for(int i=0;i<n;i++) {
 music.add(sc.next());
 }
 
 }
 void removeSongs() {
 System.out.println("Enter a song to remove : ");
 music.remove(sc.next());
 
 }
 void display() {
 System.out.println("The music list : "+music );
 }
 
 
}

public class Music_Library {

 public static void main(String[] args) {
 music obj = new music();
 obj.addSongs();
 obj.display();
 
 obj.removeSongs();
 obj.display();
 
 

 }

}


