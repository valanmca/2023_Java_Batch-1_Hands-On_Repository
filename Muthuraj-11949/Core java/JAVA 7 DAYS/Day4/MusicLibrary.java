package Day4;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MusicLibrary {
 private List<String> songs;

 public MusicLibrary() {
 this.songs = new ArrayList<>();
 }

 public void addSong(String songTitle) {
 songs.add(songTitle);
 }

 public void removeSong(String songTitle) {
 songs.remove(songTitle);
 }

 public void playRandomSong() {
 if (songs.isEmpty()) {
 System.out.println("No songs in the library.");
 } else {
 Random random = new Random();
 int randomIndex = random.nextInt(songs.size());
 String randomSong = songs.get(randomIndex);
 System.out.println("Playing random song: " + randomSong);
 }
 }

 public void displayLibrary() {
 System.out.println("Music Library:");
 for (String song : songs) {
 System.out.println(song);
      }
     }
  }
public class MusicLibrary{
 public static void main(String[] args) {
 MusicLibrary musicLibrary = new MusicLibrary();
  

 musicLibrary.addSong("Song 1");
 musicLibrary.addSong("Song 2");
 musicLibrary.addSong("Song 4");

 musicLibrary.displayLibrary();

 musicLibrary.playRandomSong();

 musicLibrary.removeSong("Song 2");

 System.out.println("After removing Song 2:");
 musicLibrary.displayLibrary();
 
 }
}

