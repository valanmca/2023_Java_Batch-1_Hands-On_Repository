//Java Program to create MusicLibrary class with addSong,removeSong and playSong methods.

package com.sara.CoreJava.Day_04;

import java.util.Scanner;
import java.util.ArrayList;

class MusicLibrary {
	ArrayList<String> My_Playlist = new ArrayList<String>();

	void addSong(String Song) {

		My_Playlist.add(Song);
		System.out.println("*" + Song + "*" + " song is added to your playlist");
		// System.out.println(My_Playlist);
		System.out.println(" ");
	}

	void removeSong(String Song) {
		My_Playlist.remove(Song);
		System.out.println("*" + Song + "*" + " song is removed from your playlist");
		// System.out.println(My_Playlist);
		System.out.println(" ");
	}

	void showPlaylist() {
		System.out.println(My_Playlist);
		System.out.println(" ");
	}

	void playSong() {
		System.out.println("Now Playing : <------- " + My_Playlist.get(0) + " ------->");
		System.out.println(" ");

	}
}

public class Assignment_06 {

	public static void main(String[] args) {

		MusicLibrary music = new MusicLibrary();
		music.addSong("Badass");
		music.addSong("Hukum");
		music.addSong("Once upon a time");

		music.showPlaylist();

		music.playSong();

		music.removeSong("Hukum");

	}

}
