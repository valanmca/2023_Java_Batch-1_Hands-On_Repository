package com.jeban.Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

class MusicLibrary {
    ArrayList<String> Songs = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    void addSongs() {
        System.out.println("Enter no of Songs Added : ");
        int n = sc.nextInt();
        System.out.println("Add Songs : ");
        for (int i = 0; i < n; i++) {
            Songs.add(sc.next());
        }
    }

    void removeSongs() {
        System.out.println("Enter no of Songs Removed : ");
        int n = sc.nextInt();
        System.out.println("Remove Songs : ");
        for (int i = 0; i < n; i++) {
            Songs.remove(sc.next());
        }
    }

    void display() {
        System.out.println("Collections of Books : " + Songs);
    }

    void RandomSong() {
        int size = Songs.size();
     if (size == 0) {
     System.out.println("No songs in the library.");
     return;
     }
     else {
            System.out.println("//Now playing ... // " + " ~~~ "+ Songs.get(0) + " ~~~ ");
        }

    }
}

public class Music {

    public static void main(String[] args) {
        MusicLibrary music = new MusicLibrary();
        music.addSongs();
        music.removeSongs();
        music.display();
        music.RandomSong();

    }

}