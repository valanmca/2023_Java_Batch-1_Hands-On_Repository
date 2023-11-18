package com.jeyandhan.day04;

import java.util.ArrayList;
import java.util.Scanner;
public class School {

    ArrayList<String> Student = new ArrayList<String>();
    ArrayList<String> Teacher = new ArrayList<String>();
    ArrayList<String> Class = new ArrayList<String>();
    static Scanner sc =new Scanner(System.in);
    int index;
    static int val;
    static char choice;
    
    void addStudent()
    {
        System.out.println("Enter the School Student Name : ");
        Student.add(sc.next());
        
        
    }
    void addTeacher()
    {
        System.out.println("Enter the School Teacher Name : ");
        Teacher.add(sc.next());
        
    }
    void addClass()
    {
        System.out.println("Enter the School Class Rooms : ");
        Class.add(sc.next());
        
    }
    
    void removeStudent()
    {
        
        System.out.println("Enter the School Student Name : ");
        Student.remove(sc.next());
        
    }
    void removeTeacher()
    {
        System.out.println("Enter the School Teacher Name : ");
        Teacher.remove(sc.next());
        
    }
    void removeClass()
    {
        System.out.println("Enter the School Class Rooms : ");
        Class.remove(sc.next());
        
    }
    
    
    
    void Show()
    {
        System.out.println("School students list : "+Student);
        System.out.println("School teachers list : "+Teacher);
        System.out.println("School classes list : "+Class);
    }
    public static void main(String[] args)
    {
    
        School doit = new School();
        do {
            System.out.println("\t-*-*-*-ADD/REMOVE REVIEW-*-*-*-");
            System.out.println(
                    "ADD (press 1) / DELETE (press 2) / VIEW DETAILS (press 3) ");

            int input = sc.nextInt();

            if (input == 1) {
                System.out.println(" Add Student (press 1) / Add Teacher (press 2) / Add Class (Press 3    )");
                val = sc.nextInt();
                if(val == 1)
                {
                    doit.addStudent();    
                }
                else if(val == 2)
                {
                    doit.addTeacher();    
                }
                else if(val ==3)
                {
                    doit.addClass();
                }
                else
                {
                    
                System.out.println("Plz choose 1 to 4");
                }
                
            } else if (input == 2) {
                
                System.out.println(" Remove Student (press 1) / Remove Teacher (press 2) / Remove Class (Press 3)");
                val = sc.nextInt();
                if(val == 1)
                {
                    doit.removeStudent();    
                }
                else if(val == 2)
                {
                    doit.removeTeacher();    
                }
                else if(val ==3)
                {
                    doit.removeClass();
                }
                else
                {
                    
                        System.out.println("Plz choose 1 to 4");
                }
            }

            else if (input == 3) {
                doit.Show();

            } 
            else {
                System.out.println("Plz choose 1 to 4");
            }
            System.out.println("Do you want to repeat ?(press s)");
            choice = sc.next().charAt(0);
        }while(choice =='s');

    }

}