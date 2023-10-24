/*
 * Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews,
 
 * and methods for adding and retrieving reviews.
 */
package com.gayathri.day4;
import java.util.ArrayList;
import java.util.Scanner;

class MovieOops {

    public String title, directors, actors, review;
    static char choice;
    int index;
    public ArrayList<String> review_list = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);

    void add_details() {
        System.out.print("\nEnter the Movie Name : ");
        title = sc.nextLine();
        System.out.print("\nEnter the Movie Directors : ");
        directors = sc.next();
        System.out.print("\nEnter the Movie Actor Name : ");
        actors = sc.next();
        
        System.out.print("\nEnter the Movie Review : ");
        review_list.add(review = sc.next());
    }

    void add_review() {
        System.out.print("\nAdd review");
        System.out.println("\nEnter the review : ");
        review_list.add(review = sc.next());
    }

    void remove_review() {
        System.out.print("\nRemove review");
        System.out.print("\nEnter the review :");
        review_list.remove(sc.next());
    }

    void Show() {
        System.out.println("\nMovie Name	: " + title);
        System.out.println("Director Name	: " + directors);
        System.out.println("Actor Name	: " + actors);
        System.out.println("Review		: " + review_list);

    }

    public class MovieProgram {

        public static void main(String[] args) {
            MovieOops mov = new MovieOops();
            char change;
            System.out.println("\nEnter the movie details.....");
            mov.add_details();

            do {
                System.out.println("\n---------Press the Number to get Details------------- ");
                System.out.println("\nPress 1 to add review\nPress 2 to remove review\nPress 3 to show details\n\nEnter your choice : ");
                int input = sc.nextInt();
                if (input == 1) {
                    mov.add_review();
                } else if (input == 2) {
                    mov.remove_review();
                } else if (input == 3) {
                    mov.Show();
                } else {
                    System.out.println("Press no 4");
                }
                System.out.println("Press 's' to repeat : ");
                change = sc.next().charAt(0);

            } while (change == 's' || change == 'S');
        }

    }
    }

