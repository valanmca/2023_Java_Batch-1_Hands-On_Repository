package com.mahesh.core_java_day_04;

import java.util.*;

public class MusicLibrary {

	ArrayList<String> Song = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);

	void Add_Song() {
		System.out.println("Enter Song you want to add :");
		Song.add(sc.next());
	}

	void Remove_Song() {
		System.out.println("Enter Song want to remove :");
		Song.remove(sc.nextLine());

	}

	void Play_RandomSong() {
		for (int i = 0; i < Song.size(); i++) {

			int index = (int) (Math.random() * Song.size());

			System.out.println("Random Song is " + Song.get(index) + " now playing ");
			

		}

	}

	public static void main(String[] args) {

		MusicLibrary play = new MusicLibrary();
		int input;
		char choice;
		do {
			System.out.println("\t-*-*-*-ADD/REMOVE SONG-*-*-*-");
			System.out.println("Add song press 1 / Delete song press 2 / Play random song press 3");

			input = sc.nextInt();

			if (input == 1) {
				play.Add_Song();
			} else if (input == 2) {
				play.Remove_Song();
			}

			else if (input == 3) {
				play.Play_RandomSong();
			}

			else {
				System.out.println("Plz choose 1 to 3");
			}
			System.out.println(" ");
			System.out.println("Do you want to repeat ?(press s)");
			choice = sc.next().charAt(0);
		} while (choice == 's');

	}

}
