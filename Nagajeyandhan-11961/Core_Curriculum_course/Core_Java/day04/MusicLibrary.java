package com.jeyandhan.day04;

import java.util.*;

public class MusicLibrary {

	ArrayList<String> song = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);

	void AddSong() {
		System.out.println("Enter Song you want to add :");
		song.add(sc.next());
	}

	void RemoveSong() {
		System.out.println("Enter Song want to remove :");
		song.remove(sc.nextLine());

	}

	void PlayRandomSong() {
		for (int i = 0; i < song.size(); i++) {

			int index = (int) (Math.random() * song.size());

			System.out.println("Random Song is " + song.get(index) + " now playing ");

		}

	}

	public static void main(String[] args) {

		MusicLibrary play = new MusicLibrary ();
		int input;
		char choice;
		do {
			System.out.println("\t-*-*-*-ADD/REMOVE SONG-*-*-*-");
			System.out.println("Add song press 1 / Delete song press 2 / Play random song press 3");

			input = sc.nextInt();

			if (input == 1) {
				play.AddSong();
			} else if (input == 2) {
				play.RemoveSong();
			}

			else if (input == 3) {
				play.PlayRandomSong();
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

