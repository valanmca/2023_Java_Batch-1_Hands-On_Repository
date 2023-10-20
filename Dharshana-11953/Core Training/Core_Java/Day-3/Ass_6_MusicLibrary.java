package com.dharshu.day3;

import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {
	 private ArrayList<Song> songs;

	 public MusicLibrary() {
	 songs = new ArrayList<>();
	 }

	 public void addSong(Song song) {
	 songs.add(song);
	 }

	 public void removeSong(Song song) {
	 songs.remove(song);
	 }

	 public void playRandomSong() {
	 if (songs.isEmpty()) {
	 System.out.println("No songs in the library.");
	 } else {
	 Random random = new Random();
	 Song randomSong = songs.get(random.nextInt(songs.size()));
	 System.out.println("Now playing: " + randomSong);
	 }
	 }
	 }

	 class Song {
	 private String title;
	 private String artist;
	 private int duration;

	 public Song(String title, String artist, int duration) {
	 this.title = title;
	 this.artist = artist;
	 this.duration = duration;
	 }

	 @Override
	 public String toString() {
	 return title + " by " + artist + " (" + duration + " seconds)";
	 }
	 }


public class Ass_6_MusicLibrary {

	public static void main(String[] args) {
		MusicLibrary library = new MusicLibrary();

		 Song song1 = new Song("Song 1", "Artist 1", 200);
		 Song song2 = new Song("Song 2", "Artist 2", 250);
		 Song song3 = new Song("Song 3", "Artist 3", 300);

		 library.addSong(song1);
		 library.addSong(song2);
		 library.addSong(song3);
		 
		 library.removeSong(song3);
		 library.removeSong(song2);
		 //library.removeSong(song1);

		 library.playRandomSong();
	}

}
